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
public class MajorAttractionFragment extends Fragment {

    public MajorAttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.shalimar), getString(R.string.attraction_time), R.drawable.nishat_garden));
        places.add(new Place(getString(R.string.nishat), getString(R.string.attraction_time), R.drawable.shalimar_garden));
        places.add(new Place(getString(R.string.tulip), getString(R.string.attraction_time), R.drawable.tulip_garden));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
