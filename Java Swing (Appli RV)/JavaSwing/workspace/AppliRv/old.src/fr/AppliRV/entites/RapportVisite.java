package fr.AppliRV.entites;

import fr.AppliRV.technique.DateFr;

public class RapportVisite {

	private int numRap;
	private String matriculeVisRap ;
	private int numPratRap;
	private String bilanRap;
	private DateFr dateRap;
	private DateFr dateRedacRap;
	private int coefConfianceRap;
	private int indiceConvaincuRap;
	private int luRap;
	private String idMotifRap;
	
	
	
	
	
	public int getNumRap() {
		return numRap;
	}
	
	public void setNumRap(int numRap) {
		this.numRap = numRap;
	}
	
	public String getMatriculeVisRap() {
		return matriculeVisRap;
	}
	
	public void setMatriculeVisRap(String matriculeVisRap) {
		this.matriculeVisRap = matriculeVisRap;
	}
	
	public int getNumPratRap() {
		return numPratRap;
	}
	
	public void setNumPratRap(int numPratRap) {
		this.numPratRap = numPratRap;
	}
	
	public String getBilanRap() {
		return bilanRap;
	}
	
	public void setBilanRap(String bilanRap) {
		this.bilanRap = bilanRap;
	}
	
	public DateFr getDateRap() {
		return dateRap;
	}
	
	public void setDateRap(DateFr dateRap) {
		this.dateRap = dateRap;
	}
	
	public DateFr getDateRedacRap() {
		return dateRedacRap;
	}
	
	public void setDateRedacRap(DateFr dateRedacRap) {
		this.dateRedacRap = dateRedacRap;
	}
	
	public int getCoefConfianceRap() {
		return coefConfianceRap;
	}
	
	public void setCoefConfianceRap(int coefConfianceRap) {
		this.coefConfianceRap = coefConfianceRap;
	}
	
	public int getIndiceConvaincuRap() {
		return indiceConvaincuRap;
	}
	
	public void setIndiceConvaincuRap(int indiceConvaincuRap) {
		this.indiceConvaincuRap = indiceConvaincuRap;
	}
	
	public int getLuRap() {
		return luRap;
	}
	
	public void setLuRap(int luRap) {
		this.luRap = luRap;
	}
	
	public String getIdMotifRap() {
		return idMotifRap;
	}
	
	public void setIdMotifRap(String idMotifRap) {
		this.idMotifRap = idMotifRap;
	}

	@Override
	public String toString() {
		return "RapportVisite [numRap=" + numRap + ", matriculeVisRap=" + matriculeVisRap + ", numPratRap=" + numPratRap
				+ ", bilanRap=" + bilanRap + ", dateRap=" + dateRap + ", dateRedacRap=" + dateRedacRap
				+ ", coefConfianceRap=" + coefConfianceRap + ", indiceConvaincuRap=" + indiceConvaincuRap + ", luRap="
				+ luRap + ", idMotifRap=" + idMotifRap + "]";
	}
	
	
	
	
}
