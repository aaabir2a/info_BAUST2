package Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.test.info_baust.R;
import com.example.test.info_baust.Routine_batch;

import Adapter2.CustomListAdapter;
import Model2.Class;
import Model2.Day;
import com.example.test.info_baust.Routine_batch;
import com.example.test.info_baust.Routine_main;

/**
 * Created by user on 13-Oct-17.
 */

public class Thursday extends ListFragment {

    private Day thursday = new Day();









    public Thursday(){




        Class classone = new Class("08.00-08.50", "yo0ooo yo");
        Class classtwo = new Class("08.00-08.50", "yo yo");
        Class classthree = new Class("08.00-08.50", "yo0ooo yo");
        Class classfour = new Class("08.00-08.50", "yo yo");
        Class classfive = new Class("08.00-08.50", "yo0ooo yo");
        Class classsix = new Class("08.00-08.50", "yo yo");
        Class classseven = new Class("08.00-08.50", "yo0ooo yo");
        Class classeight = new Class("08.00-08.50", "yo yo");



            thursday.addClass(classone);


            thursday.addClass(classtwo);
        thursday.addClass(classthree);
        thursday.addClass(classfour);
        thursday.addClass(classfive);
        thursday.addClass(classsix);
        thursday.addClass(classseven);
        thursday.addClass(classeight);





       // monday.addClass(classTwo);
        //monday.addClass(classone);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_routine_main, container, false);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), R.layout.routine_row, thursday);

        setListAdapter(adapter);
        return rootView;
    }
}
