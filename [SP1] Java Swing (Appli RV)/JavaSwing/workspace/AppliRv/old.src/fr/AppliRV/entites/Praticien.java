package fr.AppliRV.entites;

public class Praticien {

	private int numP;
	private int codeP;
	private String nomP;
	private String prenomP;
	private String adrP;
	private String cpP;
	private String villeP;
	private int coefNotorieteP;
	// ?? coefConfianceP; // à mettre en relation avec coefConfiance du dernier RapportVisite
	
	
	

	
	
	public int getNumP() {
		return numP;
	}
	
	public void setNumP(int numP) {
		this.numP = numP;
	}
	
	
	public int getCodeP() {
		return codeP;
	}
	
	public void setCodeP(int codeP) {
		this.codeP = codeP;
	}
	
	
	public String getNomP() {
		return nomP;
	}
	
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	
	
	public String getPrenomP() {
		return prenomP;
	}
	
	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}
	
	
	public String getAdrP() {
		return adrP;
	}
	
	public void setAdrP(String adrP) {
		this.adrP = adrP;
	}
	
	
	public String getCpP() {
		return cpP;
	}
	
	public void setCpP(String cpP) {
		this.cpP = cpP;
	}
	
	
	public String getVilleP() {
		return villeP;
	}
	
	public void setVilleP(String villeP) {
		this.villeP = villeP;
	}
	
	
	public int getCoefNotorieteP() {
		return coefNotorieteP;
	}
	
	public void setCoefNotorieteP(int coefNotorieteP) {
		this.coefNotorieteP = coefNotorieteP;
	}

	@Override
	public String toString() {
		return "Praticien [numP=" + numP + ", codeP=" + codeP + ", nomP=" + nomP + ", prenomP=" + prenomP + ", adrP="
				+ adrP + ", cpP=" + cpP + ", villeP=" + villeP + ", coefNotorieteP=" + coefNotorieteP + "]";
	}
	
	
	
}
