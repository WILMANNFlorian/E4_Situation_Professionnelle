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
		
		//mémorise la vue associée
		this.vue = vue;
		
		//Se met à l'écoute des items de menu
		this.enregistrerEcouteur();
	}


	private void enregistrerEcouteur(){
		// Se met à l'écoute de l'item de menu "Se connecter"
		this.vue.getItemSeConnecter().addActionListener(this) ;
		
		// Se met à l'écoute de l'item de menu "Se déconnecter"
		this.vue.getItemSeDeconnecter().addActionListener(this) ;
		
		// Se met à l'écoute de l'item de menu "Quitter"
		this.vue.getItemQuitter().addActionListener(this) ;
		
		// Se met à l'écoute de l'item de menu "A propos..."
		this.vue.getItemApropos().addActionListener(this) ;
		
		// se met à l'écoute de l'item de menu "liste RV"
		this.vue.getItemVisualiserRV().addActionListener(this);
		
		// se met à l'écoute de l'item de menu 
		this.vue.getItemPraticiensCoeffConfiance().addActionListener(this);
		// se met à l'écoute de l'item de menu 
		this.vue.getItemPraticiensTemps().addActionListener(this);
		// se met à l'écoute de l'item de menu 
		this.vue.getItemPraticiensCoeffNotoriete().addActionListener(this);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		// Obtient le composant graphique source de l'événement ("clic")
		Object sourceEvenement = e.getSource() ;
		
		if( sourceEvenement == this.vue.getItemSeConnecter() ){
			this.seConnecter();
		}
		// Si la source est l'item de menu "Se déconnecter"
		else if( sourceEvenement == this.vue.getItemSeDeconnecter() ){
			this.seDeconnecter();
		}
		// Si la source est l'item de menu "Quitter"
		else if( sourceEvenement == this.vue.getItemQuitter() ){
			this.quitter();
		}
		// Si la source est l'item "À propos", afficher la boîte de dialogue associée
		else if( sourceEvenement == this.vue.getItemApropos() ){
			this.afficherApropos();
		}
		
		// Si la source est l'item "ListerVisiteurs" du menu "liste RV", afficher la vue associée
		else if (sourceEvenement == this.vue.getItemVisualiserRV()){
			this.vue.changerVue("vueListeVisiteurs");
			//System.out.println("vueListeLivreur");
		}
		else if (sourceEvenement == this.vue.getItemPraticiensCoeffConfiance()){
			this.vue.changerVue("vueListePraticiensCoeffConf");
			//System.out.println("vueListeLivreur");
		}
		else if (sourceEvenement == this.vue.getItemPraticiensTemps()){
			this.vue.changerVue("vueListePraticiensDate");
			//System.out.println("vueListeLivreur");
		}
		else if (sourceEvenement == this.vue.getItemPraticiensCoeffNotoriete()){
			this.vue.changerVue("vueListePraticiensCoeffNot");
			//System.out.println("vueListeLivreur");
		}
		
		
		
	}
	
	private void seConnecter(){
		// Affiche la vue dédiée à la connexion (formulaire de connexion)
		new VueAuthentification(this.vue);
	}
	
	private void seDeconnecter(){
		// Demande confirmation à l'utilisateur au moyen d'une boîte de dialogue
		int reponse = JOptionPane.showConfirmDialog(this.vue, "Voulez-vous vraiment vous déconnecter ?","Déconnexion",JOptionPane.YES_NO_OPTION) ;
		
		// Si l'utilateur confirme...
		if( reponse == JOptionPane.YES_OPTION ){
				
			// Bascule la barre de menus dans le "Mode Non connecté"
			this.vue.setBarreMenusModeDeconnecte();
			this.vue.changerVue("Accueil");
			
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
		JOptionPane.showMessageDialog(this.vue, "GSB\n AppRv","À propos...",JOptionPane.INFORMATION_MESSAGE) ;
	}
}
