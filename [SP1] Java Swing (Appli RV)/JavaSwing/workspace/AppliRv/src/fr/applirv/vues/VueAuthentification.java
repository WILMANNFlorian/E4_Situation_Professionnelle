package fr.applirv.vues;

import java.awt.*;

import javax.swing.*;

import fr.applirv.controleurs.ControleurAuthentification;

public class VueAuthentification extends JDialog {

		 

		VueAppRV vueParente;
		
		ControleurAuthentification controleur;
		
		private JTextField tfVisMatricule = new JTextField() ;
		private JPasswordField pfVisMdp = new JPasswordField();
		private JButton bConnecter = new JButton("Se connecter") ;
		private JButton bAnnuler = new JButton("Annuler") ;
		
		public VueAuthentification (VueAppRV vueParente){
			
			// Appel du constructeur de la super-classe
			//	Troisième argument : true pour indiquer que la boîte de dialogue est modale 
			super(vueParente,"Authentification",true) ;
			
			// Mémorise la vue parente qui est la fenêtre principale de l'application
			this.vueParente = vueParente ;
			
			
			//creation de la page de connexion
			this.creationPageCo();
			// Redimensionne la boîte de dialogue (dimensions adaptées aux composants qui s'y trouvent)
			this.pack() ;
			
			// Positionne la boîte de dialogue au centre de l'écran
			this.setLocationRelativeTo(null) ;
			
			// Empêche le redimensionnement par l'utilisateur
			this.setResizable(false);
			
			// Crée le controleur associé et lui indique que le vue qui lui
			// est associée est elle-même
			this.controleur = new ControleurAuthentification(this) ;
			
			// Affiche la boîte de dialogue
			this.setVisible(true) ;
			
		}
		
		public void initialiser(){
			
			// VOTRE CODE : 
			// Afficher une chaîne de caractères vide dans les deux
			// champs de saisie (login et MDP)
			
			this.tfVisMatricule.setText("");
			this.pfVisMdp.setText("");
			
		}
		
		private void creationPageCo(){
			
			Container conteneur = this.getContentPane();
			
			Box boxPrincipale = Box.createVerticalBox() ;
			Box boxChamps = Box.createHorizontalBox() ;
			Box boxEtiquettes = Box.createVerticalBox() ;
			Box boxSaisies = Box.createVerticalBox() ;
			Box boxLigne = Box.createHorizontalBox() ;
			Box boxActions = Box.createHorizontalBox() ;
			
			boxEtiquettes.add(new JLabel("Login : ")) ;
			boxEtiquettes.add( Box.createVerticalStrut(10) ) ;
			boxEtiquettes.add(new JLabel("MDP : ")) ;
			
			boxSaisies.add( this.tfVisMatricule) ;
			boxSaisies.add( Box.createVerticalStrut(10) ) ;
			boxSaisies.add( this.pfVisMdp) ;
			
			boxLigne.add( Box.createHorizontalStrut( 10 ) ) ;
			boxLigne.add( new JSeparator() ) ;
			boxLigne.add( Box.createHorizontalStrut( 10 ) ) ;
			
			boxActions.add( Box.createHorizontalStrut( 10 ) ) ;
			boxActions.add( this.bConnecter ) ;
			boxActions.add( Box.createHorizontalStrut( 10 ) ) ;
			boxActions.add( this.bAnnuler ) ;
			boxActions.add( Box.createHorizontalStrut( 10 ) ) ;
			
			
			boxChamps.add( Box.createHorizontalStrut( 10 ) ) ;
			boxChamps.add( boxEtiquettes ) ;
			boxChamps.add( Box.createHorizontalStrut( 10 ) ) ;
			boxChamps.add( boxSaisies ) ;
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
		
		public JTextField getTfVisMatricule() {
			return tfVisMatricule;
		}

		public JPasswordField getPfVisMdp() {
			return pfVisMdp;
		}

		public JButton getbConnecter() {
			return bConnecter;
		}

		public JButton getbAnnuler() {
			return bAnnuler;
		}

}
