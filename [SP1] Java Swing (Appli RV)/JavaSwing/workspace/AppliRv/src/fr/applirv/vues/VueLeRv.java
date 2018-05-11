package fr.applirv.vues;

import java.awt.Container;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import fr.applirv.entites.RapportVisite;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.technique.DateFr;

public class VueLeRv extends JDialog {
	
	//ArrayList<RapportVisite> lesRv ;
	
	VueAppRV vueParente ; 
	/*private ModeleListeRv modeleListeRv;
	private JTable tabRv ;*/
	private  String numRv;
	
	private RapportVisite leRv;
	private DateFr date;
	
	//private String matriculeVisiteur ;
	private String motif;
	private String prenomPra;
	private String nomPra ;
	private String numPra ;
	private String spePra ;
	private String bilan ;
	private String coefConf;
	private String visNom ;
	private String visPrenom ;
	/*String[] elementsMois = new String[] {"...","10","11","12"};
	String[] elementsAnnee = new String[] {"...","2017","2016","2015"};
	
	private JComboBox cbMois = new JComboBox(elementsMois);
	private JComboBox cbAnnee = new JComboBox(elementsAnnee);
	private JButton bRechercher = new JButton("Rechercher") ;
	private JButton bAnnuler = new JButton("Annuler") ;
	private JTextField tfMatricule;
	
	private String matriculeVisiteur;*/
	
	public VueLeRv( VueAppRV vueParente, String numRv ){
		super(vueParente,"Le Rapport n°"+numRv,true) ;
		// Appel du constructeur de la super-classe
		//	Troisième argument : true pour indiquer que la boîte de dialogue est modale 
				
		this.numRv = numRv;
		
		this.leRv = ModeleAppliRV.getModele().getLeRv(numRv);
		this.date = leRv.getDate();
		this.motif = leRv.getMotif();
		this.prenomPra = leRv.getPraticien().getPrenom();
		this.nomPra = leRv.getPraticien().getNom();
		this.numPra = leRv.getPraticien().getIdentifiant();
		this.spePra = leRv.getPraticien().getSpecialite();
		this.bilan = leRv.getBilan();
		this.coefConf = String.valueOf(leRv.getPraticien().getCoeffConfiance());
		this.visNom = leRv.getVisiteur().getVisNom();
		this.visPrenom = leRv.getVisiteur().getVisPrenom();
		
		// Mémorise la vue parente qui est la fenêtre principale de l'application
		this.vueParente = vueParente ;
		
		//creation de la page de recherche selection
		this.creationPageListeRv();
		// Redimensionne la boîte de dialogue (dimensions adaptées aux composants qui s'y trouvent)
		this.pack() ;
		
		// Positionne la boîte de dialogue au centre de l'écran
		this.setLocationRelativeTo(null) ;
		
		// Empêche le redimensionnement par l'utilisateur
		this.setResizable(false);
		
		// Crée le controleur associé et lui indique que le vue qui lui
		// est associée est elle-même
		//this.controleurDate = new ControleurBoutonSelectionnerDate(this , matriculeVisiteur) ;
		
		// Affiche la boîte de dialogue
		//this.setVisible(true) ;
		//titre 
		
		
		//modeleListeRv = new ModeleListeRv(lesRv);
	}
	
	private void creationPageListeRv() {
		
		Container conteneur = this.getContentPane();
		
		//box groupe
		Box boxPrincipale = Box.createVerticalBox() ;
		
		Box boxInfoVisiteur = Box.createHorizontalBox();
		Box boxEtiquetteV1 = Box.createVerticalBox();
		Box boxEtiquetteV2 = Box.createVerticalBox();
		Box boxEnTete = Box.createHorizontalBox();
		
		Box boxInfoRv = Box.createHorizontalBox();
		Box boxEtiquetteP = Box.createVerticalBox();
		Box boxChampRv = Box.createVerticalBox();
		
		//variable champ right
		


		

		
		//variable
		JLabel lblNom = new JLabel(visNom);
		JLabel lblPrenom = new JLabel(visPrenom);
		//
		boxEtiquetteV1.add(new JLabel("Nom : ")) ;
		boxEtiquetteV2.add(new JLabel("Prénom : "));
		
		Box boxLigne = Box.createHorizontalBox() ;
		
		
		//box info en haut de visiteur
		boxInfoVisiteur.add( Box.createHorizontalStrut( 10 ) ) ;
		boxInfoVisiteur.add(boxEtiquetteV1);
		boxInfoVisiteur.add( Box.createHorizontalStrut( 5 ) ) ;
		boxInfoVisiteur.add(lblNom);
		boxInfoVisiteur.add( Box.createHorizontalStrut( 20 ) ) ;
		boxInfoVisiteur.add(boxEtiquetteV2);
		boxInfoVisiteur.add( Box.createHorizontalStrut( 5 ) ) ;
		boxInfoVisiteur.add(lblPrenom);
		boxInfoVisiteur.add( Box.createHorizontalStrut( 10 ) ) ;

		
		//box etiquette
		boxEtiquetteP.add( Box.createVerticalStrut(10) ) ;
		boxEtiquetteP.add(new JLabel("Nom praticien: "));
		boxEtiquetteP.add( Box.createVerticalStrut(15) ) ;
		boxEtiquetteP.add(new JLabel("Prenom praticien: "));
		boxEtiquetteP.add( Box.createVerticalStrut(15) ) ;
		boxEtiquetteP.add(new JLabel("Numéro du praticien: "));
		boxEtiquetteP.add( Box.createVerticalStrut(15) ) ;
		boxEtiquetteP.add(new JLabel("Spécialité du praticien : "));
		boxEtiquetteP.add( Box.createVerticalStrut(10) ) ;
		boxEtiquetteP.add(new JLabel("Motif du rv : "));
		boxEtiquetteP.add( Box.createVerticalStrut(15) ) ;
		boxEtiquetteP.add(new JLabel("Bilan du rv : "));
		boxEtiquetteP.add( Box.createVerticalStrut(10) ) ;
		boxEtiquetteP.add(new JLabel("coefficient de confiance : "));
		boxEtiquetteP.add( Box.createVerticalStrut(10) ) ;
		
		
		
		
		JTextField tfNom = new JTextField(nomPra);
		
		JTextField tfPrenom = new JTextField(prenomPra);		
		JTextField tfNumPra = new JTextField(numPra);
		JTextField tfSpePra = new JTextField(spePra);
		JTextField tfMotif = new JTextField(motif);
		JTextField tfBilan = new JTextField(bilan);
		JTextField tfCoefConf = new JTextField(coefConf);
		
		tfNom.setEditable(false);
		tfPrenom.setEditable(false);
		tfNumPra.setEditable(false);
		tfSpePra.setEditable(false);
		tfMotif.setEditable(false);
		tfBilan.setEditable(false);
		tfCoefConf.setEditable(false);
		
		
		boxChampRv.add(tfNom);
		boxChampRv.add(tfPrenom);
		boxChampRv.add(tfNumPra);
		boxChampRv.add(tfSpePra);
		boxChampRv.add(tfMotif);
		boxChampRv.add(tfBilan);
		boxChampRv.add(tfCoefConf);
		
		boxEnTete.add(boxInfoVisiteur);
		/*boxInfoLeftRv.add(boxEtiquetteP);
		boxInfoRightRv.add(boxChampRv);
		*/
		boxInfoRv.add( Box.createHorizontalStrut(10) ) ;
		boxInfoRv.add(boxEtiquetteP);
		boxInfoRv.add(boxChampRv);
		boxInfoRv.add( Box.createHorizontalStrut(10) ) ;
		
		boxLigne.add( new JSeparator() ) ;
		
		boxPrincipale.add( Box.createVerticalStrut(10) ) ;
		boxPrincipale.add(boxEnTete) ;
		boxPrincipale.add( Box.createVerticalStrut(10) ) ;
		boxPrincipale.add(boxLigne) ;
		boxPrincipale.add( Box.createVerticalStrut(10) ) ;
		boxPrincipale.add(boxInfoRv);
		boxPrincipale.add( Box.createVerticalStrut(10) ) ;
		
		conteneur.add(boxPrincipale) ;
		


		
	}
	
}