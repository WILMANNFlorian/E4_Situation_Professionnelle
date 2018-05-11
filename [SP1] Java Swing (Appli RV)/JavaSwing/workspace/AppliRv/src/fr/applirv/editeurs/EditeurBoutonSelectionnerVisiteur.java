package fr.applirv.editeurs;

import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

import fr.applirv.controleurs.ControleurBoutonSelectionnerVisiteur;

public class EditeurBoutonSelectionnerVisiteur extends DefaultCellEditor{

	protected JButton bouton = new JButton();
	private ControleurBoutonSelectionnerVisiteur ctrlBouton = new ControleurBoutonSelectionnerVisiteur();
	
	public EditeurBoutonSelectionnerVisiteur(){
		super(new JCheckBox());
		this.bouton.addActionListener(ctrlBouton);
		
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
