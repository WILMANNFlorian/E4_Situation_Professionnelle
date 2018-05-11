package fr.gsb.rv.entites;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fr.gsb.rv.R;

/**
 * Created by Florian on 11/05/2018.
 */

public class RapportAdapter extends BaseAdapter {


    private Context context;

    private List<RapportVisite> listRaps = new ArrayList<RapportVisite>();

    public RapportAdapter(Context context, List<RapportVisite> listRaps) {

        this.context = context;
        this.listRaps = listRaps;

    }



    @Override
    public int getCount() {
        return listRaps.size();
    }

    @Override
    public Object getItem(int i) {
        return listRaps.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = View.inflate(context, R.layout.item_rapport, null);
        TextView tvRap = (TextView) v.findViewById(R.id.numero_rapporrt);
        TextView tvDate = (TextView) v.findViewById(R.id.date_rap);


        tvRap.setText(String.valueOf(listRaps.get(i).getNumero()));
        tvDate.setText(listRaps.get(i).getDateVisite());
        v.setTag(listRaps.get(i).getNumero());

        return v;
    }
}
