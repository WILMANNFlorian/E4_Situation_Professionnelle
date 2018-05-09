package fr.AppliRV.vues;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class VueRapportVisite extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueRapportVisite frame = new VueRapportVisite();
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
	public VueRapportVisite() {

		
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
		
		// ACTION MENU ITEM VOIR LISTE PraticienS HESITANTS
		mntmVoirListePraticiensHesitants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		// SEPARATOR
		JSeparator separator = new JSeparator();
		menuBar.add(separator);
		
		
		/* PANEL PRINCIPAL*/
		
		
		JPanel panelPraticiensHesitants = new JPanel();
		panelPraticiensHesitants.setBounds(166, 52, 665, 469);
		contentPane.add(panelPraticiensHesitants);
		panelPraticiensHesitants.setLayout(null);
		
		
		/* PANEL CARD LAYOUT*/ 

		
		final JPanel panelCardLayout = new JPanel();
		panelCardLayout.setBounds(0, 0, 665, 469);
		panelPraticiensHesitants.add(panelCardLayout);
		final CardLayout cardLayout = new CardLayout(3 , 3);
		panelCardLayout.setLayout( cardLayout );
		
		
		/* PANEL COEFFICIENT DE CONFIANCE */
			
			JPanel panelRapportVisite = new JPanel();
			panelCardLayout.add(panelRapportVisite, "name_11640614276386");
			panelRapportVisite.setLayout(null);
			
			JPanel panelDecoRapportVisite = new JPanel();
			panelDecoRapportVisite.setLayout(null);
			panelDecoRapportVisite.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panelDecoRapportVisite.setBounds(140, 12, 379, 48);
			panelRapportVisite.add(panelDecoRapportVisite);
			
			JLabel lblRapportVisite = new JLabel("Rapport Visite");
			lblRapportVisite.setVerticalAlignment(SwingConstants.CENTER);
			lblRapportVisite.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 20));
			lblRapportVisite.setBounds(118, 12, 143, 24);
			panelDecoRapportVisite.add(lblRapportVisite);
			
			JPanel panel = new JPanel();
			panel.setBounds(12, 84, 635, 333);
			panelRapportVisite.add(panel);
			
			JButton button = new JButton("Fermer");
			button.setBounds(271, 426, 117, 25);
			panelRapportVisite.add(button);
		
			// PANEL
			JPanel PanelListeDesVisiteurs = new JPanel();
			panelCardLayout.add(PanelListeDesVisiteurs, "Panel Coefficient de Confiance");
			PanelListeDesVisiteurs.setLayout(null);
			
			JPanel panelDecoListeDesVisiteurs = new JPanel();
			panelDecoListeDesVisiteurs.setBounds(140, 12, 379, 48);
			panelDecoListeDesVisiteurs.setLayout(null);
			panelDecoListeDesVisiteurs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			PanelListeDesVisiteurs.add(panelDecoListeDesVisiteurs);
			
			JLabel lblListeDesVisiteurs = new JLabel("Liste des Visiteurs");
			lblListeDesVisiteurs.setVerticalAlignment(SwingConstants.CENTER);
			lblListeDesVisiteurs.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 20));
			lblListeDesVisiteurs.setBounds(97, 12, 185, 24);
			panelDecoListeDesVisiteurs.add(lblListeDesVisiteurs);
			
			JPanel panelTableauListeDesVisiteurs = new JPanel();
			panelTableauListeDesVisiteurs.setBounds(12, 84, 635, 333);
			PanelListeDesVisiteurs.add(panelTableauListeDesVisiteurs);
			
			JButton btnFermerListeDesVisiteurs = new JButton("Fermer");
			btnFermerListeDesVisiteurs.setBounds(271, 426, 117, 25);
			PanelListeDesVisiteurs.add(btnFermerListeDesVisiteurs);
		
				
		/* PANEL TEMPS ECOULE */
		
				
			// PANEL
			JPanel PanelListeRapportVisite = new JPanel();
			panelCardLayout.add(PanelListeRapportVisite, "Panel Temps Ecoulé");
			PanelListeRapportVisite.setLayout(null);
			
			JPanel panelDecoListeRapportVisite = new JPanel();
			panelDecoListeRapportVisite.setBounds(140, 12, 379, 48);
			panelDecoListeRapportVisite.setLayout(null);
			panelDecoListeRapportVisite.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			PanelListeRapportVisite.add(panelDecoListeRapportVisite);
			
			JLabel lblListerapportdevisite = new JLabel("Liste des Rapports de Visite");
			lblListerapportdevisite.setVerticalAlignment(SwingConstants.CENTER);
			lblListerapportdevisite.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 20));
			lblListerapportdevisite.setBounds(46, 12, 287, 24);
			panelDecoListeRapportVisite.add(lblListerapportdevisite);
			
			JPanel panelTableauListeRapportVisite = new JPanel();
			panelTableauListeRapportVisite.setBounds(12, 84, 635, 333);
			PanelListeRapportVisite.add(panelTableauListeRapportVisite);
			
			JButton btnFermerListeRapportVisite = new JButton("Fermer");
			btnFermerListeRapportVisite.setBounds(271, 426, 117, 25);
			PanelListeRapportVisite.add(btnFermerListeRapportVisite);


		
	}
	}
