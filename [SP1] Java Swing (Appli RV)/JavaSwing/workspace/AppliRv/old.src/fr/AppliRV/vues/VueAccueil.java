package fr.AppliRV.vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.AppliRV.controleurs.ControleurAccueil;
import fr.AppliRV.modeles.ModeleGsbRvDr;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;

import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Window.Type;


public class VueAccueil extends JFrame {

	private JPanel contentPane;
	private JTextField fieldIdentifiant;
	private JPasswordField fieldMotDePasse;

	private JButton bConnecter = new JButton("Se connecter") ;
	
	
	
	
	ControleurAccueil controleur ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueAccueil frame = new VueAccueil();
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
	public VueAccueil() {
		
		this.controleur = new ControleurAccueil(this) ;
	
		
		/* PANEL PRINCIPAL */
		
		
		setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 12));
		setTitle("Accueil");
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
				
		
		/* PANEL CARD LAYOUT */
	
		
		final JPanel panelCardLayout = new JPanel();
		panelCardLayout.setBounds(163, 49, 671, 475);
		contentPane.add(panelCardLayout);
		JPanel p1 = panelCardLayout;
		final CardLayout cardLayout = new CardLayout(2,2);
		panelCardLayout.setLayout(cardLayout);
					
		/* PANEL ACCUEIL */
		
		
		// PANEL
		JPanel panelAccueil = new JPanel();
		panelCardLayout.add(panelAccueil, "Panel Accueil");
		panelAccueil.setBackground(new Color(238, 238, 238));
		panelAccueil.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelAccueil.setLayout(null);
		
		//LABEL
		JLabel lblIconGsb = new JLabel("");
		lblIconGsb.setBounds(170, 12, 327, 217);
		lblIconGsb.setIcon(new ImageIcon("/home/developpeur/Bureau/AppliRV/images/logo_gsb.png"));
		panelAccueil.add(lblIconGsb);
		
		// LABEL
		JLabel lblBienvenue = new JLabel("Bienvenue sur AppliRV");
		lblBienvenue.setBounds(227, 241, 213, 24);
		lblBienvenue.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 18));
		panelAccueil.add(lblBienvenue);
		
		// LABEL
		JLabel lblDescriptionApplication = new JLabel("Application d'enregistrement et de suivi des rapports de visite");
		lblDescriptionApplication.setBounds(116, 277, 435, 15);
		lblDescriptionApplication.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		panelAccueil.add(lblDescriptionApplication);
		
		// BOUTON S'AUTHENTIFIER
		JButton btnSAuthentifier = new JButton("S'authentifier");
		btnSAuthentifier.setBounds(244, 339, 179, 46);
		btnSAuthentifier.setBackground(UIManager.getColor("Button.darkShadow"));
		btnSAuthentifier.setForeground(Color.BLACK);
		btnSAuthentifier.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		panelAccueil.add(btnSAuthentifier);
		
		//ACTION BOUTON S'AUTHENTIFIER
		btnSAuthentifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelCardLayout, "Panel Authentification");
			}
		});
				
		// LABEL
		JLabel lblImformations = new JLabel("AppliRV© Version.0.1 by WILMANN-COURTEAU Florian & GUSMINI Vincent");
		lblImformations.setBounds(133, 432, 401, 31);
		lblImformations.setHorizontalAlignment(SwingConstants.CENTER);
		lblImformations.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 9));
		panelAccueil.add(lblImformations);
						
						
		/* PANEL AUTHENTIFICATION */
				
		
		//PANEL
		JPanel panelAuthentification = new JPanel();
		panelCardLayout.add(panelAuthentification, "Panel Authentification");
		panelAuthentification.setBackground(UIManager.getColor("Button.background"));
		panelAuthentification.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelAuthentification.setLayout(null);
						
		// LABEL
		JLabel lblIconGsb2 = new JLabel("");
		lblIconGsb2.setIcon(new ImageIcon("/home/developpeur/Bureau/AppliRV/images/logo_gsb.png"));
		lblIconGsb2.setBounds(170, 12, 327, 217);
		panelAuthentification.add(lblIconGsb2);
						
		// LABEL
		JLabel lblAuthentification = new JLabel("Authentification");
		lblAuthentification.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 18));
		lblAuthentification.setBounds(256, 241, 154, 24);
		panelAuthentification.add(lblAuthentification);
		
		// BOUTON SE CONNECTER
		bConnecter.setForeground(Color.BLACK);
		bConnecter.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		bConnecter.setBackground(UIManager.getColor("Button.darkShadow"));
		bConnecter.setBounds(244, 374, 179, 46);
		panelAuthentification.add(bConnecter);
		

		// LABEL
		JLabel lblImformations2 = new JLabel("AppliRV© Version.0.1 by WILMANN-COURTEAU Florian & GUSMINI Vincent");
		lblImformations2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImformations2.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 9));
		lblImformations2.setBounds(132, 432, 402, 31);
		panelAuthentification.add(lblImformations2);
		
		
		/* PANEL CONNEXION */
		
		
		// PANEL
		JPanel panelConnexion = new JPanel();
		panelConnexion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelConnexion.setBounds(170, 277, 327, 85);
		panelAuthentification.add(panelConnexion);
		panelConnexion.setLayout(null);
		
		// LABEL
		JLabel lblIdentifiant = new JLabel("Identifiant");
		lblIdentifiant.setBounds(33, 12, 81, 15);
		panelConnexion.add(lblIdentifiant);
		lblIdentifiant.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		
		// IDENTIFIANT TEXT FIELD
		fieldIdentifiant = new JTextField();
		fieldIdentifiant.setBounds(12, 39, 114, 24);
		panelConnexion.add(fieldIdentifiant);
		fieldIdentifiant.setColumns(10);
		
		// RECUPERATION IDENTIFIANT TEXT FIELD
		this.fieldIdentifiant.setText("");
		
		// LABEL
		JLabel lblMotDePasse = new JLabel("Mot de Passe");
		lblMotDePasse.setBounds(214, 12, 101, 15);
		panelConnexion.add(lblMotDePasse);
		lblMotDePasse.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		
		// PASSWORD TEXT FIELD
		fieldMotDePasse = new JPasswordField();
		fieldMotDePasse.setBounds(201, 39, 114, 24);
		panelConnexion.add(fieldMotDePasse);
		
		// RECUPERATION PASSWORD TEXT FIELD
		this.fieldMotDePasse.setText("");
		
		
		/* PANEL ECHEC AUTHENTIFICATION */
		
		// PANEL
		JPanel panelEchecAuthentification = new JPanel();
		panelEchecAuthentification.setLayout(null);
		panelEchecAuthentification.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelEchecAuthentification.setBackground(UIManager.getColor("Button.background"));
		panelCardLayout.add(panelEchecAuthentification, "Panel Echec Authentification");
		
		// LABEL
		JLabel lblIconGsb3 = new JLabel("");
		lblIconGsb3.setIcon(new ImageIcon("/root/Bureau/AppliRV/images/logo_gsb.png"));
		lblIconGsb3.setBounds(170, 12, 327, 217);
		panelEchecAuthentification.add(lblIconGsb3);
		
		/* BOUTON RETOUR */
		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(Color.BLACK);
		btnRetour.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 13));
		btnRetour.setBackground(UIManager.getColor("Button.darkShadow"));
		btnRetour.setBounds(244, 374, 179, 46);
		panelEchecAuthentification.add(btnRetour);
		
		// ACTION BOUTON RETOUR
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelCardLayout, "Panel Authentification");			
			}
		});

		// LABEL
		JLabel lblCredit = new JLabel("AppliRV© Version.0.1 by WILMANN-COURTEAU Florian & GUSMINI Vincent");
		lblCredit.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredit.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 9));
		lblCredit.setBounds(135, 432, 396, 31);
		panelEchecAuthentification.add(lblCredit);
		

		/* PANEL DECONNEXION MESSAGE */
		
		
		// PANEL
		JPanel panelDecoMessage = new JPanel();
		panelDecoMessage.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelDecoMessage.setBounds(170, 277, 327, 85);
		panelEchecAuthentification.add(panelDecoMessage);
		panelDecoMessage.setLayout(null);
		
		// LABEL
		JLabel lblIDOuMdpIncorrect = new JLabel("Identifiant ou mot de passe incorrect");
		lblIDOuMdpIncorrect.setBounds(14, 32, 298, 21);
		panelDecoMessage.add(lblIDOuMdpIncorrect);
		lblIDOuMdpIncorrect.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 15));
		
		// LABEL
		JLabel lblEchecDeLauthentification = new JLabel("Echec de l'Authentification");
		lblEchecDeLauthentification.setBounds(200, 241, 254, 24);
		panelEchecAuthentification.add(lblEchecDeLauthentification);
		lblEchecDeLauthentification.setFont(new Font("Droid Naskh Shift Alt", Font.BOLD, 18));
	}
	
	public void initialiser(){
		this.fieldMotDePasse.setText("");
		this.fieldIdentifiant.setText("");
	}
	
	public JTextField getIdentifiant(){
		return fieldIdentifiant;
		}
	
	public JPasswordField getMotDePasse(){
		return fieldMotDePasse;
	}
	
	public JButton getbConnecter(){
		return bConnecter ;
	}
}

