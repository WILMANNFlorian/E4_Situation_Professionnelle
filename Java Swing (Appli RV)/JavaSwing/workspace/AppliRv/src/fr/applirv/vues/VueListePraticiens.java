package fr.applirv.vues;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fr.applirv.editeurs.EditeurBoutonSelectionnerVisiteur;
import fr.applirv.modeles.ModeleListePraticiensCoeffConf;
import fr.applirv.modeles.ModeleListePraticiensCoeffNot;
import fr.applirv.modeles.ModeleListePraticiensDate;
import fr.applirv.modeles.ModeleListeVisiteurs;
import fr.applirv.rendus.RenduBoutonSelectionnerVisiteur;
import fr.applirv.rendus.RenduCellulePraticienCoeffConf;
import fr.applirv.rendus.RenduCellulePraticienCoeffNot;
import fr.applirv.rendus.RenduCellulePraticienDate;
import fr.applirv.rendus.RenduCelluleVisiteur;
import fr.applirv.technique.DateFr;

public class VueListePraticiens extends JPanel {
	
	private ModeleListePraticiensCoeffConf modeleListePraticiensCoeffConf;
	private ModeleListePraticiensDate modeleListePraticiensDate;
	private ModeleListePraticiensCoeffNot modeleListePraticiensCoeffNot;
	private JTable tabPraticiens ;
	
	
	public VueListePraticiens(int i){
		super() ;
		modeleListePraticiensCoeffConf= new ModeleListePraticiensCoeffConf() ;
		modeleListePraticiensDate = new ModeleListePraticiensDate();
		modeleListePraticiensCoeffNot = new ModeleListePraticiensCoeffNot();
		if(i == 1){
			this.creerInterfacePraticienCoeffConf() ;
		}
		else if(i == 2){
			this.creerInterfacePraticienTemps() ;
		}
		else if(i == 3){
			this.creerInterfacePraticienCoeffNot() ;
		}
		
		//System.out.println("test");
	}


	private void creerInterfacePraticienCoeffConf() {
		Box boxPrincipale = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTable = Box.createHorizontalBox() ;
		
		boxEtiquette.add( new JLabel( "Liste des praticiens par coeficient de confiance" ) ) ;
		
		// VOTRE CODE ICI - Question 6
		modeleListePraticiensCoeffConf = new ModeleListePraticiensCoeffConf();
		tabPraticiens = new JTable(modeleListePraticiensCoeffConf);
		
		this.tabPraticiens.setRowHeight(30);
		
		JScrollPane spPraticiens = new JScrollPane(this.tabPraticiens);
		
		spPraticiens.setPreferredSize(new Dimension(880,500));
		
		boxTable.add(spPraticiens);
		
		//application du rendu de la vue
		this.tabPraticiens.setDefaultRenderer(String.class, new RenduCellulePraticienCoeffConf());
		this.tabPraticiens.setDefaultRenderer(Float.class, new RenduCellulePraticienCoeffConf());
		this.tabPraticiens.setDefaultRenderer(DateFr.class, new RenduCellulePraticienCoeffConf());
		this.tabPraticiens.setDefaultRenderer(Integer.class, new RenduCellulePraticienCoeffConf());
		this.tabPraticiens.setDefaultRenderer(JButton.class, new RenduCellulePraticienCoeffConf());
		//application du rendu du bouton
		//this.tabVisiteurs.getColumn("Sélection").setCellRenderer(new RenduBoutonSelectionnerVisiteur());
		//application de l'éditeur du bouton
		//this.tabVisiteurs.getColumn("Sélection").setCellEditor(new EditeurBoutonSelectionnerVisiteur());
		
		boxPrincipale.add( boxEtiquette ) ;
		boxPrincipale.add( boxTable ) ;
		
		this.add( boxPrincipale ) ;
		
	}
	
	private void creerInterfacePraticienTemps() {
		Box boxPrincipale = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTable = Box.createHorizontalBox() ;
		
		boxEtiquette.add( new JLabel( "Liste des praticiens en fonction de la dernière date de visite" ) ) ;
		
		// VOTRE CODE ICI - Question 6
		modeleListePraticiensDate = new ModeleListePraticiensDate();
		tabPraticiens = new JTable(modeleListePraticiensDate);
		
		this.tabPraticiens.setRowHeight(30);
		
		JScrollPane spPraticiens = new JScrollPane(this.tabPraticiens);
		
		spPraticiens.setPreferredSize(new Dimension(880,500));
		
		boxTable.add(spPraticiens);
		
		//application du rendu de la vue
		this.tabPraticiens.setDefaultRenderer(String.class, new RenduCellulePraticienDate());
		this.tabPraticiens.setDefaultRenderer(Float.class, new RenduCellulePraticienDate());
		this.tabPraticiens.setDefaultRenderer(DateFr.class, new RenduCellulePraticienDate());
		this.tabPraticiens.setDefaultRenderer(Integer.class, new RenduCellulePraticienDate());
		this.tabPraticiens.setDefaultRenderer(JButton.class, new RenduCellulePraticienDate());
		//application du rendu du bouton
		//this.tabVisiteurs.getColumn("Sélection").setCellRenderer(new RenduBoutonSelectionnerVisiteur());
		//application de l'éditeur du bouton
		//this.tabVisiteurs.getColumn("Sélection").setCellEditor(new EditeurBoutonSelectionnerVisiteur());
		
		boxPrincipale.add( boxEtiquette ) ;
		boxPrincipale.add( boxTable ) ;
		
		this.add( boxPrincipale ) ;
		
	}
	
	private void creerInterfacePraticienCoeffNot() {
		Box boxPrincipale = Box.createVerticalBox() ;
		Box boxEtiquette = Box.createHorizontalBox() ;
		Box boxTable = Box.createHorizontalBox() ;
		
		boxEtiquette.add( new JLabel( "Liste des praticiens en fonction de leur coeficient de notoriété" ) ) ;
		
		// VOTRE CODE ICI - Question 6
		modeleListePraticiensCoeffNot = new ModeleListePraticiensCoeffNot();
		tabPraticiens = new JTable(modeleListePraticiensCoeffNot);
		
		this.tabPraticiens.setRowHeight(30);
		
		JScrollPane spPraticiens = new JScrollPane(this.tabPraticiens);
		
		spPraticiens.setPreferredSize(new Dimension(880,500));
		
		boxTable.add(spPraticiens);
		
		//application du rendu de la vue
		this.tabPraticiens.setDefaultRenderer(String.class, new RenduCellulePraticienCoeffNot());
		this.tabPraticiens.setDefaultRenderer(Float.class, new RenduCellulePraticienCoeffNot());
		this.tabPraticiens.setDefaultRenderer(DateFr.class, new RenduCellulePraticienCoeffNot());
		this.tabPraticiens.setDefaultRenderer(Integer.class, new RenduCellulePraticienCoeffNot());
		this.tabPraticiens.setDefaultRenderer(JButton.class, new RenduCellulePraticienCoeffNot());
		//application du rendu du bouton
		//this.tabVisiteurs.getColumn("Sélection").setCellRenderer(new RenduBoutonSelectionnerVisiteur());
		//application de l'éditeur du bouton
		//this.tabVisiteurs.getColumn("Sélection").setCellEditor(new EditeurBoutonSelectionnerVisiteur());
		
		boxPrincipale.add( boxEtiquette ) ;
		boxPrincipale.add( boxTable ) ;
		
		this.add( boxPrincipale ) ;
		
	}
	
	
	
	public ModeleListePraticiensCoeffConf getModelePraticienCoeffConf() {
		return modeleListePraticiensCoeffConf;
	}
	
	public ModeleListePraticiensDate getModelePraticienDate() {
		return modeleListePraticiensDate;
	}
	
	public ModeleListePraticiensCoeffNot getModelePraticienCoeffNot() {
		return modeleListePraticiensCoeffNot;
	}

	public JTable getTabPraticiens() {
		return tabPraticiens;
	}

}
