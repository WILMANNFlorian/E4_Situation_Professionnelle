package fr.applirv.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import fr.applirv.entites.Visiteur;
import fr.applirv.entites.RapportVisite;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.technique.Session;
import fr.applirv.vues.VueAppRV;
import fr.applirv.vues.VueListeRv;
import fr.applirv.vues.VueSelectionDate;

import javax.swing.*;

public class ControleurBoutonSelectionnerDate implements ActionListener{
	
	private VueSelectionDate vue;
	VueAppRV vueParente;
	private String matricule;
	
	public ControleurBoutonSelectionnerDate(VueSelectionDate vue, String visMatricule){
		super();
		
		this.vue = vue;
		this.matricule = matricule;
		this.enregistrerEcouteur();
		
	}

	private void enregistrerEcouteur(){
		//enregister ecouteur se connecter et annuler 
		
		/*this.vue.getbConnecter().addActionListener(this);
		this.vue.getbAnnuler().addActionListener(this);
		*/
		this.vue.getbRechercher().addActionListener(this);
		this.vue.getbAnnuler().addActionListener(this);
		this.vue.getCbAnnee().addActionListener(this);
		this.vue.getCbMois().addActionListener(this);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		Object sourceEvenement = e.getSource() ;
		
		//afficher les jdialog si recherche raté ou bien si trouvé 
		
		
		/*JOptionPane.showMessageDialog(null, "message", null, JOptionPane.INFORMATION_MESSAGE);
		System.out.println("test");*/
		
		if( sourceEvenement == this.vue.getbRechercher() ){
			String mois = this.vue.getCbMois().getSelectedItem().toString();
			String annee = this.vue.getCbAnnee().getSelectedItem().toString();
			String matriculeVisiteur = this.vue.getMatriculeVisiteur();
			System.out.println("matricule : " + matriculeVisiteur + "\n Mois : " + mois + "\n Année : " + annee);
		
			try {
				//System.out.println("test1");
				
				ArrayList<RapportVisite> lesRV = (ArrayList<RapportVisite>) ModeleAppliRV.getModele().getLesRapports(matriculeVisiteur, annee , mois );
				
				//System.out.println(lesRV);
				
				if(!lesRV.isEmpty()){
					
					
					JOptionPane.showMessageDialog(this.vue, "Ce visiteur a effectué une visite durant cette période.","Date du rapport de visite",JOptionPane.INFORMATION_MESSAGE) ;
					//this.vue.dispose() ;
					
					/**
					 * Launch the application.
					 */
					final ArrayList<RapportVisite> lesRVi = new  ArrayList<RapportVisite>();
					for (RapportVisite unRapport : lesRV){
						lesRVi.add(unRapport);
						//System.out.println(unRapport);
					}
					lesRV.clear();
					//final String[] lesDonneesRv = new String[] {matriculeVisiteur,annee,mois};
					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								VueListeRv frame = new VueListeRv(vueParente, lesRVi);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					
					
				}
				else{
					JOptionPane.showMessageDialog(this.vue, "Ce visiteur n'a effectué aucune visite durant cette période.","Date du rapport de visite",JOptionPane.ERROR_MESSAGE) ;
					//this.vue.initialiser() ;
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
