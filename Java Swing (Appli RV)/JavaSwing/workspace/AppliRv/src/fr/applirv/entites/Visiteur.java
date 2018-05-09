package fr.applirv.entites;

import fr.applirv.technique.DateFr;

public class Visiteur {
		
	private String visMatricule;
	private String visMdp;
	private String visNom;
	private String visPrenom;
	private String visAdresse;
	private String visCP;
	private String visVille;
	private DateFr visDateEmbauche ;
	private String secCode = null;
	private String labCode;
     
	
	public Visiteur(String visMatricule, String visNom, String visPrenom) {
		super();
		this.visMatricule = visMatricule;
		this.visNom = visNom;
		this.visPrenom = visPrenom;
	}
	
	

	public Visiteur(String visMatricule, String visMdp, String visNom, String visPrenom, String visAdresse,
			String visCP, String visVille, DateFr visDateEmbauche, String secCode, String labCode) {
		super();
		this.visMatricule = visMatricule;
		this.visMdp = visMdp;
		this.visNom = visNom;
		this.visPrenom = visPrenom;
		this.visAdresse = visAdresse;
		this.visCP = visCP;
		this.visVille = visVille;
		this.visDateEmbauche = visDateEmbauche;
		this.secCode = secCode;
		this.labCode = labCode;
	}

	public Visiteur(String visMatricule, String visMdp) {
		super();
		this.visMatricule = visMatricule;
		this.visMdp = visMdp;
	}

	public String getVisMatricule() {
		return visMatricule;
	}

	public void setVisMatricule(String visMatricule) {
		this.visMatricule = visMatricule;
	}

	public String getVisMdp() {
		return visMdp;
	}

	public void setVisMdp(String visMdp) {
		this.visMdp = visMdp;
	}
	
	public String getVisNom() {
		return visNom;
	}

	public void setVisNom(String visNom) {
		this.visNom = visNom;
	}

	public String getVisPrenom() {
		return visPrenom;
	}

	public void setVisPrenom(String visPrenom) {
		this.visPrenom = visPrenom;
	}

	public String getVisAdresse() {
		return visAdresse;
	}

	public void setVisAdresse(String visAdresse) {
		this.visAdresse = visAdresse;
	}

	public String getVisCP() {
		return visCP;
	}

	public void setVisCP(String visCP) {
		this.visCP = visCP;
	}

	public String getVisVille() {
		return visVille;
	}

	public void setVisVille(String visVille) {
		this.visVille = visVille;
	}

	public DateFr getVisDateEmbauche() {
		return visDateEmbauche;
	}

	public void setVisDateEmbauche(DateFr visDateEmbauche) {
		this.visDateEmbauche = visDateEmbauche;
	}

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public String getLabCode() {
		return labCode;
	}

	public void setLabCode(String labCode) {
		this.labCode = labCode;
	}

	@Override
	public String toString() {
		return "Visiteur [visMatricule=" + visMatricule + ", visMdp=" + visMdp + ", visNom=" + visNom + ", visPrenom="
				+ visPrenom + ", visAdresse=" + visAdresse + ", visCP=" + visCP + ", visVille=" + visVille
				+ ", visDateEmbauche=" + visDateEmbauche + ", secCode=" + secCode + ", labCode=" + labCode + "]";
	}
	
	
	

}
