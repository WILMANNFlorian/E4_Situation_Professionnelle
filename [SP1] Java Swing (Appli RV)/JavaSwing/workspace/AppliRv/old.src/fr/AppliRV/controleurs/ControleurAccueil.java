package fr.AppliRV.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import java.awt.CardLayout;
import fr.AppliRV.modeles.ModeleGsbRvDr;
import fr.AppliRV.vues.VueAccueil;
import fr.AppliRV.vues.VuePageVide;


public class ControleurAccueil implements ActionListener {

	private VuePageVide vuePageVide = new VuePageVide();
	private VueAccueil vueAccueil ;
	
	/* Constructeur */
	
	public ControleurAccueil(VueAccueil vueAccueil){
		super() ;
				
		this.vueAccueil = vueAccueil ;
		this.enregistrerEcouteur() ;
		
	}
	
	/* Enregistrer le contrôleur en tant qu'écouteur */
	private void enregistrerEcouteur(){
	
		// Enregistrer l'écouteur du bouton "Se connecter"
		// Enregistrer l'écoureur du bouton "Annuler"
		
		
		this.vueAccueil.getbConnecter().addActionListener(this);
	
	}

	
	// Méthode de traitement des événements
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object sourceEvenement = e.getSource() ;
		
		if( sourceEvenement == this.vueAccueil.getbConnecter() ){
			
			
			String login = this.vueAccueil.getIdentifiant().getText() ;
			String mdp = new String(this.vueAccueil.getMotDePasse().getPassword()) ;
			
			ModeleGsbRvDr model = new ModeleGsbRvDr();
			
			Boolean connexionOk = false;
			
			try {
				connexionOk = model.seConnecter(login,mdp);
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			if(connexionOk){
				JOptionPane.showMessageDialog(this.vueAccueil, "Connexion réussie.","Authentification",JOptionPane.INFORMATION_MESSAGE) ;				//this.vue.dispose() ;
				//VueFoody vueParente = (VueFoody) this.vue.getParent() ;
				//vueParente.setBarreMenusModeConnecte() ;
				vuePageVide.setVisible(true);
				vueAccueil.dispose();
				
			}
			else {
				JOptionPane.showMessageDialog(this.vueAccueil, "Connexion refusée.","Authentification",JOptionPane.ERROR_MESSAGE) ;
				this.vueAccueil.initialiser() ;
			}
			
		}
		
	}
	
}
