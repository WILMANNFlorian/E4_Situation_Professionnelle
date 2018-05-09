package fr.applirv.modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import fr.applirv.entites.Praticien;
import fr.applirv.entites.RapportVisite;
import fr.applirv.entites.Visiteur;
import fr.applirv.technique.ConnexionBD;
import fr.applirv.technique.ConnexionException;
import fr.applirv.technique.DateFr;

public class ModeleAppliRV {
	
	private static ModeleAppliRV modele = null ;
	
	
	
	//Creation d'une Liste des Visiteurs de la classe Visiteur
	ArrayList<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
	ArrayList<RapportVisite> lesRapportsVisite = new ArrayList<RapportVisite>();
	ArrayList<Praticien> lesPraticiensCoeffNot = new ArrayList<Praticien>();
	ArrayList<Praticien> lesPraticiensCoeffConf = new ArrayList<Praticien>();
	ArrayList<Praticien> lesPraticiensDate = new ArrayList<Praticien>();
	
	
	/** Constructeur
	 * 
	 */
	ModeleAppliRV(){
		super() ;
		
		this.peupler() ;
	}
	
	// Implémentation du DP Singleton (méthode)
	
	private void peupler() {
		
		try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			
			

			//Creation Du Statement de la requete
			Statement requeteStatement = connexion.createStatement();
			
			
			//Chaîne représentant la requête
			
			String requeteVisiteur = "SELECT * FROM VISITEUR";
			
			
			//Exécute la requête
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			ResultSet resultatVisiteur = requeteStatement.executeQuery(requeteVisiteur) ;
			
			
			// Si récup données alors étapes 5 (parcours Resultset)
			
			
			//Tant quil existereste des Visiteurs
			while (resultatVisiteur.next()) {
				//System.out.println(resultat.getString("VIS_DATEEMBAUCHE"));
				
				//Transformation de la dateSQL en une DateFr
				DateFr dateEmbauche = new DateFr(resultatVisiteur.getString("VIS_DATEEMBAUCHE"));
				//Ajout du visteurs dans la listes des visiteurs
				this.lesVisiteurs.add(new Visiteur(resultatVisiteur.getString("VIS_MATRICULE"),
						resultatVisiteur.getString("VIS_MDP"),
						resultatVisiteur.getString("VIS_NOM"),
						resultatVisiteur.getString("VIS_PRENOM"),
						resultatVisiteur.getString("VIS_ADRESSE"),
						resultatVisiteur.getString("VIS_CP"),
						resultatVisiteur.getString("VIS_VILLE"),
						dateEmbauche,
						resultatVisiteur.getString("SEC_CODE"),
						resultatVisiteur.getString("LAB_CODE")
						)) ;
		       

				
			}
			
			
		
			} catch (SQLException | ConnexionException e) {
				//System.out.println(false);
				e.printStackTrace();
			} 
		//System.out.println(getLesVisiteurs());
		
		try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			//System.out.println("TEST1");
			

			//Creation Du Statement de la requete
			Statement requeteStatement = connexion.createStatement();
			//System.out.println("TEST2");
			
			//Chaîne représentant la requête
			
			//String requetePraticien = "SELECT *,AVG(rv.COEFCONFIANCE) as coefConf FROM PRATICIEN P"
			String requetePraticien = "SELECT *, AVG(rv.RAP_COEFCONFIANCE) as coefConf FROM PRATICIEN P"
					+ " INNER JOIN RAPPORT_VISITE rv ON P.PRA_NUM = rv.PRA_NUM"
					+ " INNER JOIN INVITER I ON P.PRA_NUM = I.PRA_NUM"
					+ " INNER JOIN ACTIVITE_COMPL AC ON I.AC_NUM = AC.AC_NUM"
					+ " INNER JOIN REALISER R ON R.AC_NUM = AC.AC_NUM"
					+ " INNER JOIN POSSEDER PO ON P.PRA_NUM = PO.PRA_NUM"
					+ " INNER JOIN SPECIALITE S ON S.SPE_CODE = PO.SPE_CODE"
					+ " GROUP BY P.PRA_NUM "
					+ " ORDER BY P.PRA_COEFNOTORIETE DESC ";
			
			
			//Exécute la requête
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			ResultSet resultatPraticien = requeteStatement.executeQuery(requetePraticien) ;
			
			
			// Si récup données alors étapes 5 (parcours Resultset)
			//System.out.println("TEST3");
			
			//Tant quil existereste des Visiteurs
			while (resultatPraticien.next()) {
				//System.out.println(resultat.getString("VIS_DATEEMBAUCHE"));
				
				//Transformation de la dateSQL en une DateFr
				DateFr dateVisite = new DateFr(resultatPraticien.getString("AC_DATE"));
				
				//Ajout du visteurs dans la listes des visiteurs
				this.lesPraticiensCoeffNot.add(new Praticien(resultatPraticien.getString("PRA_NUM"),
						resultatPraticien.getString("PRA_NOM"),
						resultatPraticien.getString("PRA_PRENOM"),
						resultatPraticien.getString("PRA_VILLE"),
						resultatPraticien.getFloat("PRA_COEFNOTORIETE"),
						resultatPraticien.getFloat("coefConf"),
						resultatPraticien.getString("SPE_LIBELLE"),
						dateVisite
						)) ;
		       

				
			}
			
			
		
			} catch (SQLException | ConnexionException e) {
				//System.out.println(false);
				e.printStackTrace();
			} 
		
		
		try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			//System.out.println("TEST1");
			

			//Creation Du Statement de la requete
			Statement requeteStatement = connexion.createStatement();
			//System.out.println("TEST2");
			
			//Chaîne représentant la requête
			
			String requetePraticien = "SELECT *,AVG(rv.RAP_COEFCONFIANCE) as coefConf FROM PRATICIEN P"
					+ " INNER JOIN RAPPORT_VISITE rv ON P.PRA_NUM = rv.PRA_NUM"
					+ " INNER JOIN INVITER I ON P.PRA_NUM = I.PRA_NUM"
					+ " INNER JOIN ACTIVITE_COMPL AC ON I.AC_NUM = AC.AC_NUM"
					+ " INNER JOIN REALISER R ON R.AC_NUM = AC.AC_NUM"
					+ " INNER JOIN POSSEDER PO ON P.PRA_NUM = PO.PRA_NUM"
					+ " INNER JOIN SPECIALITE S ON S.SPE_CODE = PO.SPE_CODE"
					+ " GROUP BY P.PRA_NUM "
					+ " ORDER BY AC.AC_DATE DESC";
			
			
			//Exécute la requête
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			ResultSet resultatPraticien = requeteStatement.executeQuery(requetePraticien) ;
			
			
			// Si récup données alors étapes 5 (parcours Resultset)
			//System.out.println("TEST3");
			
			//Tant quil existereste des Visiteurs
			while (resultatPraticien.next()) {
				//System.out.println(resultat.getString("VIS_DATEEMBAUCHE"));
				
				//Transformation de la dateSQL en une DateFr
				DateFr dateVisite = new DateFr(resultatPraticien.getString("AC_DATE"));
				//Ajout du visteurs dans la listes des visiteurs
				this.lesPraticiensDate.add(new Praticien(resultatPraticien.getString("PRA_NUM"),
						resultatPraticien.getString("PRA_NOM"),
						resultatPraticien.getString("PRA_PRENOM"),
						resultatPraticien.getString("PRA_VILLE"),
						resultatPraticien.getFloat("PRA_COEFNOTORIETE"),
						resultatPraticien.getFloat("coefConf"),
						resultatPraticien.getString("SPE_LIBELLE"),
						dateVisite
						)) ;
		       

				
			}
			
			
		
			} catch (SQLException | ConnexionException e) {
				//System.out.println(false);
				e.printStackTrace();
			} 
		
		try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			//System.out.println("TEST1");
			

			//Creation Du Statement de la requete
			Statement requeteStatement = connexion.createStatement();
			//System.out.println("TEST2");
			
			//Chaîne représentant la requête
			
			String requetePraticien = "SELECT *,AVG(rv.RAP_COEFCONFIANCE) as coefConf FROM PRATICIEN P"
					+ " INNER JOIN RAPPORT_VISITE rv ON P.PRA_NUM = rv.PRA_NUM"
					+ " INNER JOIN INVITER I ON P.PRA_NUM = I.PRA_NUM"
					+ " INNER JOIN ACTIVITE_COMPL AC ON I.AC_NUM = AC.AC_NUM"
					+ " INNER JOIN REALISER R ON R.AC_NUM = AC.AC_NUM"
					+ " INNER JOIN POSSEDER PO ON P.PRA_NUM = PO.PRA_NUM"
					+ " INNER JOIN SPECIALITE S ON S.SPE_CODE = PO.SPE_CODE"
					+ " GROUP BY P.PRA_NUM "
					+ " ORDER BY coefConf ASC";
			
			
			//Exécute la requête
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			ResultSet resultatPraticien = requeteStatement.executeQuery(requetePraticien) ;
			
			
			// Si récup données alors étapes 5 (parcours Resultset)
			//System.out.println("TEST3");
			
			//Tant quil existereste des Visiteurs
			while (resultatPraticien.next()) {
				//System.out.println(resultat.getString("VIS_DATEEMBAUCHE"));
				
				//Transformation de la dateSQL en une DateFr
				DateFr dateVisite = new DateFr(resultatPraticien.getString("AC_DATE"));
				//Ajout du visteurs dans la listes des visiteurs
				this.lesPraticiensCoeffConf.add(new Praticien(resultatPraticien.getString("PRA_NUM"),
						resultatPraticien.getString("PRA_NOM"),
						resultatPraticien.getString("PRA_PRENOM"),
						resultatPraticien.getString("PRA_VILLE"),
						resultatPraticien.getFloat("PRA_COEFNOTORIETE"),
						resultatPraticien.getFloat("coefConf"),
						resultatPraticien.getString("SPE_LIBELLE"),
						dateVisite
						)) ;
		       

				
			}
			
			
		
			} catch (SQLException | ConnexionException e) {
				//System.out.println(false);
				e.printStackTrace();
			} 
		
	}

	public static ModeleAppliRV getModele(){
		if( modele == null ){
			modele = new ModeleAppliRV() ;
		}
		return modele ;
	}
			
			
	public static boolean seConnecter( String matricule , String mdp) throws Exception {
		
		//Récupère une connexion à la base de données
		
		Connection connexion = ConnexionBD.getConnexion();
		
		//Chaîne représentant la requête
		
		String requete = "SELECT * FROM VISITEUR WHERE VIS_MATRICULE = ? AND VIS_MDP = ?";
		
		//Prépare la requête
		
		PreparedStatement requetePreparee = connexion.prepareStatement(requete);
		
		//Remplace, dans la requête, le premier  ? par le pseudo reçu en argument
		
		requetePreparee.setString(1, matricule);
		
		//Remplace le second ? par le mot de passe reçu en argument
		
		requetePreparee.setString(2, mdp);
		
		//Exécute la requête
		//Requête de consultation (SELECT) donc... executeQuery()
		//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
		
		ResultSet resultat = requetePreparee.executeQuery() ;
		
		boolean connexionOk;
		
		//lit la première ligne du résultat et teste si on obtient quelque chose
		
		if( resultat.next() ){
			
			//S'il y a qqchose à lire, c'est que la requête a retournée un tuple qui correspond au visiteur
			connexionOk = true ;
			
		}
		else{
			
			//Si rien à lire, requête n'a rien retourné. Donc pas de visiteur 
			//avec matricule et mdp correspondant
			
			connexionOk = false;
			
		}
		
		//Libère la ressource associé à la requête préparée
		
		requetePreparee.close();
		
		return connexionOk;
	}
	
	
	public List<Visiteur> getLesVisiteurs() {
		return lesVisiteurs;
	}
	
	public List<Praticien> getLesPraticiensCoeffNot() {
		return lesPraticiensCoeffNot;
	}
	
	public List<Praticien> getLesPraticiensCoeffConf() {
		return lesPraticiensCoeffConf;
	}
	
	public List<Praticien> getLesPraticiensDate() {
		return lesPraticiensDate;
	}
	
	public List<RapportVisite> getLesRapports(String matricule, String annee, String mois) {
			
			try{	
				
				//Récupère une connexion à la base de données
				
				Connection connexion = ConnexionBD.getConnexion();
				//System.out.println("TEST1");
				
				
				//Chaîne représentant la requête
				
				String requeteRV = "SELECT * FROM VISITEUR v "
						+ " INNER JOIN RAPPORT_VISITE rv ON v.VIS_MATRICULE = rv.VIS_MATRICULE "
						+ " INNER JOIN PRATICIEN p ON rv.PRA_NUM = p.PRA_NUM"
						+ " INNER JOIN POSSEDER pos ON pos.PRA_NUM = p.PRA_NUM "
						+ " INNER JOIN SPECIALITE sp ON sp.SPE_CODE = pos.SPE_CODE"
						+ " WHERE rv.VIS_MATRICULE = ? AND RAP_DATE LIKE ? ";
				
				
				//Exécute la requête
				//Requête de consultation (SELECT) donc... executeQuery()
				//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
				
				//Prépare la requête
				
				PreparedStatement requetePreparee = connexion.prepareStatement(requeteRV);
				
				//Remplace, dans la requête, le premier  ? par le pseudo reçu en argument
				
				requetePreparee.setString(1, matricule);
				
				//Remplace le second ? par l'annee reçu en argument
				/*String annee = JOptionPane.showInputDialog( "Entrez l'année du rapport de visite : ");
				
				String mois = JOptionPane.showInputDialog("Entrez le mois du rapport de visite : ");
				
				if(Integer.parseInt(mois) < 1 || Integer.parseInt(mois) > 12){
					mois = JOptionPane.showInputDialog( "Les mois sont compris entre 1 et 12 inclus,\n réessayez : ");
				}*/
				
				requetePreparee.setString(2,annee+"-"+mois+"%");
				
				//Remplace le troisième ? pare mois reçu en argument
				
				
				//requetePreparee.setString(3, mois);
				
				//Exécute la requête
				
				ResultSet resultatRV = requetePreparee.executeQuery() ;
								
				//lit la première ligne du résultat et teste si on obtient quelque chose
				
				
				//if(  ){
					
					//Tant quil existereste des Visiteurs
					while (resultatRV.next()) {
						//System.out.println(resultat.getString("VIS_DATEEMBAUCHE"));
						
						//Transformation de la dateSQL en une DateFr
						DateFr dateRV = new DateFr(resultatRV.getString("RAP_DATE"));
						//Ajout du visteurs dans la listes des visiteurs
						this.lesRapportsVisite.add(new RapportVisite(
								new Visiteur(resultatRV.getString("VIS_MATRICULE"),
								resultatRV.getString("VIS_NOM"),
								resultatRV.getString("VIS_PRENOM")),
								new Praticien (resultatRV.getString("PRA_NUM"),
								resultatRV.getString("PRA_NOM"),
								resultatRV.getString("PRA_PRENOM"),
								resultatRV.getString("SPE_LIBELLE"),
								resultatRV.getFloat("PRA_COEFNOTORIETE"),
								resultatRV.getFloat("RAP_COEFCONFIANCE")),
								resultatRV.getString("RAP_NUM"),
								resultatRV.getString("RAP_BILAN"),
								resultatRV.getString("RAP_VU"),
								resultatRV.getString("RAP_MOTIF"),
								dateRV
								)) ;
				       

					}
					
				/*}
				else {
					//lesRapportsVisite = null;
				}*/
				
			
			
				} catch (SQLException | ConnexionException e) {
					//System.out.println(false);
					e.printStackTrace();
				} 
			//System.out.println(getLesVisiteurs());
			return lesRapportsVisite;
		}

	public boolean getVuRapportVisite(String numero) {
		
		boolean RvVue = false;
		
			try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			//System.out.println("TEST1");
			
			
			//Chaîne représentant la requête
			
			String requeteRV = "SELECT * FROM RAPPORT_VISITE"
					+ " WHERE RAP_NUM = ? ";
			
			
			//Exécute la requête
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			//Prépare la requête
			
			PreparedStatement requetePreparee = connexion.prepareStatement(requeteRV);
			
			//Remplace, dans la requête, le premier  ? par le pseudo reçu en argument
			
			requetePreparee.setInt(1, Integer.parseInt(numero));
			
			
			//Exécute la requête
			
			ResultSet resultatRV = requetePreparee.executeQuery() ;
							
			//lit la première ligne du résultat et teste si on obtient quelque chose
			while (resultatRV.next() && RvVue == false) {
				
				System.out.println(resultatRV.getString("RAP_VU"));
				RvVue = resultatRV.getString("RAP_VU").equals("oui");
					
				
				
			}
			System.out.println(RvVue);
		
			} catch (SQLException | ConnexionException e) {
				//System.out.println(false);
				e.printStackTrace();
			} 
		
		return RvVue;
	}
	
	
	public int setVuRapportVisite( String numero ) {
				
			int nbLigne = 0;
			
			try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			//System.out.println("TEST1");
			
			
			//Chaîne représentant la requête
			
			String requeteRV = "UPDATE RAPPORT_VISITE"
					+ " SET RAP_VU = 'oui' "
					+ " WHERE RAP_NUM = ? " ;
			
			
			//Exécute la requête
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			//Prépare la requête
			
			PreparedStatement requetePreparee = connexion.prepareStatement(requeteRV);
			
			//Remplace, dans la requête, le premier  ? par le pseudo reçu en argument
			
			requetePreparee.setInt(1, Integer.parseInt(numero));
			
			
			//Exécute la requête
			
			nbLigne = requetePreparee.executeUpdate() ;
							
			//lit la première ligne du résultat et teste si on obtient quelque chose
			
			
			
		} catch (SQLException | ConnexionException e) {
			//System.out.println(false);
			e.printStackTrace();
		} 
	
	return nbLigne;
	}

	
	
	
	public RapportVisite getLeRv(String num) {
		
		RapportVisite leRapport = null;
		
		try{	
			
			//Récupère une connexion à la base de données
			
			Connection connexion = ConnexionBD.getConnexion();
			//System.out.println("TEST1");
			
			
			//Chaîne représentant la requête
			
			String requeteRV = "SELECT * FROM VISITEUR v "
					+ " INNER JOIN RAPPORT_VISITE rv ON v.VIS_MATRICULE = rv.VIS_MATRICULE "
					+ " INNER JOIN PRATICIEN p ON rv.PRA_NUM = p.PRA_NUM "
					+ " INNER JOIN POSSEDER pos ON pos.PRA_NUM = p.PRA_NUM "
					+ " INNER JOIN SPECIALITE sp ON sp.SPE_CODE = pos.SPE_CODE"
					+ " WHERE rv.RAP_NUM = ?";
			
			
			
			//Requête de consultation (SELECT) donc... executeQuery()
			//Puis, récupère le résultat (0 ou 1 tuple de la table VISITEUR)
			
			//Prépare la requête
			
			PreparedStatement requetePreparee = connexion.prepareStatement(requeteRV);
			
			//Remplace, dans la requête, le premier  ? par le pseudo reçu en argument
			
			requetePreparee.setInt(1, Integer.parseInt(num));
			
			
			
			//Exécute la requête
			
			ResultSet resultatRV = requetePreparee.executeQuery() ;
							
			//lit la première ligne du résultat et teste si on obtient quelque chose
			
			
			//if(  ){
				
				//Tant quil existereste des Visiteurs
				while (resultatRV.next()) {
					//System.out.println(resultat.getString("VIS_DATEEMBAUCHE"));
					
					//Transformation de la dateSQL en une DateFr
					DateFr dateRV = new DateFr(resultatRV.getString("RAP_DATE"));
					//Ajout du visteurs dans la listes des visiteurs
					leRapport = new RapportVisite(
							new Visiteur(resultatRV.getString("VIS_MATRICULE"),
							resultatRV.getString("VIS_NOM"),
							resultatRV.getString("VIS_PRENOM")),
							new Praticien (resultatRV.getString("PRA_NUM"),
							resultatRV.getString("PRA_NOM"),
							resultatRV.getString("PRA_PRENOM"),
							resultatRV.getString("SPE_LIBELLE"),
							resultatRV.getFloat("PRA_COEFNOTORIETE"),
							resultatRV.getFloat("RAP_COEFCONFIANCE")),
							resultatRV.getString("RAP_NUM"),
							resultatRV.getString("RAP_BILAN"),
							resultatRV.getString("RAP_VU"),
							resultatRV.getString("RAP_MOTIF"),
							dateRV
							);
	       

				}
				
			/*}
			else {
				//lesRapportsVisite = null;
			}*/
			
		
		
			} catch (SQLException | ConnexionException e) {
				//System.out.println(false);
				e.printStackTrace();
			} 
		//System.out.println(getLesVisiteurs());
		return leRapport;
	}

	
}
