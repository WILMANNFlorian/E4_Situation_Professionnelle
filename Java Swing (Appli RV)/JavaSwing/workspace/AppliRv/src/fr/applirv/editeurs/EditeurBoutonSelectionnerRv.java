package fr.applirv.editeurs;

import java.awt.Component;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;

import fr.applirv.controleurs.ControleurBoutonSelectionnerRv;
import fr.applirv.controleurs.ControleurBoutonSelectionnerVisiteur;
import fr.applirv.entites.RapportVisite;
import fr.applirv.vues.VueListeRv;

public class EditeurBoutonSelectionnerRv extends DefaultCellEditor {

	protected JButton bouton = new JButton();
	private ControleurBoutonSelectionnerRv ctrlBouton;
	
	public EditeurBoutonSelectionnerRv(VueListeRv vueListeRv, ArrayList<RapportVisite> lesRv){
		super(new JCheckBox());
		this.ctrlBouton = new ControleurBoutonSelectionnerRv(vueListeRv, lesRv);
		this.bouton.addActionListener(this.ctrlBouton);
		//System.out.println("testAction");
	}
	
	
	
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		super.getTableCellEditorComponent(table, value, isSelected, row, column);
		
		this.ctrlBouton.setRow(row);
		
		if( value == null){
			this.bouton.setText("");
		}
		else{
			this.bouton.setText(value.toString());
		}
		
		return this.bouton;
	}

}
