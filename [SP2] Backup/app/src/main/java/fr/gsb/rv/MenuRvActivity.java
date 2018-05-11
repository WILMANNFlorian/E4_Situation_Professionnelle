
package fr.gsb.rv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuRvActivity extends AppCompatActivity {

    TextView textViewIdentifiant;
    Button btnConsulter, btnSaisir, btnRetour;


    protected void onCreate(Bundle savedInstanceState) {

        // Instanciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rv0);

        // Création des variables par rapport à activity_menu_rv.xml
        textViewIdentifiant = (TextView) findViewById( R.id.tvSession ) ;
        btnConsulter = (Button) findViewById(R.id.btnConsulter) ;
        btnSaisir = (Button) findViewById(R.id.btnSaisir) ;
        btnRetour = (Button) findViewById(R.id.btnRetour) ;

        // Récupération du Bundle
        Bundle paquet = this.getIntent().getExtras();
        String nom = paquet.getString("nom");
        String prenom = paquet.getString("prenom");

        // Affichage de l'Identifiant
        textViewIdentifiant.setText("Vous êtes connecté(e) en tant que : " + nom + " " + prenom );

    }


    public void consulter(View vue){

        Intent intentionEnvoyer = new Intent(this, RechercherRvActivity.class);
        startActivity(intentionEnvoyer);

    }


    public void saisir(View vue){

    }


    public void retour(View vue){

        // Début de l'Activité MainActivity
        Intent intentRetourner = new Intent(this, MainActivity.class);
        startActivity( intentRetourner);

    }

}