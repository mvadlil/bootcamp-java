package co.g2academy.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijav");
        list.add("Ravi");
        list.add("Ajay");


        // menggunakan iteration biasa
        System.out.println("\nMenggunakan iteration biasa");
        for ( int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i));
        }

        // menggunakan for loop
        System.out.println("\nMenggunakan iteration for loop");
        for ( String element : list ) {
            System.out.println(element);
        }

        // iterator
        System.out.println("\nMenggunakan iterator");
        Iterator<String> iterator = list.iterator();
        while ( iterator.hasNext() ) {
            System.out.println(iterator.next());
        }



    }
}
