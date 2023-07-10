package org.codewithease.javatopics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,8,10);
       // Write a program to find the sum of all elements in a List using streams.
        int sums = nums.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println(sums);

        //Given a List of integers, write a program to find the maximum element using streams.
        int max = nums.stream().max(Comparator.naturalOrder()).orElse(0);

        System.out.println("max element :"+max);

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        //Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
        long fruitCount = fruits.stream().filter( s -> s.startsWith("c")).count();
        System.out.println("fruitCount: "+fruitCount);


        //Write a program to convert a List of strings to uppercase using streams.
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        //Given a List of integers, write a program to filter out the even numbers using streams.
        // Count the number of elements in a list that satisfy a specific condition using streams.


        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        int even = (int) nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println("no of even "+even);


        //Write a program to find the average of a List of floating-point numbers using streams.
        List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
        double avg = numsFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("avg ::"+avg);


        //Given a List of strings, write a program to concatenate all the strings using streams.
        String concat = fruits.stream().collect(Collectors.joining());
        System.out.println(concat);

        //Write a program to remove duplicate elements from a List using streams.
        fruits.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        //Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),

                new Person("Charlie", 20)
        );

        people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList()).forEach(System.out::println);

        //Write a program to check if all elements in a List satisfy a given condition using streams.
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);


        //Sort a list of strings in ascending order using streams.
        fruits.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //Check if a list contains a specific element using streams.
        boolean exists = nums.stream().anyMatch(n -> n.equals(9));
        System.out.println(exists);

        //Create a new list containing the square of each element from the original list using streams
        nums.stream().map(n -> n*n).collect(Collectors.toList()).forEach(System.out::println);

        ///TODO:
        //Find the average length of strings in a list using streams.
        //Find the longest string in a list using streams.
        // Group a list of objects based on a specific attribute using streams.
        //Remove null values from a list using streams.
        //Find the second smallest element in a list of integers using streams.
        //Merge multiple lists into a single list using streams.
        // Find the frequency of each element in a list using streams.

        //Sort a list of objects based on multiple criteria using streams.
        //Partition a list of integers into even and odd numbers using streams.
        //Find the average salary of employees belonging to different departments using streams and grouping.

        //Calculate the factorial of a given number using streams.
        //Find the intersection of two lists using streams

    }
}
