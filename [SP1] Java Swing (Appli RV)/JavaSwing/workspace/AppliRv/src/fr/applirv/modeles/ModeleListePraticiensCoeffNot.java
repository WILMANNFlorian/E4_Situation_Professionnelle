package fr.applirv.modeles;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import fr.applirv.entites.Praticien;
import fr.applirv.technique.DateFr;

public class ModeleListePraticiensCoeffNot extends AbstractTableModel{
	
	ArrayList<Praticien> lesPraticiens = (ArrayList<Praticien>) new ModeleAppliRV().getModele().getLesPraticiensCoeffNot();
	private final String[] entetes = { "Nom" , "Prénom" , "Ville", "Confiance (coef)","Notoriété (coef)" ,"Spécialité" ,"Date de visite"} ;


	public ModeleListePraticiensCoeffNot() {
		super();
	}

	public int getRowCount() {
		int lignes = lesPraticiens.size();
		return lignes;
	}

	public int getColumnCount() {
		int colonne = entetes.length;
		return colonne;
	}
	
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}


	
	public Class<?> getColumnClass(int columnIndex) {
		switch ( columnIndex ){
			case 0 :
			case 1 : 
			case 2 : 
				return String.class;
			case 3 :
			case 4 :
			case 5 :
				return String.class;
			case 6 : 
				return String.class;
				
		}
		return null;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		switch( columnIndex ){
			case 0 : 
				return lesPraticiens.get(rowIndex).getNom();
			case 1 : 
				return lesPraticiens.get(rowIndex).getPrenom();
			case 2 :
				return lesPraticiens.get(rowIndex).getVille();
			case 3 : 
				return lesPraticiens.get(rowIndex).getCoeffConfiance();
			case 4 : 
				return lesPraticiens.get(rowIndex).getCoeffNotoriete();
			case 5 :
				return lesPraticiens.get(rowIndex).getSpecialite();
			case 6 :
				return lesPraticiens.get(rowIndex).getDateVisite();
		}
		return null;
	}
	
	public void actualiser(){
		this.fireTableDataChanged();
	}
	

}
