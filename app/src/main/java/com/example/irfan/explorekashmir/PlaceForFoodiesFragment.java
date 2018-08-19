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
public class PlaceForFoodiesFragment extends Fragment {

    public PlaceForFoodiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.winterfell), getString(R.string.winterfell_address), R.drawable.winterfell));
        places.add(new Place(getString(R.string.fatpanda), getString(R.string.fatpanda_address), R.drawable.fat_panda));
        places.add(new Place(getString(R.string.ahdoos), getString(R.string.ahdoos_address), R.drawable.ahdoos));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return  rootView;
    }
}
