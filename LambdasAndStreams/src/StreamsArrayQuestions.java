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

        /*
         *  Time Complexity: O(n), where n is the length of the arrays, as the allMatch() operation iterates over each element in the array stream.
         *
         *  Space Complexity: O(1), as the code uses a constant amount of space regardless of the input size.
         * 
         *  Comparision with traditional approach: Both the streams approach and traditional approach using loops are same in terms of time and space complexity.
         *  Both approaches have a time complexity of O(n), where n is the length of the arrays, as they both involve iterating over all elements once. 
         *  Space complexity for these approaches are also same. 
         *
         */


        //2. How do you find duplicate numbers in an array if it contains multiple duplicates?

        Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4, 9, 10, 10};
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !uniqueNumbers.add(n)) // If not added to the set, it's a duplicate
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);

        /*
         *  Time Complexity: O(n), where n is the length of the array.
         *
         *  Space Complexity: O(k), where k is the number of unique elements in the array. 
         *                    In the worst case, it could be O(n) if all elements are unique.
         * 
         *  Comparision with traditional approach: The time and space complexities are similar for both approaches. The stream-based approach is more concise and expressive. 
         *
         */

        //3. How do you sort an array of 0s, 1s and 2s?

        int[] arr = {2, 0, 1, 2, 1, 0, 1, 2, 0};

        int[] sortedArray = IntStream.concat(IntStream.range(0, array.length).filter(i -> array[i] == 0),
                IntStream.concat(IntStream.range(0, array.length).filter(i -> array[i] == 1),
                        IntStream.range(0, array.length).filter(i -> array[i] == 2))).toArray();

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        /*
         *  Time Complexity: O(n), where n is the length of the array.
         *
         *  Space Complexity: O(n), where n is the length of the array, as the code used extra space to store sortedArray.
         * 
         *  Comparision with traditional approach: Both approaches have a time complexity of O(n), but the traditional counting sort might have a smaller constant factor, making it faster.
         *                                         Here, the traditional counting sort algorithm has a straightforward implementation and is easier to understand. 
         *
         */

        //4. How are duplicates removed from a given array in Java?

        Integer[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        Integer[] uniqueArray = Arrays.stream(arrayWithDuplicates).distinct().toArray(Integer[]::new);

        System.out.println("Original array with duplicates: " + Arrays.toString(arrayWithDuplicates));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));

        /*
         *  Time Complexity: O(n), where n is the length of the array 'arrayWithDuplicates'.
         *
         *  Space Complexity: O(k), where k is the number of unique elements in 'arrayWithDuplicates'
         * 
         *  Comparision with traditional approach: The stream-based approach uses the distinct() operation, while the traditional approach uses a HashSet. 
         *                                         Both approaches have the same space complexity. The stream-based approach internally uses a set-like structure to track unique elements during processing, and the traditional approach explicitly uses a HashSet.
         *
         */

        //5. How do you merge two sorted arrays into a single sorted array?

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));

        /*
         *  Time Complexity: O((m + n) log(m + n)), where m is the length of array1 and n is the length of array2.
         *
         *  Space Complexity: O(m + n), where m is the length of array1 and n is the length of array2.
         * 
         *  Comparision with traditional approach: Both approaches have the same time and space complexity. The traditional approach with System.arraycopy followed by Arrays.sort might have slightly lower constant factors, potentially making it faster for small to moderately sized arrays.
         *
         */

        //6. Given an array of integers, find the subarray with the maximum sum.

        //7. Find the First Non-Repeating Element in an Array

        //8. Given an array of integers, find all pairs that sum up to a specific target value.

        //9. Find the length of the longest increasing subsequence in an array.

        //10. Given an array of integers, find the length of the longest subarray with equal number of 0s and 1s.

        //11. Given an array of integers, find the subarray with the maximum number of distinct elements.

        //12. Given an array of integers, find the length of the longest subarray with non-negative sum.

        //13. Rotate an array to the right by a given number of steps.

        //14. Find a subarray with a given sum in an array of positive and negative numbers.

        //15. Find the contiguous subarray with the largest product of its elements.

        //16. How do you find the intersection of two arrays of integers?

        //17. How do you perform a binary search in a given array?

    }
}


