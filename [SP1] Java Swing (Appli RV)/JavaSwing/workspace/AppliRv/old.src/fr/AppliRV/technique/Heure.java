package fr.AppliRV.technique;

public class Heure {

	private int heures ;
	private int minutes ;
	
	public Heure() {
		super();
	}

	public Heure(int heures, int minutes) {
		super();
		this.heures = heures;
		this.minutes = minutes;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public boolean estAnterieure( Heure autre ){
		
		if( this.heures < autre.heures ){
			return true ;
		}
		else if( this.heures == autre.heures &&  this.minutes < autre.minutes ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public boolean estPosterieure( Heure autre ){
		
		if( this.heures > autre.heures ){
			return true ;
		}
		else if( this.heures == autre.heures &&  this.minutes > autre.minutes ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public boolean estIdentique( Heure autre ){
		
		if( this.heures == autre.heures && this.minutes == autre.minutes ){
			return true ;
		}
		else {
			return false ;
		}
	}


	@Override
	public String toString() {
		return String.format("%02d:%02d", this.heures, this.minutes) ;
	}
	
}
