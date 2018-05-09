package fr.applirv.entites;

import fr.applirv.technique.DateFr;

public class Praticien {
	
	private String identifiant;
	private String nom;
	private String prenom;
	private String ville;
	private float coeffNotoriete;
	private float coeffConfiance;
	private String specialite;
	private DateFr dateVisite;
	
	
	
	
	public Praticien(String identifiant, String nom, String prenom, String ville, float coeffNotoriete,
			float coeffConfiance, String specialite, DateFr dateVisite) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.coeffNotoriete = coeffNotoriete;
		this.coeffConfiance = coeffConfiance;
		this.specialite = specialite;
		this.dateVisite = dateVisite;
	}
	
	public Praticien(String identifiant, String nom, String prenom, String specialite, 
			 float coeffNotoriete, float coeffConfiance) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.coeffNotoriete = coeffNotoriete;
		this.coeffConfiance = coeffConfiance;
		this.specialite = specialite;
	}


	public Praticien(String identifiant, String nom, String prenom) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public float getCoeffNotoriete() {
		return coeffNotoriete;
	}


	public void setCoeffNotoriete(float coeffNotoriete) {
		this.coeffNotoriete = coeffNotoriete;
	}


	public float getCoeffConfiance() {
		return coeffConfiance;
	}


	public void setCoeffConfiance(float coeffConfiance) {
		this.coeffConfiance = coeffConfiance;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public DateFr getDateVisite() {
		return dateVisite;
	}


	public void setDateVisite(DateFr dateVisite) {
		this.dateVisite = dateVisite;
	}


	@Override
	public String toString() {
		return "Praticien [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", ville=" + ville
				+ ", coeffNotoriete=" + coeffNotoriete + ", coeffConfiance=" + coeffConfiance + ", specialite="
				+ specialite + ", dateVisite=" + dateVisite + "]";
	}


	
	
	
	

}
