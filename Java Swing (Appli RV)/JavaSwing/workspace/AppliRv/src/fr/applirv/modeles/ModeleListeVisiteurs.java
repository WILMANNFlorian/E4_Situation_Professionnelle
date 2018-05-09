package fr.applirv.modeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import fr.applirv.entites.Visiteur;
import fr.applirv.technique.ConnexionBD;
import fr.applirv.technique.DateFr;

public class ModeleListeVisiteurs extends AbstractTableModel {
	
	
	ArrayList<Visiteur> lesVisiteurs = (ArrayList<Visiteur>) new ModeleAppliRV().getModele().getLesVisiteurs();
	private final String[] entetes = { "Nom" , "Prénom" , "Code Postale", "Ville","Voir RV"} ;

	public ModeleListeVisiteurs() {
		super();
	}

	@Override
	public int getRowCount() {
		int lignes = lesVisiteurs.size();
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
				return lesVisiteurs.get(rowIndex).getVisNom();
			case 1 : 
				return lesVisiteurs.get(rowIndex).getVisPrenom();
			case 2 :
				return lesVisiteurs.get(rowIndex).getVisCP();
			case 3 : 
				return lesVisiteurs.get(rowIndex).getVisVille();
			case 4 : 
				return "Sélectionner";
		}
		return null;
	}
	
	public void actualiser(){
		this.fireTableDataChanged();
	}
	

	}
