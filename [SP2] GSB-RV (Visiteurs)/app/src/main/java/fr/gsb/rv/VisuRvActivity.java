package fr.gsb.rv;

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
import fr.gsb.rv.entites.Visiteur;

public class VisuRvActivity extends AppCompatActivity {

    TextView tVBilanRapport ;
    TextView tVCoefficientRapport ;
    TextView tVDateVisiteRapport ;
    TextView tVDateRedactionRapport ;
    TextView tVPraticienRapport ;
    TextView tVModifRapport ;
    TextView tVRapportRapport ;

    int numero ;
    String bilan ;
    int coefConfiance ;
    GregorianCalendar dateVisite ;
    GregorianCalendar dateRedaction ;
    boolean lu ;

     Praticien lePraticien ;
     Visiteur leVisiteur ;
     Motif leMotif ;
     Map<Medicament,Integer> lesEchantillons = new HashMap<Medicament,Integer>() ;
     RapportVisite rapportVisite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Instanciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visu_rv);

        /* Création des variables par rapport à activity_visu_rv.xml
        tVBilanRapport = (TextView) findViewById(R.id.tVBilanRapport);
        tVCoefficientRapport = (TextView) findViewById(R.id.tVCoefficientRapport);
        tVDateVisiteRapport = (TextView) findViewById(R.id.tVDateVisiteRapport);
        tVDateRedactionRapport = (TextView) findViewById(R.id.tVDateRedactionRapport);
        tVPraticienRapport = (TextView) findViewById(R.id.tVPraticienRapport);
        tVModifRapport = (TextView) findViewById(R.id.tVMotifRapport);
        tVRapportRapport = (TextView) findViewById(R.id.tVRapportRapport);
        */

        /* Récupération du Bundle
        Bundle paquet = this.getIntent().getExtras();
        rapportVisite = ModeleGsb.getInstance().getLesRapportsVisites().get(paquet.getInt("Numero"));

        System.out.println(rapportVisite.toString());

        /*
        // Création des variables par rapport au bundle
        numero = rapportVisite.getNumero();
        bilan = rapportVisite.getBilan();
        coefConfiance = rapportVisite.getCoefConfiance();
        dateVisite = rapportVisite.getDateVisite();
        dateRedaction = rapportVisite.getDateRedaction();
        lu = rapportVisite.isLu();

         // Remplir l'activité avec les valeurs du bundle
        tVBilanRapport.setText(bilan);
        tVCoefficientRapport.setText(coefConfiance);
        tVDateVisiteRapport.setText(dateVisite);
        tVDateRedactionRapport.setText(dateRedaction);
        tVPraticienRapport.setText();
        tVModifRapport;
        tVRapportRapport ;
        */

        /*Bundle paquet = this.getIntent().getExtras();
        String nom = paquet.getString("nom");
        String prenom = paquet.getString("prenom");*/

    }


    /* public void consulterEchantillon (View vue){

        Bundle paquet = new Bundle();

        paquet.putInt("Numero", rapportVisite.getNumero());


        // Envoie du Bundle
        Intent intentAfficher = new Intent(this, VisuRvActivity.class);
        intentAfficher.putExtras(paquet);
        startActivity(intentAfficher);

    } */

    /*JSONObject rapportJSON ;
        String str = paquet.getString("rapportJSON");
        try {
            rapportJSON = (JSONObject) new JSONTokener(str).nextValue();

            System.out.println(rapportJSON.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //numero = Integer.parseInt(paquet.getString("numero"));
        //numero = paquet.getString("numero");
        //bilan = paquet.getString("bilan");
        //coefConfiance = Integer.parseInt(paquet.getString("coefConfiance"));
        //coefConfiance= paquet.getString("coefConfiance");
        /*
        dateVisite =  ;
        dateRedaction =  ;
        lu = paquet. ;
        lePraticien = new Praticien();
        leVisiteur = new Visiteur();
        leMotif = ;
        leEchantillons = ;*/


}
