package fr.applirv.technique;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/** Représenter une date
 * @author xilim
 *
 */
public class DateFr  extends GregorianCalendar{

	private static final long serialVersionUID = 1L;
	
	private int jour ;
	private int mois ;
	private int annee ;
	
	public DateFr(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	public DateFr(String dateSql) {
		super();
		//decoupe date SQL
		StringTokenizer explodeString = new StringTokenizer(dateSql, "-");
		//List (annee, mois, jour)
		ArrayList<Integer> date = new ArrayList<Integer>();
	    while (explodeString.hasMoreTokens()) {
	    	//parcours la decoupe
	        String valeurExplode = explodeString.nextToken();
	        //rentre chaque valeur dans la liste (0:annnee;1:mois;2:jour)
	        date.add(Integer.parseInt(valeurExplode));
	    }
	    //créer une dateFR avec la DateSQL 
	    this.jour = date.get(2);
		this.mois = date.get(1);
		this.annee = date.get(0);
	}

	public DateFr(){
		super(new GregorianCalendar().get(Calendar.YEAR),new GregorianCalendar().get(Calendar.MONTH),new GregorianCalendar().get(Calendar.DAY_OF_MONTH)) ;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d" , jour , mois , annee ) ;
	}
	
	
	
	
}
