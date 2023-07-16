package org.codewithease.javatopics.ArraysANDCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    /*

Implement a function to reverse the order of elements in an ArrayList using the Collections class.
Write a program to find the frequency of elements in an ArrayList using the Collections class.
Implement a function to check if two arrays are equal using the Arrays class.
Create a method to shuffle the elements in an ArrayList using the Collections class.
Write a program to convert an ArrayList to an array using the toArray() method.
Implement a function to find the index of a specific element in an ArrayList using the Collections class.
     */


    public static void main(String[] args) {

        //Write a program to find the maximum element in an array using the Arrays class.
        int[] array = {5, 8, 3, 2, 9, 1};
        int max = Arrays.stream(array).max().orElse(0);
        System.out.println(max);


        //Implement a function to remove duplicates from an ArrayList using the Collections class.

        List<Integer> list = Arrays.asList(3, 5, 3, 2, 1, 5);
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("sort descending");
        //Create a method to sort an ArrayList in descending order using the Collections class.

//        list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + list);

        //Write a program to find the common elements between two arrays using the Arrays class.

        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};
        ArrayList<Integer> commonElements = new ArrayList<>(Arrays.asList(array1));
        commonElements.retainAll(Arrays.asList(array2));
        System.out.println("Common elements: " + commonElements);


    }


}


