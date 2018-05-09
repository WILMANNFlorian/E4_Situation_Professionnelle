package fr.AppliRV;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.AppliRV.entites.Visiteur;
import fr.AppliRV.modeles.ModeleGsbRvDr;
import fr.AppliRV.technique.ConnexionBD;
import fr.AppliRV.technique.Session;
import fr.AppliRV.vues.VueAccueil;

public class AppRV {

	public static void main(String[] args) throws Exception {
		
		//System.out.println("avant accueil()");
		
		new VueAccueil();
		
		//System.out.println("apres accueil()");		
		
		
		
		
		/*
		ModeleGsbRvDr model = new ModeleGsbRvDr();
		String matriculeX = .getIdentifiant();
		String mdpX = .getMdp();
		
		System.out.println("id : "+ matriculeX + "mdp: "+ mdpX);*/
		
		/*
		String matriculeX = "a17";
		String mdpX = "azerty";
		
		Boolean connexionOk = model.seConnecter(matriculeX,mdpX);
		
		if(connexionOk){
			Visiteur v = new Visiteur();
			v.setMatriculeV(matriculeX);		
			Session.ouvrir(v);
			System.out.println("Connexion OK !");
		}

		else{
			System.out.println("Connexion PAS OK");
		}
		*/
		
		/////
		
		
		//System.out.println("1) list visit : " + model.listVisiteurs());
		//System.out.println("2) list Rapportvisit : " + model.listRapportVisiteur(matriculeX, 10, 2017));
		//System.out.println("3) RapportVisit : " + model.RapportVisiteur(0));
		//System.out.println("4) list PratHesi : " + model.listPratHesi());
		
		
		
		
		
		
		
		
		
		
		
	}

}
