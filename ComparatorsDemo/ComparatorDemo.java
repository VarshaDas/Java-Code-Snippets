package org.codewithease.javatopics.ComparatorsDemo;

import org.codewithease.javatopics.commons.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        //1. Sort the strings based on their length in ascending order


        // 2.Sort the list of integers in descending order and print the result


        // 3.Sort the list of employees based on their age in ascending order and print the result


        List<Employee> employees = Arrays.asList(new Employee(1, "Varsha", 28, 3000),
                new Employee(2, "Harsha", 21, 4000),
                new Employee(3, "Tony", 21, 1000),
                new Employee(4, "Ramesh", 30, 5000));


        // 4.Sort the list of employees based on their age in ascending order. If the ages are the same, compare by salary. Print the result.


        // 5.Sort the list of strings based on the index of the first occurrence of "e" in each string and print the result


        //6. Sort a list of strings ignoring case sensitivity using a case-insensitive comparator.


        //7. Sort a list of dates in ascending order using the comparing() method with a lambda expression.


    }
}
