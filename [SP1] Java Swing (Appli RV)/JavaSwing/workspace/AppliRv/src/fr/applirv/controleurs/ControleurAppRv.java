package fr.applirv.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import fr.applirv.vues.VueAppRV;
import fr.applirv.vues.VueAuthentification;
import fr.applirv.vues.VueListePraticiens;


public class ControleurAppRv implements ActionListener {


	private VueAppRV vue;
	

	public ControleurAppRv(VueAppRV vue){

		super();
		
		// Création de la vue VueAppRV
		this.vue = vue;
		
		// Exécute la méthode enregistrerEcouteur
		this.enregistrerEcouteur();

	}

	// Permet de se mettre à l'écoute des items de la vue VueAppRV
	private void enregistrerEcouteur(){

		// Se met à l'écoute de l'item de menu "Se connecter" de la vue VueAppRV
		this.vue.getItemSeConnecter().addActionListener(this) ;
		
		// Se met à l'écoute de l'item de menu "Se déconnecter" de la vue VueAppRV
		this.vue.getItemSeDeconnecter().addActionListener(this) ;
		
		// Se met à l'écoute de l'item de menu "Quitter" de la vue VueAppRV
		this.vue.getItemQuitter().addActionListener(this) ;

		// Se met à l'écoute de l'item de menu "Lister" de la vue VueAppRV
		this.vue.getItemVisualiserRV().addActionListener(this);
		
		// Se met à l'écoute de l'item de menu "A propos..." de la vue VueAppRV
		this.vue.getItemApropos().addActionListener(this) ;
		
		// Se met à l'écoute de l'item de menu "Lister par coefficient de confiance (croissant)" de la vue VueAppRV
		this.vue.getItemPraticiensCoeffConfiance().addActionListener(this);

		// Se met à l'écoute de l'item de menu "Lister en fonction du temps écoulé depuis la dernière visite (décroissant)" de la vue VueAppRV
		this.vue.getItemPraticiensTemps().addActionListener(this); 
		
		// Se met à l'écoute de l'item de menu "Lister par coefficient de notoriété (décroissant)" de la vue VueAppRV
		this.vue.getItemPraticiensCoeffNotoriete().addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {

		// Obtient le composant graphique source de l'événement ("clic")
		Object sourceEvenement = e.getSource() ;
		
		// Si la source est l'item de menu est "Se connecter"
		if( sourceEvenement == this.vue.getItemSeConnecter() ){
			this.seConnecter();
		}
		// Si la source est l'item de menu est "Se déconnecter"
		else if( sourceEvenement == this.vue.getItemSeDeconnecter() ){
			this.seDeconnecter();
		}
		// Si la source est l'item de menu est "Quitter"
		else if( sourceEvenement == this.vue.getItemQuitter() ){
			this.quitter();
		}
		// Si la source est l'item de menu est "A propos..."
		else if( sourceEvenement == this.vue.getItemApropos() ){
			this.afficherApropos();
		}
		// Si la source est l'item de menu est "Lister"
		else if (sourceEvenement == this.vue.getItemVisualiserRV()){
			this.vue.changerVue("vueListeVisiteurs");
		}
		// Si la source est l'item de menu est Lister par coefficient de confiance (croissant)"
		else if (sourceEvenement == this.vue.getItemPraticiensCoeffConfiance()){
			this.vue.changerVue("vueListePraticiensCoeffConf");
		}
		// Si la source est l'item de menu est Lister par coefficient de confiance (décroissant)"
		else if (sourceEvenement == this.vue.getItemPraticiensTemps()){
			this.vue.changerVue("vueListePraticiensDate");
		}
		// Se met à l'écoute de l'item de menu "Lister par coefficient de notoriété (décroissant)" de la vue VueAppRV
		else if (sourceEvenement == this.vue.getItemPraticiensCoeffNotoriete()){

			this.vue.changerVue("vueListePraticiensCoeffNot");

		}
	}
	

	private void seConnecter(){

		// Affiche la vue VueAuthentification
		new VueAuthentification(this.vue);

	}
	

	private void seDeconnecter(){

		// Affiche la fenetre "Déconnexion", demande à l'utilisateur "Voulez-vous vraiment vous déconnecter ?" 
		int reponse = JOptionPane.showConfirmDialog(this.vue, "Voulez-vous vraiment vous déconnecter ?","Déconnexion",JOptionPane.YES_NO_OPTION) ;
		
		// Si l'utilateur clique sur YES
		if( reponse == JOptionPane.YES_OPTION ){
				
			// Bascule la barre de menus dans le "Mode Non connecté"
			this.vue.setBarreMenusModeDeconnecte();
			this.vue.changerVue("Accueil");
			
			// Affiche la fenetre "Déconnexion" qui informe à l'utilisateur "Vous êtes maintenant déconnecté."
			JOptionPane.showMessageDialog(null, "Vous êtes maintenant déconnecté.","Déconnexion",JOptionPane.INFORMATION_MESSAGE) ;
		}
	}
	

	private void quitter(){

		// Demande confirmation à l'utilisateur au moyen d'une boîte de dialogue
		int reponse = JOptionPane.showConfirmDialog(this.vue, "Voulez-vous vraiment quitter ?","Quitter",JOptionPane.YES_NO_OPTION) ;
		
		// Si l'utilateur confirme...
		if( reponse == JOptionPane.YES_OPTION ){
			// Met fin à l'application
			System.exit(0) ;

		}
	}
	

	private void afficherApropos(){

		// Affiche la fenetre "A propos...".
		JOptionPane.showMessageDialog(this.vue, "GSB\n AppRv","À propos...",JOptionPane.INFORMATION_MESSAGE) ;
	}
}
