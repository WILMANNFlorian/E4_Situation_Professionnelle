package fr.applirv.entites;

import fr.applirv.technique.DateFr;


public class RapportVisite {
	
	
	private Visiteur visiteur;
	private Praticien praticien;
	private String numero;
	private String bilan;
	private String vu;
	private String motif;
	private DateFr date;
	
	
	public RapportVisite(Visiteur visiteur, Praticien praticien, String numero, String bilan, String vu, String motif,
			DateFr date) {
		super();
		this.visiteur = visiteur;
		this.praticien = praticien;
		this.numero = numero;
		this.bilan = bilan;
		this.vu = vu;
		this.motif = motif;
		this.date = date;
	}


	public Visiteur getVisiteur() {
		return visiteur;
	}


	public void setVisiteur(Visiteur visiteur) {
		this.visiteur = visiteur;
	}


	public Praticien getPraticien() {
		return praticien;
	}


	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getBilan() {
		return bilan;
	}


	public void setBilan(String bilan) {
		this.bilan = bilan;
	}


	public String getVu() {
		return vu;
	}


	public void setVu(String vu) {
		this.vu = vu;
	}


	public String getMotif() {
		return motif;
	}


	public void setMotif(String motif) {
		this.motif = motif;
	}


	public DateFr getDate() {
		return date;
	}


	public void setDate(DateFr date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "RapportVisite [visiteur=" + visiteur + ", praticien=" + praticien + ", numero=" + numero + ", bilan="
				+ bilan + ", vu=" + vu + ", motif=" + motif + ", date=" + date + "]";
	}

	
	
}
