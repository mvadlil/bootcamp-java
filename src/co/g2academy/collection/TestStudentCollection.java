package co.g2academy.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudentCollection {

    public static void main(String[] args) {

        //Creating user-defined class objects
        Student sonoo=new Student(101,"Sonoo",23);
        Student ravi=new Student(102,"Ravi",21);
        Student hanumat=new Student(103,"Hanumat",25);

        //creating arraylist
        ArrayList<Student> StudentList = new ArrayList<Student>();
        StudentList.add(sonoo);//adding Student class object
        StudentList.add(ravi);
        StudentList.add(hanumat);

        //traversing elements of ArrayList object
        for ( Student element : StudentList ) {
            System.out.println( element.id + " " + element.name + " " + element.age );
        }




    }

}
