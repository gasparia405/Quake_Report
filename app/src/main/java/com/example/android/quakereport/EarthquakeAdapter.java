package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    // Create a default constructor using the context and ArrayList<Earthquake>
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        // Find current Earthquake
        Earthquake currentEarthquake = getItem(position);

        // Set all variable texts
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getmMagnitude());

        TextView location = listItemView.findViewById(R.id.location);
        location.setText(currentEarthquake.getmLocation());

        TextView quakeDate = listItemView.findViewById(R.id.quake_date);
        quakeDate.setText(currentEarthquake.getmQuakeDate());

        return listItemView;
    }
}
