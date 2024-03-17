import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCodeDemoPart2 {
    public static void main(String[] args) {

        //1. Given a sentence, find and print the frequency of each word.
         String sentence = "Java is a programming language. Java is versatile.";

         Map<String, Long> wordFreqMap = Arrays.stream(sentence.split("\\s+"))
                 .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));


//        System.out.println(wordFreqMap);

        //2. Given a list of integers, find out all the numbers starting with 1.

        List<Integer> nums = Arrays.asList(12, 13, 18, 21, 90, 11);

        List<Integer> numsWithOne = nums.stream().filter( n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());

//        System.out.println(numsWithOne);

       //3. Given a list of names, group them by their first letter, and then count the number of names in each group.

        String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};

        Map<Character,Long> namesMap = Arrays.stream(names).collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));

//        System.out.println(namesMap);


        // 4. Find and print duplicate numbers in an array if it contains multiple duplicates?

        int[] arr = {2,4,2,3,1,5, 5,78,3,1,5};

//        Arrays.stream(arr).boxed()
//                .collect(Collectors.groupingBy(e-> e, Collectors.counting()))
//                .entrySet().stream()
//                //key -value - 2 (k), 2(val)
//                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);


        // 5. How are duplicates removed from a given array in Java?
//
        int[] arr2 = {2,4,2,3,1,78};

        int[] newarr = Arrays.stream(arr).distinct().toArray();

//        System.out.println(Arrays.toString(newarr));


        //6. Given a list of words, filter and print the palindromes

        List<String> strings = List.of("level", "hello", "radar", "world", "deed");

        List<String> palindromeWords = strings.stream().
                filter(str -> str.equals(new StringBuilder(str).reverse().toString())).collect(Collectors.toList());

//        System.out.println(palindromeWords);


        // 7. How do you merge two sorted arrays into a single sorted array?
        int[] array1 = {1, 3,32, 5, 7};
        int[] array2 = {2, 4, 6,62, 8};

        int[] sortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
//       System.out.println(Arrays.toString(sortedArray));


        //8. Given two lists of strings, concatenate them and remove duplicates.

        List<String> list1 = List.of("apple", "banana", "orange");
        List<String> list2 = List.of("banana", "kiwi", "grape");

        List<String> uniqueList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
//        System.out.println(uniqueList);


        // 9. Student Grade Classification - 70 and above pass

        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 60),
                new Student("Charlie", 75),
                new Student("David", 90)
        );


        Map<String, List<Student>> studentMap =
                students.stream().collect(Collectors.groupingBy(student -> student.grade >= 70 ? "Pass" : "Fail"));

//        System.out.println(studentMap);


        //10. Given a list of strings, sort them according to increasing order of their length.

        List<String> fruits = Arrays.asList("Mango","pear" ,"Apple", "Banana", "Pineapple", "Kiwi");

        fruits.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


        //12.Partition a list of numbers into two groups: even and odd, using a custom predicate.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitionedNumbers = numbers1.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitionedNumbers);

        //13. Find the squares of the first three even numbers in a list.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> firstThreeSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .limit(3)
                .collect(Collectors.toList());

        // 14. Flatten a list of lists

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);



    }
}
