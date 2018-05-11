package fr.applirv.vues;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import fr.applirv.editeurs.EditeurBoutonSelectionnerVisiteur;
import fr.applirv.modeles.*;
import fr.applirv.rendus.RenduBoutonSelectionnerVisiteur;
import fr.applirv.rendus.RenduCelluleVisiteur;
import fr.applirv.technique.DateFr;

public class VueListeVisiteurs extends JPanel {
			
		
		private ModeleListeVisiteurs modeleListeVisiteurs;
		private JTable tabVisiteurs ;
		
		
		public VueListeVisiteurs(){
			super() ;
			modeleListeVisiteurs= new ModeleListeVisiteurs() ;
			this.creerInterfaceUtilisateur() ;
			//System.out.println("test");
		}


		private void creerInterfaceUtilisateur() {
			Box boxPrincipale = Box.createVerticalBox() ;
			Box boxEtiquette = Box.createHorizontalBox() ;
			Box boxTable = Box.createHorizontalBox() ;
			
			boxEtiquette.add( new JLabel( "Sélection d'un visiteur" ) ) ;
			
			// VOTRE CODE ICI - Question 6
			modeleListeVisiteurs = new ModeleListeVisiteurs();
			tabVisiteurs = new JTable(modeleListeVisiteurs);
			
			this.tabVisiteurs.setRowHeight(30);
			
			JScrollPane spVisiteurs = new JScrollPane(this.tabVisiteurs);
			
			spVisiteurs.setPreferredSize(new Dimension(880,500));
			
			boxTable.add(spVisiteurs);
			
			//application du rendu de la vue
			this.tabVisiteurs.setDefaultRenderer(String.class, new RenduCelluleVisiteur());
			this.tabVisiteurs.setDefaultRenderer(DateFr.class, new RenduCelluleVisiteur());
			this.tabVisiteurs.setDefaultRenderer(Integer.class, new RenduCelluleVisiteur());
			this.tabVisiteurs.setDefaultRenderer(JButton.class, new RenduCelluleVisiteur());
			//application du rendu du bouton
			this.tabVisiteurs.getColumn("Voir RV").setCellRenderer(new RenduBoutonSelectionnerVisiteur());
			//application de l'éditeur du bouton
			this.tabVisiteurs.getColumn("Voir RV").setCellEditor(new EditeurBoutonSelectionnerVisiteur());
			
			boxPrincipale.add( boxEtiquette ) ;
			boxPrincipale.add( boxTable ) ;
			
			this.add( boxPrincipale ) ;
			
		}
		
		public ModeleListeVisiteurs getModeleVisiteur() {
			return modeleListeVisiteurs;
		}

		public JTable getTabVisiteurs() {
			return tabVisiteurs;
		}

}
