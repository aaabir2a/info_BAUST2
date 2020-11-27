package Model2;

import java.util.ArrayList;

/**
 * Created by user on 13-Oct-17.
 */

public class Day {

    private int dayId;
    private String dayName;
    ArrayList<Class> classes;

    public Day(){
        classes = new ArrayList<>();
    }

    public void addClass(Class className){
        classes.add(className);
    }

    public int getDayId() {
        return dayId;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }
}
