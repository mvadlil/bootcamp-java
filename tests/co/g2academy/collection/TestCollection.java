package co.g2academy.collection;

import co.g2academy.basic.ExampleOverloading;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCollection {

    //test how to use add all method
    @Test
    public void testUsingAddAllMethodInList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Sonoo");
        secondList.add("Hanumat");
        list.addAll(secondList);

        //expected result? there are 5 items in list
        int actual = list.size();
        assertEquals(5, actual);
    }

    @Test
    public void testUsingRemoveAllMethodInList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");
        list.removeAll(secondList);

        //expected result? there are 2 items in list
        int actual = list.size();
        assertEquals(2, actual);
    }

    @Test
    public void testUsingRetainAllMethodInList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        // retainAll adalah yang di sisakan hanya irisan nya saja dari list dan secondList
        list.retainAll(secondList);

        //expected result? there are 2 items in list
        int actual = list.size();
        assertEquals(1, actual);
        String actualRavi = list.get(0);
        assertEquals("Ravi", actualRavi);
    }
}
