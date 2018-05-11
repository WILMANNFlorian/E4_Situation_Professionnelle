package fr.applirv.technique;

public class ConnexionException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public String getMessage(){
		return "Erreur de connexion BD";
	}

}
