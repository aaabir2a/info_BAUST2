package Fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test.info_baust.R;

import Adapter2.CustomListAdapter;
import Model2.Day;
import Model2.Class;

/**
 * Created by user on 13-Oct-17.
 */

public class Sunday extends ListFragment {

    private    Day sunday = new Day();


    public Sunday(){
        Class classone = new Class("08.00-08.50", "Fundamental");
        Class classTwo= new Class("08.50-09.40", "Mathematics");

        sunday.addClass(classTwo);
        sunday.addClass(classone);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_routine_main, container, false);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.routine_row, sunday);

        setListAdapter(adapter);
        return rootView;
    }
}
