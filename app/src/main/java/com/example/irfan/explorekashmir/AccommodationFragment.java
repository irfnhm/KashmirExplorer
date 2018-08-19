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
public class AccommodationFragment extends Fragment {

    public AccommodationFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.grandpalace), getString(R.string.hotel_time), R.drawable.grand_palace));
        places.add(new Place(getString(R.string.tajvivanta), getString(R.string.hotel_time), R.drawable.vivanta));
        places.add(new Place(getString(R.string.shangrilla), getString(R.string.hotel_time), R.drawable.shangrilla));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.place_list);
        listView.setAdapter(placeAdapter);
        return rootView;
    }
}
