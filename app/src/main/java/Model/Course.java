package Model;

import java.io.Serializable;

/**
 * Created by user on 29-Aug-17.
 */

public class Course implements Serializable {

    String courseId;
    int credit;
    double grade;

    public Course(){

    }

    public Course (String courseId, int credit, double grade){
        this.courseId = courseId;
        this.credit = credit;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
