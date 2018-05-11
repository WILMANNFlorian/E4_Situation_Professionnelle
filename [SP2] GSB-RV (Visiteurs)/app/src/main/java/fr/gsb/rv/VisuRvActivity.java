package fr.gsb.rv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import fr.gsb.rv.entites.Medicament;
import fr.gsb.rv.entites.Motif;
import fr.gsb.rv.entites.Praticien;
import fr.gsb.rv.entites.RapportVisite;
import fr.gsb.rv.entites.RapportVisiteParce;
import fr.gsb.rv.entites.Visiteur;

public class VisuRvActivity extends AppCompatActivity {

    TextView tVBilanRapport;
    TextView tVCoefficientRapport;
    TextView tVDateVisiteRapport;
    TextView tVDateRedactionRapport;
    TextView tVPraticienRapport;
    TextView tVMotif_Rapport;
    TextView tVRapportRapport;

    int numero;
    String bilan;
    int coefConfiance;
    GregorianCalendar dateVisite;
    GregorianCalendar dateRedaction;
    boolean lu;

    Praticien lePraticien;
    Visiteur leVisiteur;
    Motif leMotif;
    Map<Medicament, Integer> lesEchantillons = new HashMap<Medicament, Integer>();
    RapportVisite rapportVisite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Instanciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visu_rv);

        // Création des variables par rapport à activity_visu_rv.xml
        tVBilanRapport = (TextView) findViewById(R.id.tVBilanRapport);
        tVCoefficientRapport = (TextView) findViewById(R.id.tVCoefficientRapport);
        tVDateVisiteRapport = (TextView) findViewById(R.id.tVDateVisiteRapport);
        tVDateRedactionRapport = (TextView) findViewById(R.id.tVDateRedactionRapport);
        tVPraticienRapport = (TextView) findViewById(R.id.tVPraticienRapport);
        tVMotif_Rapport = (TextView) findViewById(R.id.tVMotif_Rapport);
        tVRapportRapport = (TextView) findViewById(R.id.tVRapportRapport);

        // Récupération du Bundle
        Intent intent = getIntent();
        RapportVisiteParce rap = intent.getParcelableExtra("rapportVisite");

        // Implémentation champs
        tVBilanRapport.setText(rap.getBilan());
        tVCoefficientRapport.setText(String.valueOf(rap.getCoefConfiance()));
        tVDateVisiteRapport.setText(rap.getDateVisite());
        tVMotif_Rapport.setText(rap.getMotif());
        tVPraticienRapport.setText(String.valueOf(rap.getPraticien()));
        tVRapportRapport.setText(String.valueOf(rap.getNumero()));

    }
}
