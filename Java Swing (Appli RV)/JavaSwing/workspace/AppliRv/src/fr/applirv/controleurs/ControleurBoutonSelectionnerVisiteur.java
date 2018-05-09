package fr.applirv.controleurs;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import fr.applirv.entites.RapportVisite;
import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.rendus.RenduBoutonSelectionnerVisiteur;

import fr.applirv.vues.VueAppRV;
import fr.applirv.vues.VueListeVisiteurs;
import fr.applirv.vues.VueSelectionDate;

public class ControleurBoutonSelectionnerVisiteur implements ActionListener {
	
	
	private int row ;
	private int column;
	private JTable table;
	VueAppRV vueParente;
	VueListeVisiteurs vue;
	ArrayList<Visiteur> lesVisiteurs = (ArrayList<Visiteur>) ModeleAppliRV.getModele().getLesVisiteurs();
	
	/** Constructeur
	 * @param vue Vue associée
	 */
	public ControleurBoutonSelectionnerVisiteur(){
		super() ;
	}
	
	
	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


		// Méthode de traitement des événements
	
	
	public void actionPerformed(ActionEvent e) {
		//Object sourceEvenement = e.getSource() ;
		
		//RECUPERER MATRICULE GRACE BOUTON
		
		//String matriculeVisiteur = new String(this.vue.getCol);
		/*JOptionPane.showMessageDialog(null,"Information Course",null, JOptionPane.INFORMATION_MESSAGE) ;
			System.out.println("testBoutonVisiteur");*/
		
		final String matriculeSelect = lesVisiteurs.get(getRow()).getVisMatricule();
		//System.out.println(matriculeSelect);
		
		/**
		 * Launch the application.
		 */
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueSelectionDate frame = new VueSelectionDate(vueParente, matriculeSelect);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
