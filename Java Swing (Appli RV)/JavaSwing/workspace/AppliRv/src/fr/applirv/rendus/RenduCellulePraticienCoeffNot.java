package fr.applirv.rendus;

import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import fr.applirv.entites.Praticien;
import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.modeles.ModeleListePraticiensCoeffNot;
import fr.applirv.modeles.ModeleListePraticiensDate;
import fr.applirv.modeles.ModeleListeVisiteurs;
import fr.applirv.vues.VueListeVisiteurs;

public class RenduCellulePraticienCoeffNot extends DefaultTableCellRenderer {
	
	private VueListeVisiteurs vue ;	
	private ModeleListePraticiensCoeffNot modeleTabPraticiens ;
	private List<Praticien> lesPraticiens = ModeleAppliRV.getModele().getLesPraticiensCoeffNot() ;
	
	public RenduCellulePraticienCoeffNot(){
		super() ;
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		DefaultTableCellRenderer composant = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		
		
		/*if(lesVisiteurs.get(row).getDate().estAnterieure(new DateFr())){
			composant.setBackground(new Color(249,219,215,50));
		}  
		else if(lesVisiteurs.get(row).getDate().estPosterieure(new DateFr())){
			composant.setBackground(new Color(211,237,200,50));
		}
		else if(lesVisiteurs.get(row).getDate().estIdentique(new DateFr( 11 , 10 ,  2017 ))){
			//System.out.println("test");
			composant.setBackground(new Color(237,200,200,50));
		}*/
		composant.setBackground(new Color(93,173,226,80));
		
		if(column == 0){
			composant.setHorizontalAlignment(CENTER);
		}

		if(column == 1){
			composant.setHorizontalAlignment(CENTER); 
		}
		
		if(column == 2){
			composant.setHorizontalAlignment(CENTER); 
		}

		if(column == 3){
			composant.setHorizontalAlignment(CENTER); 
		}
		if(column == 4){
			composant.setHorizontalAlignment(CENTER); 
			composant.setBackground(new Color(84,255,159,80));
		}
		if(column == 5){
			composant.setHorizontalAlignment(CENTER); 
			
		}

		if(column == 6){
			composant.setHorizontalAlignment(CENTER); 
		}

		if(column == 7){
			composant.setHorizontalAlignment(CENTER); 
		}


		
		
				
		return composant ;
	}

}
