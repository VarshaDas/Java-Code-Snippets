package org.codewithease.javatopics.ComparatorsDemo;

import org.codewithease.javatopics.commons.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsUsecases {
    public static void main(String[] args) {


        /*

       Sort List of Objects

       Custom Sorting Criteria

       Multiple Sorting Criteria

       Case-Insensitive Sorting

        Reverse Order Sorting
         */

        // 1. Sort the strings based on their length in ascending order

        List<String> strings = Arrays.asList("apples", "elderberry", "banana", "cherry", "date");
        String[] fruits = {"apple", "banana", "cherry", "date"};
        Collections.sort(strings);

        Arrays.sort(fruits, Comparator.comparingInt(String::length));

        // 2.Sort the list of integers in descending order and print the result
        List<Integer> list = Arrays.asList(3, 4, 9, 12);

        list.sort(Comparator.reverseOrder());
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


        // 3.Sort the list of employees based on their age in ascending order and print the result




        List<Employee> employees = Arrays.asList(new Employee(1, "Varsha", 28, 3000),
                new Employee(2, "Harsha", 21, 4000),
                new Employee(3, "Tony", 21, 1000),
                new Employee(4, "Ramesh", 30, 5000));


        employees.sort(Comparator.comparingInt(Employee::getAge));

        System.out.println("employees "+employees);

        // 4.Sort the list of employees based on their age in ascending order. If the ages are the same, compare by salary. Print the result.
//        employees.sort(Comparator.comparingInt(Employee::getAge)
//                .thenComparingLong(Employee::getSalary));
//        System.out.println(employees);
//
        // 5.Sort the list of strings based on the index of the first occurrence of "e" in each string and print the result
        strings.sort(Comparator.comparing(str -> str.indexOf("e")));
        System.out.println(strings);

//
//
//
//
//        //6. Sort a list of strings ignoring case sensitivity using a case-insensitive comparator.
//
//        List<String> strings1 = Arrays.asList("apple", "Banana", "cherry", "Date");
//
//        Comparator<String> caseInsensitiveComparator = String.CASE_INSENSITIVE_ORDER;
//
//        Collections.sort(strings1, caseInsensitiveComparator);
//
//        //7. Sort a list of dates in ascending order using the comparing() method with a lambda expression.
//        List<LocalDate> dates = Arrays.asList(
//                LocalDate.of(2023, 5, 10),
//                LocalDate.of(2023, 3, 15),
//                LocalDate.of(2023, 7, 1)
//        );
//
//        Comparator<LocalDate> ascendingComparator = Comparator.comparing(date -> date);
//
//        Collections.sort(dates, ascendingComparator);
//
//        //8.Sort a list of strings based on the count of a specific character in each string using a custom comparator.
//
////        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
////
////        Comparator<String> characterCountComparator = Comparator.comparingInt(str -> StringUtils.countMatches(str, 'e'));
////
////        Collections.sort(strings, characterCountComparator);


    }
}
