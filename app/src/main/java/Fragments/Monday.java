package Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.test.info_baust.R;
import com.example.test.info_baust.Routine;
import com.example.test.info_baust.Routine_batch;

import Adapter2.CustomListAdapter;
import Model2.Day;
import Model2.Class;

/**
 * Created by user on 13-Oct-17.
 */

public class Monday extends ListFragment {

    private Day monday = new Day();


    public Monday(){




        Class classone = new Class("08.00-08.50", "Fundamental");
        Class classTwo= new Class("08.50-09.40", "Mathematics");



        monday.addClass(classTwo);
        monday.addClass(classone);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_routine_main, container, false);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.routine_row, monday);

        setListAdapter(adapter);
        return rootView;
    }
}
