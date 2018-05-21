package fr.applirv.vues;

import java.awt.CardLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.*;

import fr.applirv.controleurs.ControleurAppRv;
import fr.applirv.entites.RapportVisite;


public class VueAppRV extends JFrame{
	
	// Création du controleur ControleurAppRv
	private ControleurAppRv controleur;
	
	// Les menus
	private JMenu menuFichier    = new JMenu("Fichier") ;	
	private JMenu menuAide 	     = new JMenu("Aide") ;
	private JMenu menuRV         = new JMenu("Visiteurs");
	private JMenu menuPraticiens = new JMenu("Praticiens");
	
	// Création des JMenuItem
	private JMenuItem itemSeConnecter = new JMenuItem				("Se connecter");
	private JMenuItem itemSeDeconnecter = new JMenuItem				("Se déconnecter");
	private JMenuItem itemQuitter= new JMenuItem					("Quitter");
	private JMenuItem itemVisualiserRV = new JMenuItem				("Lister");
	private JMenuItem itemApropos = new JMenuItem					("A Propos... ");
	private JMenuItem itemPraticiensCoeffConfiance = new JMenuItem	("Lister par coefficient de confiance (croissant)");
	private JMenuItem itemPraticiensTemps = new JMenuItem			("Lister en fonction du temps écoulé depuis la dernière visite (décroissant)");
	private JMenuItem itemPraticiensCoeffNotoriete = new JMenuItem	("Lister par coefficient de notoriété (décroissant)");
	
	//les vues 
	private CardLayout clVues = new CardLayout(0,0) ;
	private VueAccueil vueAccueil = new VueAccueil();
	private VueListeVisiteurs vueListeVisiteurs = new VueListeVisiteurs();
	private VueListePraticiens vueListePraticiensCoeffConf = new VueListePraticiens(1);
	private VueListePraticiens vueListePraticiensDate = new VueListePraticiens(2);
	private VueListePraticiens vueListePraticiensCoeffNot = new VueListePraticiens(3);

	
	public VueAppRV(){

		super();
		
		// Donne un titre à la fenêtre
		this.setTitle("AppRv") ;
		
		// Définit le largeur et la hauteur de la fenêtre
		this.setSize(900,600) ;
		
		// Positionne la fenêtre au centre de l'écran
		this.setLocationRelativeTo(null) ;
		
		// Empêche l'utilisateur de fermer la fenêtre à l'aide de la croix
		// qui se trouve en haut à droite
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		// Empêche le redimensionnement par l'utilisateur
		this.setResizable(false);
		
		// Crée la barre de menus
		this.creerBarreMenus();
		
		//mettre la barre en mode non connecté 
		this.setBarreMenusModeDeconnecte();
	
		
		//gestionnaire d'agencement
		Container conteneur = this.getContentPane();
		conteneur.setLayout(clVues);
		
	
		conteneur.add(vueAccueil , "Accueil");
		conteneur.add(vueListeVisiteurs , "vueListeVisiteurs");
		conteneur.add(vueListePraticiensCoeffConf , "vueListePraticiensCoeffConf");
		conteneur.add(vueListePraticiensDate , "vueListePraticiensDate");
		conteneur.add(vueListePraticiensCoeffNot , "vueListePraticiensCoeffNot");
		
		
		this.clVues.show(conteneur , "Accueil");
		//
		this.controleur = new ControleurAppRv(this);
				
		
		// Affiche la fenêtre
		this.setVisible(true);
	}
	
	public Container getConteneur(){
		Container conteneur = this.getContentPane();
		conteneur.setLayout(clVues);
		return conteneur;
	}
	
	
	public VueListePraticiens getVueListePraticiensCoeffConf() {
		return vueListePraticiensCoeffConf;
	}

	public void setVueListePraticiensCoeffConf(VueListePraticiens vueListePraticiensCoeffConf) {
		this.vueListePraticiensCoeffConf = vueListePraticiensCoeffConf;
	}

	public VueListePraticiens getVueListePraticiensDate() {
		return vueListePraticiensDate;
	}

	public void setVueListePraticiensDate(VueListePraticiens vueListePraticiensDate) {
		this.vueListePraticiensDate = vueListePraticiensDate;
	}

	public VueListePraticiens getVueListePraticiensCoeffNot() {
		return vueListePraticiensCoeffNot;
	}

	public void setVueListePraticiensCoeffNot(VueListePraticiens vueListePraticiensCoeffNot) {
		this.vueListePraticiensCoeffNot = vueListePraticiensCoeffNot;
	}

	public VueAccueil getVueAccueil() {
		return vueAccueil;
	}

	public void setVueAccueil(VueAccueil vueAccueil) {
		this.vueAccueil = vueAccueil;
	}

	

	private void creerBarreMenus(){
		//Menus qui contiendra tout
		JMenuBar barreMenus = new JMenuBar();
		
		//ajout des items
		this.menuFichier.add(this.itemSeConnecter);
		this.menuFichier.add(this.itemSeDeconnecter);
		this.menuFichier.add( new JSeparator() ) ; 
		this.menuFichier.add(this.itemQuitter);
		
		this.menuRV.add(this.itemVisualiserRV);
		
		this.menuAide.add(itemApropos);
		
		this.menuPraticiens.add(this.itemPraticiensCoeffConfiance);
		this.menuPraticiens.add(new JSeparator());
		this.menuPraticiens.add(this.itemPraticiensTemps);
		this.menuPraticiens.add(new JSeparator());
		this.menuPraticiens.add(this.itemPraticiensCoeffNotoriete);
		
		//ajout des dans la barre menus
		barreMenus.add(menuFichier);
		barreMenus.add(menuRV);
		barreMenus.add(menuPraticiens);
		barreMenus.add(menuAide);
		
		// Ajoute la barre de menus à la fenêtre
		this.setJMenuBar(barreMenus) ;
		
	}
	
	// Bascule la barre de menus dans le "Mode connecté"
	public void setBarreMenusModeConnecte(){

		// Désactive l'item de menu "Se connecter"
		this.itemSeConnecter.setEnabled(false) ;
		
		// Active l'item de menu "Se déconnecter"
		this.itemSeDeconnecter.setEnabled(true) ;
		
		
		// Active les menus "métiers"
		this.menuRV.setEnabled(true) ;
		this.menuPraticiens.setEnabled(true) ;

	}
	
	// Bascule la barre de menus dans le "Mode Non connecté"
	public void setBarreMenusModeDeconnecte(){
		
		// Active l'item de menu "Se connecter"
		this.itemSeConnecter.setEnabled(true) ;
		
		// Désactive l'item de menu "Se déconnecter"
		this.itemSeDeconnecter.setEnabled(false) ;
		
		// Désactive les menus "métiers"
		this.menuRV.setEnabled(false) ;
		this.menuPraticiens.setEnabled(false) ;
		
	}
	
	public void changerVue(String nomVue) {
		
		//mise en place gestionnaire agencement
		Container conteneur = this.getContentPane() ;
		
		this.clVues.show(conteneur,nomVue) ;

	}

	public ControleurAppRv getControleur() {
		return controleur;
	}

	public JMenuItem getItemSeConnecter() {
		return itemSeConnecter;
	}

	public JMenuItem getItemSeDeconnecter() {
		return itemSeDeconnecter;
	}

	public JMenuItem getItemQuitter() {
		return itemQuitter;
	}

	public JMenuItem getItemApropos() {
		return itemApropos;
	}

	public JMenuItem getItemVisualiserRV(){
		return itemVisualiserRV;
	}
	
	public JMenuItem getItemPraticiensCoeffConfiance(){
		return itemPraticiensCoeffConfiance;
	}
	
	public JMenuItem getItemPraticiensTemps(){
		return itemPraticiensTemps;
	}
	
	public JMenuItem getItemPraticiensCoeffNotoriete(){
		return itemPraticiensCoeffNotoriete;
	}
	
	public VueListeVisiteurs getVueListeVisiteurs() {
		return vueListeVisiteurs;
	}

	public void setVueListeVisiteurs(VueListeVisiteurs vueListeVisiteurs) {
		this.vueListeVisiteurs = vueListeVisiteurs;
	}
}
