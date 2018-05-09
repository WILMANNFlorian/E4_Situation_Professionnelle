package fr.applirv.controleurs;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;

import fr.applirv.entites.RapportVisite;
import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.vues.VueAppRV;
import fr.applirv.vues.VueLeRv;
import fr.applirv.vues.VueListeRv;
import fr.applirv.vues.VueListeVisiteurs;
import fr.applirv.vues.VueSelectionDate;

public class ControleurBoutonSelectionnerRv implements ActionListener {
	
	
	private ArrayList<RapportVisite> lesRv;
	
	private int row ;
	private int column;
	private JTable table;
	VueAppRV vueParente;
	VueListeRv vue;
	ArrayList<RapportVisite> lesRapportsVisite;
	//ArrayList<RapportVisite> leRapportVisite = ModeleAppliRV.getModele().getLeRv(NUM);
	
	/** Constructeur
	 * @param vue Vue associée
	 */
	public ControleurBoutonSelectionnerRv(VueListeRv vue,  ArrayList<RapportVisite> lesRv){
        super();
		
		this.vue = vue;
		this.lesRv = lesRv;
		System.out.println(lesRv);
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
		
		
		final String numRv = lesRv.get(getRow()).getNumero();
		//System.out.println(matriculeSelect);
		
		int nbLignes = ModeleAppliRV.getModele().setVuRapportVisite(numRv);
		System.out.println(nbLignes);
		
		/**
		 * Launch the application.
		 */
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					VueLeRv frame = new VueLeRv(vueParente, numRv);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
