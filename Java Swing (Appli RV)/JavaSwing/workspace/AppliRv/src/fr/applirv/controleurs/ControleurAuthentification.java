package fr.applirv.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.technique.Session;
import fr.applirv.vues.VueAppRV;
import fr.applirv.vues.VueAuthentification;


public class ControleurAuthentification implements ActionListener {

	// Utilisation de la vue vueAuthentification
	private VueAuthentification vue;
	
	
	public ControleurAuthentification(VueAuthentification vue){

		// Appel le constructeur parent
		super();
		
		this.vue = vue;
		this.enregisterEcouteur();

	}
	

	private void enregisterEcouteur(){

		// Enregiste l'écouteur Connecter
		this.vue.getbConnecter().addActionListener(this);

		// Enregistre l'écouteur Annuler
		this.vue.getbAnnuler().addActionListener(this);

	}
	
	
	public void actionPerformed(ActionEvent e){

		Object sourceEvenement = e.getSource() ;
		
		if( sourceEvenement == this.vue.getbConnecter() ){

			String visMatricule = this.vue.getTfVisMatricule().getText() ;
			String visMdp = new String(this.vue.getPfVisMdp().getPassword()) ;
		
			boolean connexionOk;

			try {
				
				connexionOk = ModeleAppliRV.seConnecter( visMatricule , visMdp );
				
				// Si la connexion est bonne
				if(connexionOk){
					
					// Affiche la boite de dialogue "Connexion réussie"
					JOptionPane.showMessageDialog(this.vue, "Connexion réussie.","Authentification",JOptionPane.INFORMATION_MESSAGE) ;
					this.vue.dispose() ;
					VueAppRV vueParente = (VueAppRV) this.vue.getParent() ;
					vueParente.setBarreMenusModeConnecte() ;
					
					// Ouvrir la session Visiteur
					
					Visiteur leVisiteur = new Visiteur(visMatricule,visMdp);
					Session.ouvrir(leVisiteur);
					
				}

				else{

					JOptionPane.showMessageDialog(this.vue, "Connexion refusée.","Authentification",JOptionPane.ERROR_MESSAGE) ;
					this.vue.initialiser() ;

				}
				
				
			} catch (Exception e1) {

				e1.printStackTrace();
				
			}
			
		}

		else if( sourceEvenement == this.vue.getbAnnuler() ){

			this.vue.dispose() ;

		}
		
	}


}
