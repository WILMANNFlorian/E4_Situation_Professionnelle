package fr.applirv.vues;

import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

import fr.applirv.controleurs.ControleurBoutonSelectionnerDate;
import fr.applirv.controleurs.ControleurBoutonSelectionnerRv;
import fr.applirv.editeurs.EditeurBoutonSelectionnerRv;
import fr.applirv.editeurs.EditeurBoutonSelectionnerVisiteur;
import fr.applirv.entites.RapportVisite;
import fr.applirv.modeles.ModeleListeRv;
import fr.applirv.modeles.ModeleListeVisiteurs;
import fr.applirv.rendus.RenduBoutonSelectionnerRv;
import fr.applirv.rendus.RenduBoutonSelectionnerVisiteur;
import fr.applirv.rendus.RenduCelluleRapportVisite;
import fr.applirv.rendus.RenduCelluleVisiteur;
import fr.applirv.technique.DateFr;

public class VueListeRv extends JDialog{
	
	VueAppRV vueParente;
	
	//ControleurBoutonSelectionnerVisiteur controleur;
	ControleurBoutonSelectionnerRv controleur;
	
	private ArrayList<RapportVisite> lesRv;
	private ModeleListeRv modeleListeRv;
	private JTable tabRv ;
	//String[] lesDonneesRv;
	
	public VueListeRv (VueAppRV vueParente, ArrayList<RapportVisite> lesRv){
		// Appel du constructeur de la super-classe
				//	Troisième argument : true pour indiquer que la boîte de dialogue est modale 
		super(vueParente,"Selection du rapport de visite à visualiser",true) ;
		
		//récupération des RV
		this.lesRv = lesRv ; 
		//this.lesDonneesRv = lesDonneesRv;
		
		
		// Mémorise la vue parente qui est la fenêtre principale de l'application
		this.vueParente = vueParente ;
				
		//creation de la page de recherche selection
		this.creationPageListeRv(lesRv);
		// Redimensionne la boîte de dialogue (dimensions adaptées aux composants qui s'y trouvent)
		this.pack() ;
		
		// Positionne la boîte de dialogue au centre de l'écran
		this.setLocationRelativeTo(null) ;
		
		// Empêche le redimensionnement par l'utilisateur
		this.setResizable(false);
		
		// Crée le controleur associé et lui indique que le vue qui lui
		// est associée est elle-même
		this.controleur = new ControleurBoutonSelectionnerRv(this , lesRv) ;
		
		// Affiche la boîte de dialogue
		//this.setVisible(true) ;
		//titre 
		
		//importer le modele
		this.modeleListeRv= new ModeleListeRv(lesRv) ;
		
		
	}
	
	public void initialiser(){
		
		// VOTRE CODE : 
		// Afficher une chaîne de caractères vide dans les deux
		// champs de saisie (login et MDP)
		
		//this.cbAnnee.setToolTipText("");
		//this.cbMois.setToolTipText("");
		
	}
	
	private void creationPageListeRv(ArrayList<RapportVisite> lesRv){
		
		Container conteneur = this.getContentPane();
		
		Box boxPrincipale = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTable = Box.createHorizontalBox() ;
		
		boxEtiquette.add( new JLabel( "Séléction d'un rapport de visite" ) ) ;
		
		// VOTRE CODE ICI - Question 6
		ModeleListeRv modeleListeRv = new ModeleListeRv(lesRv);
		tabRv = new JTable(modeleListeRv);
		
		this.tabRv.setRowHeight(30);
		
		JScrollPane spVisiteurs = new JScrollPane(this.tabRv);
		
		spVisiteurs.setPreferredSize(new Dimension(880,500));
		
		boxTable.add(spVisiteurs);
		
		//application du rendu de la vue
		this.tabRv.setDefaultRenderer(String.class, new RenduCelluleRapportVisite(lesRv));
		/*this.tabRv.setDefaultRenderer(DateFr.class, new RenduCelluleVisiteur());
		this.tabRv.setDefaultRenderer(Integer.class, new RenduCelluleVisiteur());
		this.tabRv.setDefaultRenderer(JButton.class, new RenduCelluleVisiteur());*/
		//application du rendu du bouton
		this.tabRv.getColumn("Voir RV").setCellRenderer(new RenduBoutonSelectionnerRv(lesRv));
		//application de l'éditeur du bouton
		this.tabRv.getColumn("Voir RV").setCellEditor(new EditeurBoutonSelectionnerRv(this,lesRv));
		
		boxPrincipale.add( boxEtiquette ) ;
		boxPrincipale.add( boxTable ) ;
		
		
		conteneur.add(boxPrincipale) ;
		


		
		
	}
	
	

}
