package fr.gsb.rv.entites;

import java.util.HashMap;
import java.util.Map;

public class RapportVisite {

	private int numero ;
	private String bilan ;
	private int coefConfiance ;
	private String dateVisite ;
	private int lu ;

	private int lePraticien ;
	private Visiteur leVisiteur ;
	private String leMotif ;
	private Map<Medicament,Integer> lesEchantillons = new HashMap<Medicament,Integer>() ;

	public RapportVisite() {
		super();
	}

	public RapportVisite(int numero, String bilan, int coefConfiance,
						 String dateVisite,int lu) {
		super();
		this.numero = numero;
		this.bilan = bilan;
		this.coefConfiance = coefConfiance;
		this.dateVisite = dateVisite;
		this.lu = lu;
	}

	public RapportVisite(int numero, String bilan, int coefConfiance,
						 String dateVisite,int lu, int lePraticien, Visiteur leVisiteur, String leMotif) {
		super();
		this.numero = numero;
		this.bilan = bilan;
		this.coefConfiance = coefConfiance;
		this.dateVisite = dateVisite;
		this.lu = lu;
		this.lePraticien = lePraticien;
		this.leVisiteur = leVisiteur;
		this.leMotif = leMotif ;
	}


	public RapportVisite(int numero, String bilan, int coefConfiance,
						 String dateVisite,int lu, String leMotif, int praticien) {
		super();
		this.numero = numero;
		this.bilan = bilan;
		this.coefConfiance = coefConfiance;
		this.dateVisite = dateVisite;
		this.lu = lu;
		this.leMotif = leMotif ;
		this.lePraticien = praticien;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBilan() {
		return bilan;
	}

	public void setBilan(String bilan) {
		this.bilan = bilan;
	}

	public int getCoefConfiance() {
		return coefConfiance;
	}

	public void setCoefConfiance(int coefConfiance) {
		this.coefConfiance = coefConfiance;
	}

	public String getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(String dateVisite) {
		this.dateVisite = dateVisite;
	}

	public int isLu() {
		return lu;
	}

	public void setLu(int lu) {
		this.lu = lu;
	}

	public int getLePraticien() {
		return lePraticien;
	}

	public void setLePraticien(int lePraticien) {
		this.lePraticien = lePraticien;
	}

	public Visiteur getLeVisiteur() {
		return leVisiteur;
	}

	public void setLeVisiteur(Visiteur leVisiteur) {
		this.leVisiteur = leVisiteur;
	}

	public String getLeMotif() {
		return leMotif;
	}

	public void setLeMotif(String leMotif) {
		this.leMotif = leMotif;
	}

	public Map<Medicament, Integer> getLesEchantillons() {
		return lesEchantillons;
	}



	@Override
	public String toString() {
		return "RapportVisite{" +
				"numero=" + numero +
				", bilan='" + bilan + '\'' +
				", coefConfiance=" + coefConfiance +
				", dateVisite='" + dateVisite + '\'' +
				", lu=" + lu +
				'}';
	}
}
