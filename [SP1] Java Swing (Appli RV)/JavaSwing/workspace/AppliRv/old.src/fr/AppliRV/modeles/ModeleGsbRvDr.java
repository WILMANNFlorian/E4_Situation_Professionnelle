package fr.AppliRV.modeles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import fr.AppliRV.entites.RapportVisite;
import fr.AppliRV.entites.Visiteur;
import fr.AppliRV.technique.ConnexionBD;
import fr.AppliRV.technique.ConnexionException;
import fr.AppliRV.technique.TablePanel;

public class ModeleGsbRvDr {

	
	
	
	public boolean seConnecter( String matricule, String mdp) throws Exception{
		
		//Récupère une connexion à la base de données
		
		Connection connexion = ConnexionBD.getConnexion();
		
		//Chaîne réprésentant la requête
		
		String requete ="SELECT * " 
						+ "FROM VISITEUR " 
						+ "WHERE VIS_MATRICULE = ? " 
						+ "AND VIS_PASSWORD = ? ;" ;
	
		//Prépare la requête
		
		PreparedStatement requetePreparee = (PreparedStatement) connexion .prepareStatement(requete) ;
		
		//Remplace, dans la requête, le premier "?" par le pseudo reçu en argument
		
		requetePreparee.setString(1, matricule);
		
		//Remplace, dans la requête, le second "?" par le mot de passe reçu en argument
		
		requetePreparee.setString(2, mdp);
		
		//Exécute la requête
		//Requête de consultation (SELECT) donc... executeQuery()
		//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
		
		ResultSet resultat = requetePreparee.executeQuery() ;
	
		boolean connexionOK ;
		
		
		//Lit la première ligne de résultat et teste la test
		
		if(resultat.next()){
			//S'il y a qqchose à lire, c'est que la requête a retourné un tuple qui correspond au visiteur
			connexionOK = true;
		}
		
		else{
			//S'il n'y a rien à lire, c'est que la requête n'a rien retourné donc pas de visiteur avec ce matricule/mdp
			connexionOK = false;
		}
		
		
		//Libère la ressource associée à la requête préparée
		
		requetePreparee.close();
		
		return connexionOK ;		
	}
	
	
	
	public JTable listVisiteursJTable() throws Exception{
		
		
		Connection connexion = ConnexionBD.getConnexion();

		Statement statement = connexion.createStatement();
		
		
		String requete = "Select VIS_NOM, VIS_PRENOM, SEC_CODE, LAB_CODE "
						+ "From VISITEUR ";
		
		ResultSet resultat = statement.executeQuery(requete);
		
        ResultSetTableModel rtm = new ResultSetTableModel( resultat );
        
        JTable tablePanel = new JTable(rtm);
        
        //TablePanel tablePanel = new TablePanel( rtm );
		
        
        if(resultat != null){
			return tablePanel;
		}
		else{
			System.out.println("Erreur listVisiteurs");
			return null;
		}
   
	}
	
	public List<Visiteur> listVisiteur() throws Exception{ //      CONTINUER ICI
		
		List<Visiteur> listV = new ArrayList();
		
		Connection connexion = ConnexionBD.getConnexion();

		Statement statement = connexion.createStatement();
		
		
		String requete = "Select VIS_NOM, VIS_PRENOM, SEC_CODE, LAB_CODE, VIS_MATRICULE "
						+ "From VISITEUR ";
		
		ResultSet resultat = statement.executeQuery(requete);
		
		while (resultat.next()){
			Visiteur unVisiteur = new Visiteur();
			unVisiteur.setMatriculeV(resultat.getString("VIS_MATRICULE"));
			unVisiteur.setAdrV(resultat.getString("VIS_ADRESSE"));
			unVisiteur.setCpV(resultat.getString("VIS_CP"));
			unVisiteur.setNomV(resultat.getString("VIS_NOM"));
			unVisiteur.setPrenomV(resultat.getString( "VIS_PRENOM" ));
			unVisiteur.setSecCodeV(resultat.getString( "SEC_CODE" ));
			unVisiteur.setLabCodeV(resultat.getString( "LAB_CODE" ));
			
			listV.add(unVisiteur);
		}
		
		return listV;
	}
    
	
	
	
	public JTable listRapportVisiteur(String matriculeV, int moisR, int anneeR) throws Exception{
			
			String mois = String.valueOf(moisR);
			String annee = String.valueOf(anneeR);
			
			
			Connection connexion = ConnexionBD.getConnexion();
			

			String requete = "Select PRA_NOM, PRA_VILLE, RAP_DATE, RAP_DATE_REDAC "
							+ "From RAPPORT_VISITE inner join PRATICIEN "
							+ "On RAPPORT_VISITE.PRA_NUM = PRATICIEN.PRA_NUM "
							+ "Where VIS_MATRICULE = ? "
							+ "And RAP_DATE like ? "
							+ "And RAP_DATE like ?";

			PreparedStatement requetePreparee = (PreparedStatement) connexion .prepareStatement(requete) ;
			
			requetePreparee.setString(1, matriculeV);
			requetePreparee.setString(2, "'%%%%-" + mois + "-%%'");
			requetePreparee.setString(3, "'" + annee + "'-%%-%%'");
			
			ResultSet resultat = requetePreparee.executeQuery() ;

			ResultSetTableModel rtm = new ResultSetTableModel( resultat );
	        
	        JTable tablePanel = new JTable( rtm );
			
	        
			if(tablePanel != null){
				
				return tablePanel;
			}
			else{
				System.out.println("Erreur listRapportVisiteur");
				return null;
			}
		}
		
	
	
	
	public JTable RapportVisiteur(int rapNum) throws Exception{

		
		Connection connexion = ConnexionBD.getConnexion();		
		
		String requete = "Select R.RAP_NUM, R.VIS_MATRICULE, R.PRA_NUM, R.RAP_BILAN, R.RAP_DATE, R.RAP_DATE_REDAC, R.RAP_COEF_CONFIANCE, R.RAP_INDICE_CONVAINCU, R.RAP_LU, R.MOT_ID, O.MED_DEPOTLEGAL, O.OFF_QTE "
						+ "From RAPPORT_VISITE R inner join OFRRIR O "
						+ "On R.RAP_NUM = O.RAP_NUM "
						+ "Where R.RAP_NUM = ?";

		
		PreparedStatement requetePreparee = (PreparedStatement) connexion .prepareStatement(requete) ;
		
		requetePreparee.setInt(1, rapNum);
		
		ResultSet resultat = requetePreparee.executeQuery() ;
		
		// if --> delegueG ? 
		
		String requeteLu = "Update RAPPORT_VISITE "
						 + "Set RAP_LU = 1 "
						 + "Where RAP_NUM = ?";
		
		PreparedStatement requetePrepareeLu = (PreparedStatement) connexion .prepareStatement(requeteLu) ;

		requetePrepareeLu.setInt(1, rapNum);
		
		int resultatLu = requetePrepareeLu.executeUpdate() ;
		
		
		ResultSetTableModel rtm = new ResultSetTableModel( resultat );
        
		JTable tablePanel = new JTable( rtm );
		//
		
		if(resultat != null){
			
			if(resultatLu != 0){
				
				return tablePanel;
			}
			else{
				System.out.println("Erreur RapportVisiteur:lu");
				return null;
			}
		}
		
		else{
			System.out.println("Erreur RapportVisiteur");
			return null;
		}
	}
	
	
	
	public JTable listPrat() throws Exception{
		
		Connection connexion = ConnexionBD.getConnexion();
		
		Statement statement = connexion.createStatement();
		
		
		String requete = "Select P.PRA_NOM, P.PRA_VILLE "
						+ "From PRATICIEN ";
		
		ResultSet res = statement.executeQuery(requete);
		
		ResultSetTableModel rtm = new ResultSetTableModel(res);
		
		JTable jtable = new JTable(rtm);
		
		if(res != null){
			
			return jtable;
		}
		else{
			System.out.println("Erreur listPrat");
			return null;
		}
	}
	
	
	public JTable listPratHesi() throws Exception{
		
		
		Connection connexion = ConnexionBD.getConnexion();

		Statement statement = connexion.createStatement();
		
		
		String requete = "Select P.PRA_NOM, P.PRA_VILLE "
						+ "From PRATICIEN P inner join RAPPORT_VISITE R "
						+ "On R.PRA_NUM = P.PRA_NUM "
						+ "Where R.RAP_INDICE_CONVAINCU < 6";

		
		ResultSet resultat = statement.executeQuery(requete);
		
		ResultSetTableModel rtm = new ResultSetTableModel( resultat );
        
		JTable tablePanel = new JTable( rtm );
		
		
		if(resultat != null){
			
			return tablePanel;
		}
		else{
			System.out.println("Erreur listPratHesi");
			return null;
		}
	
	}
	
	
	public boolean setMdpV(Visiteur vis, String mdp) throws Exception{
		
		boolean res = false;
		
		Connection connexion = ConnexionBD.getConnexion();
		Statement statement = connexion.createStatement();
		
		String requete = "Update VISITEUR "
				 + "Set VIS_PASSWORD = ? "
				 + "Where VIS_MATRICULE = ?";
		
		PreparedStatement requetePreparee = (PreparedStatement) connexion.prepareStatement(requete) ;

		requetePreparee.setString(2, vis.getMatriculeV());
		requetePreparee.setString(1, mdp);

		int resultat = requetePreparee.executeUpdate() ;
		
		if(resultat == 1){
			res = true;
		}
		
		return res;
	}
	
	
	public boolean aEteVu(int RapNum) throws Exception{
		
		Connection connexion = ConnexionBD.getConnexion();
		Statement statement = connexion.createStatement();
		
		String requete = "Select RAP_NUM "
						+ "From RAPPORT_VISITE "
						+ "Where RAP_LU = 1 AND RAP_NUM = ?";
		
		PreparedStatement requetePreparee = (PreparedStatement) connexion.prepareStatement(requete);
		
		String num = Integer.toString(RapNum); 
		
		requetePreparee.setString(1, num);
		
		ResultSet resultat = requetePreparee.executeQuery();
		
		if(resultat != null ){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	 public JTable allRapport() throws Exception{
		 
		//List<RapportVisite> resultat = new ArrayList<RapportVisite>();
		 
		Connection connexion = ConnexionBD.getConnexion();
		Statement statement = connexion.createStatement();
		
		String requete = "Select * From RAPPORT_VISITE";
		 
		ResultSet res = statement.executeQuery(requete);
		
		ResultSetTableModel rtm = new ResultSetTableModel(res);
		
		JTable jtable = new JTable(rtm);
		
		if(res != null){
			
			return jtable;
		}
		else{
			return null;
		}
		 		 
	 }
		
	
	
}
