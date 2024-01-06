import java.util.Comparator;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StreamsQuestions {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(123, 45, 167, 189, 12, 1234, 198, 102);

        List<String> fruits = Arrays.asList("Mango", "Apple", "Banana", "Kiwi");

        //1. Given a list of integers, find the total number of elements present in the list.

        long totalCount = numbers.stream().count();
        System.out.println("Total number of elements: " + totalCount);

        //2. Given a list of integers, find out all the numbers starting with 1.

        List<Integer> numbersStartingWithOne = numbers.stream().filter(number -> String.valueOf(number).startsWith("1")).collect(Collectors.toList());
        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);

        //3. Find the frequency of each element in an array.

        Integer[] array = {1, 2, 3, 2, 4, 1, 5, 2, 3, 1, 4, 4, 5};
        Map<Integer, Long> frequencyMap = Arrays.stream(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("Frequency of each element: " + frequencyMap);

        //4. Count the total number of vowels in a collection of strings.

        long totalVowels = fruits.stream()
                .flatMapToInt(CharSequence::chars)  // Flatten strings to a stream of characters
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)  // Filter out vowels
                .count();
        System.out.println("Total number of vowels: " + totalVowels);

        //5. Count the occurrences of each character in a given string and return a map with character frequencies.

        String str = "programming";
        Map<Character, Long> charFrequencyMap = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Character frequencies: " + charFrequencyMap);

        //6. Given a list of integers, sort all the values present in it in descending order.

        List<Integer> sortedDescending = numbers.stream()
                .sorted(Comparator.reverseOrder()) // Comparator.reverseOrder()
                .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + sortedDescending);

        //7. Given a list of strings, sort them according to increasing order of their length.

        List<String> sortedByLength = fruits.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println("Sorted by length in increasing order: " + sortedByLength);

        //8. Given two lists of strings, merge them and remove duplicates.

        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("banana", "grape", "kiwi");
        List<String> mergedAndDistinct = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        System.out.println("Merged and distinct list: " + mergedAndDistinct);

        //9. Find the sum of all digits of a number.

        int number = 12345;
        int sumOfDigits = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println("Sum of digits: " + sumOfDigits);


        //10. Merge two unsorted arrays into a single sorted array.

        int[] array1 = {5, 2, 8, 1, 7};
        int[] array2 = {4, 9, 3, 6, 10};
        int[] mergedAndSortedArray = Arrays.stream(array1).boxed().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedAndSortedArray));

        //11. Check if two strings are anagrams or not.

        String s1 = "listen";
        String s2 = "silent";

        s1 = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        if (s1.equals(s2))
            System.out.println("Two strings are anagrams");
        else
            System.out.println("Two strings are not anagrams");

        //12. Reverse each word of a string.

//        String str = "Hello World!";
        String reversedStr = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println("Reversed String: " + reversedStr);

        //13. Check if a string is palindrome or not.

//        String str = "madam";
        boolean isPalindrome = IntStream.range(0, str.length() / 2)
				.noneMatch(index -> str.charAt(index) != str.charAt(str.length() - index - 1));
        if(isPalindrome)
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");


        //14. Given a list of lists of strings, flatten it into a single list of unique words.

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "orange", "banana"),
                Arrays.asList("banana", "grape", "kiwi"),
                Arrays.asList("orange", "apple", "kiwi"));
        List<String> uniqueWords = listOfLists.stream()
                .flatMap(List::stream)  // Flatten the nested lists
                .distinct()             // Get unique words
                .collect(Collectors.toList());
        System.out.println("Unique words: " + uniqueWords);

        //15. Print fibonacci series.

        int n = 10;
        Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]}).limit(n).mapToLong(fib -> fib[0]).forEach(System.out::println);


    }
}