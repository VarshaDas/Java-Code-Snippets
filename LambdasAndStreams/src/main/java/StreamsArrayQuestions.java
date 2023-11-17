import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.*;
/* 
 *
 *  This code contains top array questions asked in interviews and coding rounds and their solution using Streams API
 * 
*/
public class StreamsArrayQuestions {

    public static void main(String[] args) {

        //1. How do you check if two arrays are equal or not?

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean equal = IntStream.range(0, arr1.length)
                .allMatch(i -> arr1[i] == arr2[i]);

        System.out.println("Are the arrays equal: " + equal);


        //2. How do you find duplicate numbers in an array if it contains multiple duplicates?

        Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4, 9, 10, 10};
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !uniqueNumbers.add(n)) // If not added to the set, it's a duplicate
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);

        //3. How do you reverse an array in place in Java?

        //4. How do you sort an array of 0s, 1s and 2s?

        int[] arr = {2, 0, 1, 2, 1, 0, 1, 2, 0};

        int[] sortedArray = IntStream.concat(IntStream.range(0, array.length).filter(i -> array[i] == 0),
                IntStream.concat(IntStream.range(0, array.length).filter(i -> array[i] == 1),
                        IntStream.range(0, array.length).filter(i -> array[i] == 2))).toArray();

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        //5. How are duplicates removed from a given array in Java?

        Integer[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        Integer[] uniqueArray = Arrays.stream(arrayWithDuplicates).distinct().toArray(Integer[]::new);

        System.out.println("Original array with duplicates: " + Arrays.toString(arrayWithDuplicates));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));

        //6. How do you merge two sorted arrays into a single sorted array?

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
        
        //7. Given an array of integers, find the subarray with the maximum sum.

        //8. Find the First Non-Repeating Element in an Array

        //9. Given an array of integers, find all pairs that sum up to a specific target value.

        //10. Find the length of the longest increasing subsequence in an array.

        //11. Given an array of integers, find the length of the longest subarray with equal number of 0s and 1s.

        //12. Given an array of integers, find the subarray with the maximum number of distinct elements.

        //13. Given an array of integers, find the length of the longest subarray with non-negative sum.

        //14. Rotate an array to the right by a given number of steps.

        //15. Find a subarray with a given sum in an array of positive and negative numbers.

        //16. Find the contiguous subarray with the largest product of its elements.

        //17. How do you find the intersection of two arrays of integers?

        //18. How do you perform a binary search in a given array?

    }
}


