package fr.gsb.rv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import fr.gsb.rv.entites.RapportAdapter;
import fr.gsb.rv.entites.RapportVisite;
import fr.gsb.rv.entites.RapportVisiteParce;
import fr.gsb.rv.technique.Session;


public class ListRapportRvActivity extends AppCompatActivity {

    ListView laListe ;
    TextView tvList ;
    TextView tvRapportSelec;
    Button btnConsuler ;

    List<RapportVisite> lesRaps = new ArrayList<RapportVisite>();

    protected void onCreate(Bundle savedInstanceState) {

        // Instaciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rapport_rv);

        // Récupération du Bundle + mois et année
        Bundle paquet = this.getIntent().getExtras();
        String mois = paquet.getString("mois") ;
        String annee = paquet.getString("annee") ;

        final ListView listView = (ListView) findViewById(R.id.lvListRapports);
        final String encoder;

        try {

            String lv = Session.getSession().getLeVisiteur().getMatricule()+"."+mois+"."+annee ;
            encoder = URLEncoder.encode(lv, "UTF-8");
            // String url = String.format("http://192.168.43.71:5000/listeRV/%s", encoder);
            String url = String.format("http://192.168.1.20:5000/listeRV/%s", encoder);

            Response.Listener<JSONArray> ecouteur = new Response.Listener<JSONArray>() {

                @Override
                public void onResponse(JSONArray response) {


                    for (int i = 0 ; i < response.length(); i++){

                        try {

                            JSONObject jsonObject = response.getJSONObject(i);

                            lesRaps.add(new RapportVisite(jsonObject.getInt("rap_n"),
                                                          jsonObject.getString("bilan"),
                                                          jsonObject.getInt("coeff_confiance"),
                                                          jsonObject.getString("date"),
                                                          1,
                                                          jsonObject.getString("motif"),
                                                          jsonObject.getInt("pra_n")
                             ));

                            final RapportAdapter rapportAdapter = new RapportAdapter(ListRapportRvActivity.this, lesRaps);

                            listView.setAdapter(rapportAdapter);
                            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                @Override
                                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                                    RapportVisite rapportVisite = lesRaps.get(i);
                                    RapportVisiteParce rap = new RapportVisiteParce(rapportVisite.getNumero(),
                                                                                    rapportVisite.getBilan(),
                                                                                    rapportVisite.getCoefConfiance(),
                                                                                    rapportVisite.getDateVisite(),
                                                                                    rapportVisite.isLu(),
                                                                                    rapportVisite.getLeMotif(),
                                                                                    rapportVisite.getLePraticien());

                                    Intent intentAfficher = new Intent(ListRapportRvActivity.this, VisuRvActivity.class);
                                    intentAfficher.putExtra("rapportVisite", rap);
                                    startActivity(intentAfficher);

                                }
                            });

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            Response.ErrorListener errorListener = new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    Toast.makeText(ListRapportRvActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                }
            };

            JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, ecouteur, errorListener);
            RequestQueue requestQueue = Volley.newRequestQueue(ListRapportRvActivity.this);
            requestQueue.add(jsonArrayRequest);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


    public JSONObject rapportToJSON (RapportVisite rapport){

        // Création d'un object JSON
        JSONObject object = new JSONObject();

        // Implémentation de l'object JSON
        try {
            object.put("numero",rapport.getNumero());
            object.put("bilan", rapport.getBilan());
            object.put("coefConfiance",rapport.getCoefConfiance());
            object.put("dateVisite", rapport.getDateVisite());
            object.put("lu", rapport.isLu());
            object.put("lePraticien", rapport.getLePraticien());
            object.put("leVisiteur", rapport.getLeVisiteur());
            object.put("leMotif", rapport.getLeMotif());
            object.put("lesEchantillons", rapport.getLesEchantillons());

        } catch (JSONException e) {
            e.printStackTrace();
        }
        Toast.makeText(ListRapportRvActivity.this, "Je suis la rapportToJson", Toast.LENGTH_LONG).show();

        return object;

    }

}
