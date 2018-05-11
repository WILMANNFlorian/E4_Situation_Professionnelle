package fr.AppliRV.entites;

import javax.swing.JPasswordField;

import fr.AppliRV.technique.DateFr;

public class Visiteur {
	
	private String matriculeV;
	private String nomV;
	private String prenomV ;
	private JPasswordField mdpV;
	private String adrV;
	private String cpV;
	private String villeV;
	private DateFr dateEmbaucheV;
	private String secCodeV;
	private String labCodeV;
	
	
	public Visiteur(String matriculeV, String nomV, String prenomV, String adrV, String cpV, String villeV,
			DateFr dateEmbaucheV, String secCodeV, String labCodeV) {
		super();
		this.matriculeV = matriculeV;
		this.nomV = nomV;
		this.prenomV = prenomV;
		this.adrV = adrV;
		this.cpV = cpV;
		this.villeV = villeV;
		this.dateEmbaucheV = dateEmbaucheV;
		this.secCodeV = secCodeV;
		this.labCodeV = labCodeV;
	}

	public Visiteur() {
		super();
	}




	//Get + Set
	
	public String getMatriculeV() {
		
		return matriculeV;
	}
	
	public void setMatriculeV(String matriculeV) {
		this.matriculeV = matriculeV;
	}
	
	
	public String getNomV() {
		return nomV;
	}
	
	public void setNomV(String nomV) {
		this.nomV = nomV;
	}
	
	
	public String getPrenomV() {
		return prenomV;
	}
	
	public void setPrenomV(String prenomV) {
		this.prenomV = prenomV;
	}
	
	
	public JPasswordField getMdpV() {
		return mdpV;
	}
	
	public void setMdpV(JPasswordField mdpV) {
		this.mdpV = mdpV;
	}
	
	
	public String getAdrV() {
		return adrV;
	}
	
	public void setAdrV(String adrV) {
		this.adrV = adrV;
	}
	
	
	public String getCpV() {
		return cpV;
	}
	
	public void setCpV(String cpV) {
		this.cpV = cpV;
	}
	
	
	public String getVilleV() {
		return villeV;
	}
	
	public void setVilleV(String villeV) {
		this.villeV = villeV;
	}
	
	
	public DateFr getDateEmbaucheV() {
		return dateEmbaucheV;
	}
	
	public void setDateEmbaucheV(DateFr dateEmbaucheV) {
		this.dateEmbaucheV = dateEmbaucheV;
	}
	
	
	public String getSecCodeV() {
		return secCodeV;
	}
	
	public void setSecCodeV(String secCodeV) {
		this.secCodeV = secCodeV;
	}
	
	
	public String getLabCodeV() {
		return labCodeV;
	}
	
	public void setLabCodeV(String labCodeV) {
		this.labCodeV = labCodeV;
	}

	@Override
	public String toString() {
		return "Visiteur [matriculeV=" + matriculeV + ", nomV=" + nomV + ", prenomV=" + prenomV + ", mdpV=" + mdpV
				+ ", adrV=" + adrV + ", cpV=" + cpV + ", villeV=" + villeV + ", dateEmbaucheV=" + dateEmbaucheV
				+ ", secCodeV=" + secCodeV + ", labCodeV=" + labCodeV + "]";
	}
	
	
	
	
	
	
}
