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
	private VueAuthentification vue;
	
	
	public ControleurAuthentification(VueAuthentification vue){
		super();
		
		this.vue = vue;
		this.enregisterEcouteur();
	}
	
	private void enregisterEcouteur(){
		//enregister ecouteur se connecter et annuler 
		
		this.vue.getbConnecter().addActionListener(this);
		this.vue.getbAnnuler().addActionListener(this);
	}
	
	
	// faire avec la base de donnée ci dessous -->
	@Override
	public void actionPerformed(ActionEvent e){
		Object sourceEvenement = e.getSource() ;
		
		if( sourceEvenement == this.vue.getbConnecter() ){
			String visMatricule = this.vue.getTfVisMatricule().getText() ;
			String visMdp = new String(this.vue.getPfVisMdp().getPassword()) ;
		
		
			boolean connexionOk;
			try {
				//System.out.println("test1");
				
				connexionOk = ModeleAppliRV.seConnecter( visMatricule , visMdp );
				
				//System.out.println("test1");
				
				if(connexionOk){
					
					//System.out.println("test2");
					
					JOptionPane.showMessageDialog(this.vue, "Connexion réussie.","Authentification",JOptionPane.INFORMATION_MESSAGE) ;
					this.vue.dispose() ;
					VueAppRV vueParente = (VueAppRV) this.vue.getParent() ;
					vueParente.setBarreMenusModeConnecte() ;
					
					//ouverture session
					
					Visiteur leVisiteur = new Visiteur(visMatricule,visMdp);
					Session.ouvrir(leVisiteur);
					
				}
				else{
					JOptionPane.showMessageDialog(this.vue, "Connexion refusée.","Authentification",JOptionPane.ERROR_MESSAGE) ;
					this.vue.initialiser() ;
				}
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
				
				
				//System.out.println("test erreur");
			}
			
			
			
			
		}
		else if( sourceEvenement == this.vue.getbAnnuler() ){
			this.vue.dispose() ;
		}
		
	}
	
	
	
	
	
}
