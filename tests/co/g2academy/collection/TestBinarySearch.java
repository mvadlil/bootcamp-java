package co.g2academy.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TestBinarySearch {

    @Test
    public void testBinarySearch() {
        Integer[] list = {3, 7, 10, 15, 91, 110, 150};
        int target = 91;

        List<Integer> sortedList = Arrays.asList(list);
        int actual = Collections.binarySearch(sortedList, target);

        assertEquals(4, actual);
    }

    @Test
    public  void testSortedListAndBinarySearch() {
        Integer[] list = {192, 91, 0, 15, 34, 1000, 2};
        int target = 91;

        Arrays.sort(list); //sorting array using bubble sort??
        List<Integer> sortedList = Arrays.asList(list);
        int actual = Collections.binarySearch(sortedList, target);

        assertEquals(4, actual);
    }
    @Test
    public void testSortedArrayListAndBinarySearch() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(192); list.add(91); list.add(0); list.add(15);
        list.add(34); list.add(1000); list.add(2);
        int target = 91;

        Collections.sort(list); //sorting array using bubble sort??
        int actual = Collections.binarySearch(list, target);

        assertEquals(4, actual);
    }
}