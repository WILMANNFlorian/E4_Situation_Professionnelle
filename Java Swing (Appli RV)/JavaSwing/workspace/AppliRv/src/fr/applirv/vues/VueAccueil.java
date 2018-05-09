package fr.applirv.vues;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;

public class VueAccueil extends JPanel {

	public VueAccueil(){
		super() ;
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo-gsb-300x186.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(60, 60, 300, 186);
		panel.add(lblNewLabel);
 
	}
}
