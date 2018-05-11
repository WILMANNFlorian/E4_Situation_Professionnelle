package fr.gsb.rv;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import fr.gsb.rv.entites.Visiteur;
import fr.gsb.rv.modeles.ModeleGsb;
import fr.gsb.rv.technique.Session;

public class MainActivity extends AppCompatActivity {

    TextView tvErreur;
    Button bValider, bAnnuler;
    EditText mdp, matricule;


    protected void onCreate(Bundle savedInstanceState) {

        // Instanciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Création des variables par rapport à activity_main
        bValider = (Button) findViewById(R.id.bValider);
        bAnnuler = (Button) findViewById(R.id.bAnnuler);
        mdp = (EditText) findViewById(R.id.etMdp);
        matricule = (EditText) findViewById(R.id.etMatricule);
        tvErreur = (TextView) findViewById(R.id.tvErreur);

        // Met en invisible le texte
        tvErreur.setVisibility(View.INVISIBLE);

    }


    public void valider(View vue){

        // Récupération de Matricule et Mot de Passe dans des variables
        String textMatricule = matricule.getText().toString();
        String textMdp = mdp.getText().toString();

        // Ouvrir la session
        boolean sessionOk = Session.ouvrir(textMatricule,textMdp);

        if (sessionOk){

            // Récuperation du Nom et du Prenom du Visiteur
            String nom = Session.getSession().getLeVisiteur().getNom();
            String prenom = Session.getSession().getLeVisiteur().getPrenom();

            // Création du Bundle
            Bundle paquet = new Bundle();
            paquet.putString("prenom", prenom);
            paquet.putString("nom", nom);

            // Envoie du Bundle à MenuRvActivity
            Intent intentionEnvoyer = new Intent(this , MenuRvActivity.class);
            intentionEnvoyer.putExtras(paquet);
            startActivity(intentionEnvoyer);

        }

        else {

            // Affiche l'echec de connexion
            tvErreur.setVisibility(View.VISIBLE);
            mdp.setText("");

        }

    }


    public void annuler(View vue) {

        // Remise à 0 des champs
        tvErreur.setVisibility(View.INVISIBLE);
        mdp.setText("");
        matricule.setText("");

    }


}
