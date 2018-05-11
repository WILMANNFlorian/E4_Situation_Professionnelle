package fr.gsb.rv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.GregorianCalendar;
import java.util.List;

public class RechercherRvActivity extends AppCompatActivity{

    private static final String [] lesAnnees = {"2010","2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
    private static final String [] lesMois = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
    Spinner spinnerMois, spinnerAnnee;
    Button btnAfficher;


    protected void onCreate(Bundle savedInstanceState) {

        // Instanciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechercher_rv);

        // Création des variables par rapport à activity_recherche_rv.xml
        btnAfficher = (Button) findViewById(R.id.btnAfficher);
        spinnerAnnee = (Spinner) findViewById(R.id.spinnerAnnee);
        spinnerMois = (Spinner) findViewById(R.id.spinnerMois);

        // Création Adapteur Année
        ArrayAdapter<String> aaAnnees = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,lesAnnees);
        aaAnnees.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAnnee.setAdapter(aaAnnees);

        // Création Adapteur Mois
        ArrayAdapter<String> aaMois = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item ,lesMois);
        aaMois.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMois.setAdapter(aaMois);

    }


    public void afficher(View vue){

        // Création du paquet
        Bundle paquet = new Bundle();
        paquet.putString("annee", spinnerAnnee.getSelectedItem().toString());
        paquet.putString("mois", spinnerMois.getSelectedItem().toString());

        // Envoie du paquet à ListeRvActivity
        Intent intentAfficher = new Intent(this, ListRapportRvActivity.class);
        intentAfficher.putExtras(paquet);
        startActivity(intentAfficher);

    }


}
