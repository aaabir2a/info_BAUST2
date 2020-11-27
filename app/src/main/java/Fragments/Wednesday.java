package Fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test.info_baust.R;

/**
 * Created by user on 13-Oct-17.
 */

public class Wednesday extends ListFragment {

    private int semesterId;
    private int dayId;

    public Wednesday(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_routine_main, container, false);


        return rootView;
    }
}
