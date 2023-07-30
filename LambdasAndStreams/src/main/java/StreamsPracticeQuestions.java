import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPracticeQuestions {
    public static void main(String[] args) {

        // 1. Find the sum of all elements in a List using streams.
        List<Integer> nums = Arrays.asList(1,2,3,4,5,2,3);

//        int sum = nums.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);




        //2. Given a List of integers, write a program to find the maximum element using streams.

//        int max = nums.stream().max(Comparator.naturalOrder()).get();
//        System.out.println(max);



        //3. Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
        List<String> fruits = Arrays.asList("cherry", "banana", "coconut", "berry", "cantaloupe");
//        long count = fruits.stream().filter(fruit -> fruit.startsWith("b")).count();
//
//        System.out.println(count);



        //4. Convert a List of strings to uppercase using streams.

//        fruits.stream().map(String::toUpperCase).forEach(System.out::println);



        //5. Given a List of integers, write a program to filter out the even numbers using streams.
        // Count the number of elements in a list that satisfy a specific condition using streams.

        long countOfEven = nums.stream().filter(num -> num % 2 == 1).count();
//        System.out.println(countOfEven);



        //6.Write a program to find the average of a List of floating-point numbers using streams.
        List<Double> floatNums = Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5);
//        double avg = floatNums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//        System.out.println(avg);


        //7.Given a List of strings, write a program to concatenate all the strings using streams.
        String concatenatedFruits = fruits.stream().collect(Collectors.joining("::"));
//        System.out.println(concatenatedFruits);


        //8.Write a program to remove duplicate elements from a List using streams.

//        nums.stream().distinct().forEach(System.out::println);



        //9.Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );


//        Collections.sort(people, Comparator.comparing(Person::getAge));
//        System.out.println(people);


//        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);








        //10.Write a program to check if all elements in a List satisfy a given condition using streams.
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10,11);

        boolean isEven = numbers.stream().anyMatch(element -> element % 2 == 0);
        System.out.println(isEven);



    }
}
