package fr.gsb.rv.entites;

import android.os.Parcel;
import android.os.Parcelable;



public class RapportVisiteParce implements Parcelable {


    private int numero ;
    private String bilan ;
    private int coefConfiance ;
    private String dateVisite ;
    private int lu ;
    private String motif ;
    private int praticien;

    public RapportVisiteParce(int numero, String bilan, int coefConfiance, String dateVisite, int lu, String motif, int praticien) {
        this.numero = numero;
        this.bilan = bilan;
        this.coefConfiance = coefConfiance;
        this.dateVisite = dateVisite;
        this.lu = lu;
        this.motif = motif ;
        this.praticien = praticien ;
    }


    protected RapportVisiteParce(Parcel in) {
        numero = in.readInt();
        bilan = in.readString();
        coefConfiance = in.readInt();
        dateVisite = in.readString();
        lu = in.readInt();
        motif = in.readString();
        praticien = in.readInt();
    }

    public static final Creator<RapportVisiteParce> CREATOR = new Creator<RapportVisiteParce>() {
        @Override
        public RapportVisiteParce createFromParcel(Parcel in) {
            return new RapportVisiteParce(in);
        }

        @Override
        public RapportVisiteParce[] newArray(int size) {
            return new RapportVisiteParce[size];
        }
    };

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

    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public int getPraticien() {
        return praticien;
    }

    public void setPraticien(int praticien) {
        this.praticien = praticien;
    }

    public static Creator<RapportVisiteParce> getCREATOR() {
        return CREATOR;
    }

    @Override
    public String toString() {
        return "RapportVisiteParce{" +
                "numero=" + numero +
                ", bilan='" + bilan + '\'' +
                ", coefConfiance=" + coefConfiance +
                ", dateVisite='" + dateVisite + '\'' +
                ", lu=" + lu +
                ", motif='" + motif + '\'' +
                '}';

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(numero);
        parcel.writeString(bilan);
        parcel.writeInt(coefConfiance);
        parcel.writeString(dateVisite);
        parcel.writeInt(lu);
        parcel.writeString(motif);
        parcel.writeInt(praticien);
    }
}
