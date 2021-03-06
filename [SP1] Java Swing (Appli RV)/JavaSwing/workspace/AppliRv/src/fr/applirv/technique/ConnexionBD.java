package fr.applirv.technique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnexionBD {
	
	private static String dbURL = "jdbc:mysql://localhost:3306/GSBB";
	private static String user = "root";
	private static String password = "azerty";
	private static Connection connexion =null;
	
	
	private ConnexionBD() throws ConnexionException {
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Etape 2 : récupération de la connexion
			connexion = DriverManager.getConnection(dbURL, user, password);
		}
		catch(Exception e){
			System.out.println("Erreur ! : " + e.getMessage());
			String exception = new ConnexionException().getMessage() ;
			
		}
	}
	
	public static Connection getConnexion() throws ConnexionException {
		if (connexion == null){
			new ConnexionBD();
		}
		return connexion;
	}

}
