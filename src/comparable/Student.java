package comparable;

import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student>{
    protected String name;
    private int id;
    protected double gpa;

    private static int LAST_ID = 1000;
    public Student(String name, double gpa) {
        this.name = name;
        id = LAST_ID++;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(Object o) {
//        Student obj = (Student)o;
//        return name.compareTo(obj.name);
//    }

//    @Override
//    public int compareTo(Student o){
//        return name.compareTo(obj.name);
//    }

    @Override
    public int compareTo(Student o){
//        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
        return Double.valueOf(gpa).compareTo(Double.valueOf(o.gpa));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
