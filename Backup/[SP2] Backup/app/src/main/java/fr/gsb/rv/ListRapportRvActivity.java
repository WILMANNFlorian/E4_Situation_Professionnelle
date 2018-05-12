package fr.gsb.rv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import fr.gsb.rv.entites.RapportVisite;
import fr.gsb.rv.modeles.ModeleGsb;



public class ListRapportRvActivity extends AppCompatActivity {

    //A REMPLACER PAR DATA SERVER
    private List<RapportVisite> listRapport = ModeleGsb.getInstance().getLesRapportsVisites() ;

    ListView laListe ;
    TextView tvList ;
    TextView tvRapportSelec;
    Button btnConsuler ;

    RapportVisite rapportSelectionne ;


    protected void onCreate(Bundle savedInstanceState) {

        // Instaciation
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rapport_rv);

        // Récupération du Bundle + mois et année
        Bundle paquet = this.getIntent().getExtras();
        String mois = paquet.getString("mois") ;
        String annee = paquet.getString("annee") ;

        // Création des variables par rapport à List_rapport_visite_rv.xml
        laListe = (ListView) findViewById(R.id.lvListRapports);
        tvList = (TextView) findViewById(R.id.tvListRapports) ;
        tvRapportSelec = (TextView) findViewById(R.id.tvRapportSelec);
        btnConsuler = (Button) findViewById(R.id.btnConsulter);

        // Masquer le bouton Consulter
        btnConsuler.setVisibility(View.GONE);

        // Liste temporaire qui contiendra les RapportVisites correspondant à la date du Bundle
        final List<RapportVisite> elList = new ArrayList<>();


        // Récupérer élément de la liste par rapport au mois et année
        for(RapportVisite rv : listRapport){

            String month;
            int MM = rv.getDateVisite().get(Calendar.MONTH);
            String AAAA = Integer.toString( rv.getDateVisite().get(Calendar.YEAR) ) ;

            switch (MM) {

                case 0:  month = "Janvier";
                    break;
                case 1:  month = "Février";
                    break;
                case 2:  month = "Mars";
                    break;
                case 3:  month = "Avril";
                    break;
                case 4:  month = "Mai";
                    break;
                case 5:  month = "Juin";
                    break;
                case 6:  month = "Juillet";
                    break;
                case 7:  month = "Août";
                    break;
                case 8:  month = "Septembre";
                    break;
                case 9: month = "Octobre";
                    break;
                case 10: month = "Novembre";
                    break;
                case 11: month = "Décembre";
                    break;
                default: month = " ";

            }

            if (AAAA.equals(annee) & month.equals(mois)){

                // Récupération de l'élement
                elList.add(rv);

            }


        }

        // Création de l'adaptateur
        ArrayAdapter<RapportVisite> adaptateur = new ArrayAdapter<RapportVisite>(this ,android.R.layout.simple_list_item_1 ,elList);
        laListe.setAdapter(adaptateur);

        // Création du Listener
        laListe.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    public void onItemClick(AdapterView<?> parent, View vue, int position, long id)
                    {
                        btnConsuler.setVisibility(View.VISIBLE);

                        rapportSelectionne = elList.get(position);

                        tvRapportSelec.setText(" "+rapportSelectionne.toString());
                    }
                }
        );

    }

    /*      FAIL
    public JSONObject rapportToJSON (RapportVisite rapport){

        // Création d'un object JSON
        JSONObject object = new JSONObject();

        // Implémentation de l'object JSON
        try {
            object.put("numero",rapportSelectionne.getNumero());
            object.put("bilan", rapportSelectionne.getBilan();
            object.put("coefConfiance",rapportSelectionne.getCoefConfiance());
            object.put("dateVisite", rapportSelectionne.getDateVisite());
            object.put("dateRedaction", rapportSelectionne.getDateRedaction());
            object.put("lu", rapportSelectionne.isLu());
            object.put("lePraticien", rapportSelectionne.getLePraticien());
            object.put("leVisiteur", rapportSelectionne.getLeVisiteur());
            object.put("leMotif", rapportSelectionne.getLeMotif());
            object.put("lesEchantillons", rapportSelectionne.getLesEchantillons());

        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println(object.toString()); //ok
        return object;

    }
    */

    public void consulter (View vue){

        // Création du Bundle
        Bundle paquet = new Bundle();
        //JSONObject rapportJson =  rapportToJSON(rapportSelectionne);
        //paquet.putString("rapportJson", rapportJson.toString());
        paquet.putInt("Numero", rapportSelectionne.getNumero());


        // Envoie du Bundle
        Intent intentAfficher = new Intent(this, VisuRvActivity.class);
        intentAfficher.putExtras(paquet);
        startActivity(intentAfficher);



    }


}
