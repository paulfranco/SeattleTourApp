package co.paulfran.paulfranco.seattletourapp.app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.paulfran.paulfranco.seattletourapp.R;

public class GasWorksPark extends Fragment {

    public GasWorksPark() {
        Log.i("Fragment Check: ", "GasWorksPark Fragment Created");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pikes_works_park, container, false);
    }
}
