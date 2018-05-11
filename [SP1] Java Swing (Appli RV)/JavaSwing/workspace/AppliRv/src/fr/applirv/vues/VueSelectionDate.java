package fr.applirv.vues;

import java.awt.*;

import javax.swing.*;

import fr.applirv.controleurs.ControleurBoutonSelectionnerDate;
import fr.applirv.controleurs.ControleurBoutonSelectionnerVisiteur;

public class VueSelectionDate extends JDialog {

	VueAppRV vueParente;
	
	//ControleurBoutonSelectionnerVisiteur controleur;
	ControleurBoutonSelectionnerDate controleurDate;
	
	
	
	/*private JTextField tfVisMatricule = new JTextField() ;
	private JPasswordField pfVisMdp = new JPasswordField();
	private JButton bConnecter = new JButton("Se connecter") ;
	private JButton bAnnuler = new JButton("Annuler") ;
	*/
	String[] elementsMois = new String[] {"...","01","02","03","04","05","06","07","08","09","10","11","12"};
	String[] elementsAnnee = new String[] {"...","2018","2017","2016","2015"};
	
	private JComboBox cbMois = new JComboBox(elementsMois);
	private JComboBox cbAnnee = new JComboBox(elementsAnnee);
	private JButton bRechercher = new JButton("Rechercher") ;
	private JButton bAnnuler = new JButton("Annuler") ;
	private JTextField tfMatricule;
	
	private String matriculeVisiteur;
	
	
	
	public VueSelectionDate (VueAppRV vueParente, String matricule){
		super(vueParente,"Selection de la date",true) ;
		
		this.matriculeVisiteur = matricule ; 
		// Appel du constructeur de la super-classe
		//	Troisième argument : true pour indiquer que la boîte de dialogue est modale 
		
		
		// Mémorise la vue parente qui est la fenêtre principale de l'application
		this.vueParente = vueParente ;
		
		this.matriculeVisiteur = matricule	;
		
		//creation de la page de recherche selection
		this.creationPageSelectionDate();
		// Redimensionne la boîte de dialogue (dimensions adaptées aux composants qui s'y trouvent)
		this.pack() ;
		
		// Positionne la boîte de dialogue au centre de l'écran
		this.setLocationRelativeTo(null) ;
		
		// Empêche le redimensionnement par l'utilisateur
		this.setResizable(false);
		
		// Crée le controleur associé et lui indique que le vue qui lui
		// est associée est elle-même
		this.controleurDate = new ControleurBoutonSelectionnerDate(this , matriculeVisiteur) ;
		
		// Affiche la boîte de dialogue
		//this.setVisible(true) ;
		//titre 
		
		
	}
	


	public void initialiser(){
		
		// VOTRE CODE : 
		// Afficher une chaîne de caractères vide dans les deux
		// champs de saisie (login et MDP)
		
		//this.cbAnnee.setToolTipText("");
		//this.cbMois.setToolTipText("");
		
	}
	
	private void creationPageSelectionDate(){
		
		Container conteneur = this.getContentPane();
		
		Box boxPrincipale = Box.createVerticalBox() ;
		Box boxChamps = Box.createHorizontalBox() ;
		Box boxEtiquettes = Box.createVerticalBox() ;
		Box boxCombo = Box.createVerticalBox() ;
		Box boxLigne = Box.createHorizontalBox() ;
		Box boxActions = Box.createHorizontalBox() ;
		Box boxMatricule = Box.createHorizontalBox() ; 
		
		
		
		
		tfMatricule = new JTextField(matriculeVisiteur);
		
		tfMatricule.setEditable(false);
		
		JLabel label = new JLabel("Matricule");
		boxEtiquettes.add(label);
		boxEtiquettes.add( Box.createVerticalStrut(18) ) ;
		boxEtiquettes.add(new JLabel("Mois")) ;
		boxEtiquettes.add( Box.createVerticalStrut(18) ) ;
		boxEtiquettes.add(new JLabel("Annee : ")) ;
		
		boxCombo.add( this.tfMatricule ) ;  
		boxCombo.add( Box.createVerticalStrut(10) ) ;
		boxCombo.add( this.cbMois) ;
		boxCombo.add( Box.createVerticalStrut(10) ) ;
		boxCombo.add( this.cbAnnee) ;
		
		boxLigne.add( Box.createHorizontalStrut( 10 ) ) ;
		boxLigne.add( new JSeparator() ) ;
		boxLigne.add( Box.createHorizontalStrut( 10 ) ) ;
		
		boxActions.add( Box.createHorizontalStrut( 10 ) ) ;
		boxActions.add( this.bRechercher ) ;
		boxActions.add( Box.createHorizontalStrut( 10 ) ) ;
		boxActions.add( this.bAnnuler ) ;
		boxActions.add( Box.createHorizontalStrut( 10 ) ) ;
		
		boxChamps.add( boxMatricule);
		boxChamps.add( Box.createHorizontalStrut( 10 ) ) ;
		boxChamps.add( boxEtiquettes ) ;
		boxChamps.add( Box.createHorizontalStrut( 10 ) ) ;
		boxChamps.add( boxCombo ) ;
		boxChamps.add( Box.createHorizontalStrut( 10 ) ) ;
		
		boxPrincipale.add( Box.createVerticalStrut( 10 ) ) ;
		boxPrincipale.add( boxChamps ) ;
		boxPrincipale.add( Box.createVerticalStrut( 10 ) ) ;
		boxPrincipale.add( boxLigne ) ;
		boxPrincipale.add( Box.createVerticalStrut( 10 ) ) ;
		boxPrincipale.add( boxActions ) ;
		boxPrincipale.add( Box.createVerticalStrut( 10 ) ) ;
		
		conteneur.add(boxPrincipale) ;
		


		
		
	}


	public void setCbMois(JComboBox cbMois) {
		this.cbMois = cbMois;
	}



	public void setCbAnnee(JComboBox cbAnnee) {
		this.cbAnnee = cbAnnee;
	}



	public void setbRechercher(JButton bRechercher) {
		this.bRechercher = bRechercher;
	}



	public void setbAnnuler(JButton bAnnuler) {
		this.bAnnuler = bAnnuler;
	}



	public void setMatriculeVisiteur(String matriculeVisiteur) {
		this.matriculeVisiteur = matriculeVisiteur;
	}



	public JComboBox getCbMois() {
		return cbMois;
	}


	public JComboBox getCbAnnee() {
		return cbAnnee;
	}


	public JButton getbRechercher() {
		return bRechercher;
	}


	public JButton getbAnnuler() {
		return bAnnuler;
	}
	
	public String getMatriculeVisiteur() {
		return matriculeVisiteur;
	}

}
