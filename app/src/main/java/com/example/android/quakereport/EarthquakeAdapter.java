package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

    // Create a default constructor using the context and ArrayList<Earthquake>
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        String primaryLocation;
        String locationOffset;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        // Find current Earthquake
        Earthquake currentEarthquake = getItem(position);

        String originalLocation = currentEarthquake.getmLocation();
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        // Set all variable texts
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        Double rawMagnitude = currentEarthquake.getmMagnitude();
        DecimalFormat tenths = new DecimalFormat("0.0");
        String roundedMagnitude = tenths.format(rawMagnitude);
        magnitude.setText(roundedMagnitude);

        TextView proximity = listItemView.findViewById(R.id.proximity);
        proximity.setText(locationOffset);

        TextView location = listItemView.findViewById(R.id.location);
        location.setText(primaryLocation);

        TextView quakeDate = listItemView.findViewById(R.id.quake_date);
        quakeDate.setText(currentEarthquake.getmQuakeDate());

        TextView quakeTime = listItemView.findViewById(R.id.quake_time);
        quakeTime.setText(currentEarthquake.getmQuakeTime());

        return listItemView;
    }
}
