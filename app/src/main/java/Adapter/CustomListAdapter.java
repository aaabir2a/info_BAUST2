package Adapter;

/**
 * Created by user on 29-Aug-17.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.example.test.info_baust.R;

import java.util.ArrayList;

import Model.Course;

/**
 * Created by user on 29-Aug-17.
 */

public class CustomListAdapter extends ArrayAdapter {

    private Activity activity;
    private int layoutResource;
    private ArrayList<Course> data;


    public CustomListAdapter(Activity ac, int resource, ArrayList<Course> data){
        super(ac, resource, data);

        this.activity = ac;
        this.layoutResource = resource;
        this.data  = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getPosition(@Nullable Object item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row  = convertView;
        InputViewHolder holder = null;

        if (holder == null || row.getTag() == null){
            LayoutInflater inflater = LayoutInflater.from(activity);
            row = inflater.inflate(layoutResource, null);

            holder = new InputViewHolder();

            holder.courseCredit = (EditText) row.findViewById(R.id.credit_input);
            holder.courseGrade = (EditText) row.findViewById(R.id.grade_input);

            row.setTag(holder);
        }
        else{
            holder = (InputViewHolder) row.getTag();
        }

        holder.course = (Course) getItem(position);

        return row;
    }


    public class InputViewHolder {
        Course course;
        EditText courseCredit;
        EditText courseGrade;
    }

}

