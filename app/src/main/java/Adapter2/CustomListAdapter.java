package Adapter2;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.test.info_baust.R;

import java.util.ArrayList;

import Model2.Day;
import Model2.Class;


/**
 * Created by user on 13-Oct-17.
 */

public class CustomListAdapter extends ArrayAdapter {
    private Activity activity;
    private int layoutResource;
    private ArrayList<Class> classes;

    public CustomListAdapter(Activity ac, int resource, Day day){
        super(ac, resource, day.getClasses());

        this.activity = ac;
        this.layoutResource = resource;
        this.classes = day.getClasses();
    }

    @Override
    public int getCount() {
        return classes.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return classes.get(position);
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
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        ViewHolder holder = null;

        if (holder == null || row.getTag() == null){

            LayoutInflater inflater = LayoutInflater.from(activity);
            row = inflater.inflate(layoutResource, null);

            holder = new ViewHolder();

            holder.courseName = (TextView) row.findViewById(R.id.course_name);
            holder.time = (TextView) row.findViewById(R.id.time_text);

            row.setTag(holder);

        }
        else{
            holder = (ViewHolder) row.getTag();
        }

        holder.classCus = (Class) getItem(position);

        holder.courseName.setText(holder.classCus.getCourseName());
        holder.time.setText(holder.classCus.getStartTime());


        return row;

    }

    public class ViewHolder{
        Class classCus;
        TextView time;
        TextView courseName;
    }
}
