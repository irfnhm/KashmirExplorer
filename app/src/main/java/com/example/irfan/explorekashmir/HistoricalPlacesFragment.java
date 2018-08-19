package com.example.irfan.explorekashmir;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalPlacesFragment extends Fragment {

    public HistoricalPlacesFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.hariparbat), getString(R.string.hari_burz_time), R.drawable.hari_parbat));
        places.add(new Place(getString(R.string.burzahama), getString(R.string.hari_burz_time), R.drawable.burzahama));
        places.add(new Place(getString(R.string.jamiamasjid), getString(R.string.masjid_time), R.drawable.jamia_masjid));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}

