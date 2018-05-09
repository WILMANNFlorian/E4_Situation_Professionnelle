package fr.applirv.rendus;

import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import fr.applirv.entites.Visiteur;
import fr.applirv.modeles.ModeleAppliRV;
import fr.applirv.modeles.ModeleListeVisiteurs;
import fr.applirv.technique.DateFr;
import fr.applirv.vues.VueListeVisiteurs;

public class RenduBoutonSelectionnerVisiteur extends JButton implements TableCellRenderer{
	
		
		private VueListeVisiteurs vue ;	
		private ModeleListeVisiteurs modeleTabVisiteurs ;
		private List<Visiteur> lesVisiteurs = ModeleAppliRV.getModele().getLesVisiteurs() ;
		
		public RenduBoutonSelectionnerVisiteur(){
			super() ;
		}

		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			
			//DefaultTableCellRenderer composant = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
						
			if( value != null){
				this.setText(value.toString());
			}
			else{
				this.setText("Sélectionner");
			}
			
					
			return this ;
		}
		

	


}
