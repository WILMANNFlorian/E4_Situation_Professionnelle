package fr.AppliRV.vues;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class VuePageVide extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VuePageVide frame = new VuePageVide();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VuePageVide() {

		
		/* PANEL PRINCIPAL */
		
		
		setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 12));
		setBackground(UIManager.getColor("CheckBoxMenuItem.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 378);
		this.setSize(1000,600) ;
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* MENU BAR */
		
		// MENU BAR
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 998, 27);
		contentPane.add(menuBar);
		menuBar.setBackground(Color.LIGHT_GRAY);
		
		// MENU
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		// MENU ITEM DECONNEXION
		JMenuItem mntmConnexion = new JMenuItem("Déconnexion");
		
		// ACTION MENU ITEM DECONNEXION
		mntmConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VueAccueil vue = new VueAccueil();
				vue.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmConnexion);
		
		// MENU
		JMenu mnRapportVisite = new JMenu("Rapport Visite");
		mnRapportVisite.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 15));
		menuBar.add(mnRapportVisite);
		
		// MENU ITEM VOIR LISTE RAPPORT VISITE
		JMenuItem mntmVoirListeRapportVisite = new JMenuItem("Voir liste");
		mnRapportVisite.add(mntmVoirListeRapportVisite);
		
		// ACTION MENU ITEM VOIR LISTE RAPPORT VISITE
		mntmVoirListeRapportVisite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VueRapportVisite vue = new VueRapportVisite();
				vue.setVisible(true);
				setVisible(false);
			}
		});
		
		// MENU
		JMenu mnPraticiensHesitants = new JMenu("Praticiens Hésitants");
		mnPraticiensHesitants.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 15));
		menuBar.add(mnPraticiensHesitants);
		
		// MENU ITEM PraticienS HESITANTS
		JMenuItem mntmVoirListePraticiensHesitants = new JMenuItem("Voir liste");
		mnPraticiensHesitants.add(mntmVoirListePraticiensHesitants);
		
		// ACTION MENU ITEM VOIR LISTE PRATICIENS HESITANTS
		mntmVoirListePraticiensHesitants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VuePraticienHesitant vue = new VuePraticienHesitant();
				vue.setVisible(true);
				setVisible(false);
			}
		});

		// SEPARATOR
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		
	}
}
