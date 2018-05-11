package fr.AppliRV.technique;

import java.sql.Connection;
import java.sql.DriverManager;
import fr.AppliRV.technique.*;

public class ConnexionBD {
	
	//ici
	private static String dbURL ="jdbc:mysql://localhost:3306/GSB";
	private static String user = "root";
	private static String password = "azerty";
	
	private static Connection connexion = null;
	
	private ConnexionBD() throws ConnexionException {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connexion = (Connection) DriverManager.getConnection(dbURL, user, password);
		}
		catch(Exception e){
			System.out.println("Erreur ! : "+e.getMessage());
			throw new ConnexionException();
		}
		
	}
	
	public static Connection getConnexion() throws ConnexionException {
		
		if(connexion == null){
			new ConnexionBD();
		}
		return connexion ;
	}
}
