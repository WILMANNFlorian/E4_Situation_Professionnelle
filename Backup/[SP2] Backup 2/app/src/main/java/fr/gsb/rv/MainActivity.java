package fr.gsb.rv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import fr.gsb.rv.entites.Visiteur;
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
        tvErreur = (TextView) findViewById(R.id.tvErreur);
        bValider = (Button) findViewById(R.id.bValider);
        bAnnuler = (Button) findViewById(R.id.bAnnuler);
        mdp = (EditText) findViewById(R.id.etMdp);
        matricule = (EditText) findViewById(R.id.etMatricule);


        // Met en invisible le texte
        tvErreur.setVisibility(View.INVISIBLE);

    }


    public void valider(View vue){

        // Récupération de Matricule et Mot de Passe dans des variables
        String textMatricule = matricule.getText().toString();
        String textMdp = mdp.getText().toString();

        try {

            // Récupération sur le serveur Python Flask grace à la fonction d'authentification
            String authentification = textMatricule.toString().trim()+'.'+textMdp.toString().trim();
            final String encoder = URLEncoder.encode(authentification, "UTF-8");
            // String url = String.format("http://192.168.43.71:5000/connexion/%s", encoder);
            String url = String.format("http://192.168.1.20:5000/connexion/%s", encoder);

            // En cas d'une réponse positive
            Response.Listener<JSONObject> ecouteur = new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {

                    try {

                        // Récupération des données de la connexion
                        Visiteur visiteur = new Visiteur(response.getString("id"), response.getString("mdp"),
                                response.getString("nom"), response.getString("prenom") );

                        // Ouvrir une nouvelle session pour l'utilisateur
                        Session.ouvrir(response.getString("id"), response.getString("mdp"), visiteur);
                        // Permet de rediriger vers l'activité MenuRvActivity
                        Intent i = new Intent(MainActivity.this, MenuRvActivity.class);
                        // Démarrer l'activité MenuRvActivity
                        startActivity(i);

                    } catch (JSONException e) {

                        e.printStackTrace();

                    }
                }
            };

            // En cas d'une réponse négative
            Response.ErrorListener errorListener = new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    // Afficher message d'erreur
                    Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_LONG).show();

                }
            };

            // Préparation du paquet à envoyer au serveur
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, ecouteur,errorListener);
            RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
            requestQueue.add(jsonObjectRequest);

        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();

        }
    }


    public void annuler(View vue) {

        // Remise à 0 des champs
        tvErreur.setVisibility(View.INVISIBLE);
        mdp.setText("");
        matricule.setText("");

    }


}
