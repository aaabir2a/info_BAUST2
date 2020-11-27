package Model2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by shafi on 10/13/2017.
 */

public class Week implements Serializable{
    private static ArrayList<Day> days;

     public Week(){
         days = new ArrayList<>();
     }

     public void addDay(Day day){
         days.add(day);
     }

    public ArrayList<Day> getDays(){
         return days;
     }
}
