package org.codewithease.javatopics.ComparatorsDemo;

import org.codewithease.javatopics.commons.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsUsecases {
    public static void main(String[] args) {

        // Sort the strings based on their length in ascending order

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        strings.sort(Comparator.comparingInt(String::length));

        // Sort the list of integers in descending order and print the result

        List<Integer> list = Arrays.asList(3, 4, 1, 9, 12);
        //2 ways
//        Collections.sort(list,Collections.reverseOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);


        List<Employee> employees = Arrays.asList(new Employee(1, "Varsha", 28, 3000),
                new Employee(2, "Harsha", 23, 4000),
                new Employee(3, "Tony", 21, 1000),
                new Employee(4, "Ramesh", 30, 5000));

        // Sort the list of employees based on their age in ascending order and print the result

        employees.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println(employees);

        // Sort the list of employees based on their age in ascending order. If the ages are the same, compare by salary. Print the result.
        employees.sort(Comparator.comparingInt(Employee::getAge)
                .thenComparingLong(Employee::getSalary));
        System.out.println(employees);

        // Sort the list of strings based on the index of the first occurrence of "e" in each string and print the result
        strings.sort(Comparator.comparing(str -> str.indexOf("e")));
        System.out.println(strings);


    }
}
