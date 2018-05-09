package fr.applirv.rendus;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import fr.applirv.entites.RapportVisite;
import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.modeles.ModeleListeVisiteurs;
import fr.applirv.vues.VueListeRv;
import fr.applirv.vues.VueListeVisiteurs;

public class RenduCelluleRapportVisite extends DefaultTableCellRenderer {
	
	private VueListeRv vue ;	
	private ModeleListeVisiteurs modeleTabVisiteurs ;
	private ArrayList<RapportVisite> lesRv ;
	
	public RenduCelluleRapportVisite(ArrayList<RapportVisite> lesRv){
		super() ;
		this.lesRv = lesRv;
	}
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		DefaultTableCellRenderer composant = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		
		
		if(ModeleAppliRV.getModele().getVuRapportVisite(lesRv.get(row).getNumero())){
			composant.setBackground(new Color(36,113,163,70));
		}  
		//else if(ModeleAppliRV.getModele().getVuRapportVisite(lesRv.get(row).getNumero()) == false){
		else{	
			composant.setBackground(new Color(133,193,233,70));
		}
		
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
		}
	
		
		
				
		return composant ;
	}

}
