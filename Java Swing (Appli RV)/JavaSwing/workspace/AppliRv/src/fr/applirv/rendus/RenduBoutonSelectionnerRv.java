package fr.applirv.rendus;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

import fr.applirv.entites.RapportVisite;
import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.modeles.ModeleListeRv;
import fr.applirv.modeles.ModeleListeVisiteurs;
import fr.applirv.vues.VueListeRv;
import fr.applirv.vues.VueListeVisiteurs;

public class RenduBoutonSelectionnerRv extends JButton implements TableCellRenderer {

	private VueListeRv vue ;	
	private ModeleListeRv modeleTabRvs ;
	private ArrayList<RapportVisite> lesRv ;
	
	public RenduBoutonSelectionnerRv(ArrayList<RapportVisite> lesRv){
		super() ;
		this.lesRv = lesRv;
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		//DefaultTableCellRenderer composant = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
					
		if( value != null){
			this.setText(value.toString());
		}
		else{
			this.setText("Voir le RV");
		}
		
				
		return this ;
	}

}
