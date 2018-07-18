package co.paulfran.paulfranco.seattletourapp.app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.paulfran.paulfranco.seattletourapp.R;

public class FourSeasonsHotel extends Fragment {

    public FourSeasonsHotel() {
        Log.i("Fragment Check: ", "FourSeasonsHotel Fragment Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.four_seasons_hotel, container, false);
    }
}
