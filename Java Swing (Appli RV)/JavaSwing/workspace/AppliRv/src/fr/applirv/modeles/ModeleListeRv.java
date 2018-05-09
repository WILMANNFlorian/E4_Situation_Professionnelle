package fr.applirv.modeles;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import fr.applirv.entites.RapportVisite;
import fr.applirv.entites.Visiteur;

public class ModeleListeRv extends AbstractTableModel{
	
	
	private final String[] entetes = { "Matricule visiteur" , "Matricule Praticien" , "Numéro", "Date","Voir RV"} ;
	private ArrayList<RapportVisite> lesRv;
	
	//String[] lesDonneesRv;
	
	public ModeleListeRv(ArrayList<RapportVisite> lesRv) {
		super();
		this.lesRv = lesRv;
		//this.lesDonneesRv = lesDonneesRv;
	}

	@Override
	public int getRowCount() {
		int lignes = lesRv.size();
		return lignes;
	}

	@Override
	public int getColumnCount() {
		int colonne = entetes.length;
		return colonne;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if( columnIndex == 4 ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch ( columnIndex ){
			case 0 :
			case 1 : 
			case 2 : 
			case 3 :
				return String.class;
			case 4 :
				//return JButton.class;
				return String.class;
				
		}
		return null;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch( columnIndex ){
			case 0 : 
				return lesRv.get(rowIndex).getVisiteur().getVisMatricule();
			case 1 : 
				return lesRv.get(rowIndex).getPraticien().getIdentifiant();
			case 2 :
				return lesRv.get(rowIndex).getNumero();
			case 3 : 
				return lesRv.get(rowIndex).getDate();
			case 4 : 
				//return "Voir le RV";
				//String rapVu = ;
				if(ModeleAppliRV.getModele().getVuRapportVisite(lesRv.get(rowIndex).getNumero())){
				//if(lesRv.get(rowIndex).getVu().equals("oui")){
					return "Voir le RV \n( VU )";
				}
				else{
					return "Voir le RV \n( NON VU )";
				}
		}
		return null;
	}
	
	public void actualiser(){
		this.fireTableDataChanged();
	}

}
