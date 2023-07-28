package org.codewithease.javatopics.ComparatorsDemo;

import org.codewithease.javatopics.commons.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        /*
        Sort List of Objects

       Custom Sorting Criteria

       Multiple Sorting Criteria

       Case-Insensitive Sorting

       Reverse Order Sorting
         */

        //1. Sort the strings based on their length in ascending order
        List<String> fruits = Arrays.asList("apple", "cherry", "banana", "pineapple", "kiwi", "elderberry");

//        fruits.sort(Comparator.comparingInt(String::length));

        Collections.sort(fruits,Comparator.comparingInt(String::length));

//        System.out.println(fruits);



        // 2.Sort the list of integers in descending order and print the result

        List<Integer> nums = Arrays.asList(3,2,90,34,21,12);

        Collections.sort(nums, Comparator.reverseOrder());
//        System.out.println(nums);


        // 3.Sort the list of employees based on their age in ascending order and print the result

        List<Employee> employees = Arrays.asList(new Employee(1, "Varsha", 28, 3000),
                new Employee(2, "Harsha", 21, 4000),
                new Employee(3, "Tony", 21, 1000),
                new Employee(4, "Ramesh", 30, 5000));

//        Collections.sort(employees,Comparator.comparingInt(Employee::getAge));
//        System.out.println(employees);




        // 4.Sort the list of employees based on their age in ascending order. If the ages are the same, compare by salary. Print the result.

//        Collections.sort(employees, Comparator.comparingInt(Employee::getAge).thenComparingInt(Employee::getSalary));
//        System.out.println(employees);


        // 5.Sort the list of strings based on the index of the first occurrence of "e" in each string and print the result


//        Collections.sort(fruits, Comparator.comparingInt( s -> s.indexOf("e")));
//        System.out.println(fruits);



        //6. Sort a list of strings ignoring case sensitivity using a case-insensitive comparator.

        List<String> fruitsMix = Arrays.asList("APPLE", "cherry", "baNaNa", "pineapple", "KiWI", "elderberry");
        Collections.sort(fruitsMix, String.CASE_INSENSITIVE_ORDER);

//        System.out.println(fruitsMix);


        //7. Sort a list of dates in ascending order using the comparing() method with a lambda expression.
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2023, 3, 15),
                LocalDate.of(2023, 7, 1)
        );


        Collections.sort(dates, Comparator.comparing(date -> date));
        System.out.println(dates);


    }
}
