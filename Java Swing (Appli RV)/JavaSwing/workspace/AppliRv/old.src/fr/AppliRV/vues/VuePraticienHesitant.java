package fr.AppliRV.vues;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class VuePraticienHesitant extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VuePraticienHesitant frame = new VuePraticienHesitant();
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
	public VuePraticienHesitant() {

		
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
		panelCardLayout.setBounds(12, 135, 641, 322);
		panelPraticiensHesitants.add(panelCardLayout);
		final CardLayout cardLayout = new CardLayout(3 , 3);
		panelCardLayout.setLayout( cardLayout );
		
		
		/* PANEL COEFFICIENT DE CONFIANCE */
		
			// PANEL
			JPanel PanelCoeffConf = new JPanel();			
			panelCardLayout.add(PanelCoeffConf, "Panel Coefficient de Confiance");
			PanelCoeffConf.setLayout(null);
			
			// LABEL
			JLabel lblCoeffConf = new JLabel("Panel Coefficient de confiance");
			lblCoeffConf.setBounds(210, 150, 214, 15);
			PanelCoeffConf.add(lblCoeffConf);
		
				
		/* PANEL TEMPS ECOULE */
		
				
			// PANEL
			JPanel PanelTempsEcoule = new JPanel();
			panelCardLayout.add(PanelTempsEcoule, "Panel Temps Ecoulé");
			PanelTempsEcoule.setLayout(null);
			
			// LABEL
			JLabel lblTempsEcoulé = new JLabel("Panel Temps Ecoulé");
			lblTempsEcoulé.setBounds(242, 150, 151, 15);
			PanelTempsEcoule.add(lblTempsEcoulé);
			
			
		/* PANEL COEFFICIENT DE NOTORIETE */
		
			
			// PANEL
			JPanel PanelCoeffNoto = new JPanel();
			panelCardLayout.add(PanelCoeffNoto, "Panel Coefficient de Notoriété");
			PanelCoeffNoto.setLayout(null);
			
			//LABEL
			JLabel lblCoeffNoto = new JLabel("Panel Coeffecient de notoriété");
			lblCoeffNoto.setBounds(197, 150, 241, 15);
			PanelCoeffNoto.add(lblCoeffNoto);
		
			
		/* BUTTONS DU PANEL PRINCIPAL */
			
			
		// BUTTON TEMPS ECOULE
		JButton btnTempsEcoule = new JButton("Temps écoulé");
		btnTempsEcoule.setBounds(233, 88, 195, 33);
		btnTempsEcoule.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		panelPraticiensHesitants.add(btnTempsEcoule);
		
		// ACTION BUTTON TEMPS ECOULE
		btnTempsEcoule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "Panel Temps Ecoulé");
			}
		});
		
		// BUTTON COEFFICIENT CONFIANCE
		JButton btnCoeffConf = new JButton("Coefficient de confiance");
		btnCoeffConf.setBounds(12, 88, 209, 32);
		btnCoeffConf.setForeground(UIManager.getColor("Button.foreground"));
		btnCoeffConf.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		btnCoeffConf.setBackground(UIManager.getColor("Button.select"));
		
		// ACTION BUTTON COEFFCIENT CONFIANCE
		panelPraticiensHesitants.add(btnCoeffConf);
		btnCoeffConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelCardLayout, "Panel Coefficient de Confiance");
			}
		});
		
		// BUTTON COEFFICIENT DE NOTORIETE
		JButton btnCoeffNoto = new JButton("Coefficient de notoriété");
		btnCoeffNoto.setBounds(444, 87, 209, 34);
		btnCoeffNoto.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		panelPraticiensHesitants.add(btnCoeffNoto);
		
		// ACTION BUTTON COEFFICIENT DE NOTORIETE
		btnCoeffNoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(panelCardLayout, "Panel Coefficient de Notoriété");
			}
		});

		
		/* PANEL DECORATION PARTICIENS HESITANTS */
		
		
		// PANEL
		JPanel panelDeco = new JPanel();
		panelDeco.setBounds(143, 12, 379, 48);
		panelDeco.setLayout(null);
		panelDeco.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPraticiensHesitants.add(panelDeco);
		
		// LABEL
		JLabel label = new JLabel("Trier les Praticiens Hésitants");
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 20));
		label.setBounds(36, 12, 307, 24);
		panelDeco.add(label);


		
	}

	}
