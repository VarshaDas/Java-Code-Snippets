//import java.util.Arrays;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.stream.*;
///*
// *
// *  This code contains top array questions asked in interviews and coding rounds and their solution using Streams API
// *
//*/
//public class StreamsPart2_Array {
//
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 2, 3, 4, 5};
//
//        Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4, 9, 10, 10};
//
//        //1. How do you check if two arrays are equal or not?
//
//        boolean equal = IntStream.range(0, arr1.length).allMatch(i -> arr1[i] == arr2[i]);
//
//        System.out.println("Are the arrays equal: " + equal);
//
//        /*
//         *  Time Complexity: O(n), where n is the length of the arrays, as the allMatch() operation iterates over each element in the array stream.
//         *
//         *  Space Complexity: O(1), as the code uses a constant amount of space regardless of the input size.
//         *
//         *  Comparision with traditional approach: Both the streams approach and traditional approach using loops are same in terms of time and space complexity.
//         *  Both approaches have a time complexity of O(n), where n is the length of the arrays, as they both involve iterating over all elements once.
//         *  Space complexity for these approaches are also same.
//         *
//         */
//
//        //2. How do you find duplicate numbers in an array if it contains multiple duplicates?
//
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        Set<Integer> duplicates = Arrays.stream(numbers).filter(n -> !uniqueNumbers.add(n)).collect(Collectors.toSet());
//        // If not added to the set, it's a duplicate
//        System.out.println("Duplicate numbers: " + duplicates);
//
//        /*
//         *  Time Complexity: O(n), where n is the length of the array.
//         *
//         *  Space Complexity: O(k), where k is the number of unique elements in the array.
//         *                    In the worst case, it could be O(n) if all elements are unique.
//         *
//         *  Comparision with traditional approach: The time and space complexities are similar for both approaches. The stream-based approach is more concise and expressive.
//         *
//         */
//
//        //3. How are duplicates removed from a given array in Java?
//
//        Integer[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 3};
//        Integer[] uniqueArray = Arrays.stream(arrayWithDuplicates).distinct().toArray(Integer[]::new);
//
//        System.out.println("Original array with duplicates: " + Arrays.toString(arrayWithDuplicates));
//        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
//
//        /*
//         *  Time Complexity: O(n), where n is the length of the array 'arrayWithDuplicates'.
//         *
//         *  Space Complexity: O(k), where k is the number of unique elements in 'arrayWithDuplicates'
//         *
//         *  Comparision with traditional approach: The stream-based approach uses the distinct() operation, while the traditional approach uses a HashSet.
//         *                                         Both approaches have the same space complexity. The stream-based approach internally uses a set-like structure to track unique elements during processing, and the traditional approach explicitly uses a HashSet.
//         *
//         */
//
//        //4. How do you merge two sorted arrays into a single sorted array?
//
//        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
//        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
//
//        /*
//         *  Time Complexity: O((m + n) log(m + n)), where m is the length of array1 and n is the length of array2.
//         *
//         *  Space Complexity: O(m + n), where m is the length of array1 and n is the length of array2.
//         *
//         *  Comparision with traditional approach: Both approaches have the same time and space complexity. The traditional approach with System.arraycopy followed by Arrays.sort might have slightly lower constant factors, potentially making it faster for small to moderately sized arrays.
//         *
//         */
//
//        //5. Given an array of integers, find all pairs that sum up to a specific target value.
//
//        int targetSum = 10;
//
//        Arrays.stream(arr1).boxed()
//                .flatMap(i ->
//                        Arrays.stream(arr1)
//                                .boxed()
//                                .filter(j -> i + j == targetSum && i <= j)
//                                .map(j -> new int[]{i, j})
//                )
//                .forEach(pair ->
//                        System.out.println("Pair with sum " + targetSum + ": " + Arrays.toString(pair))
//                );
//
//        /*
//         *  Time Complexity: O(n^2), where n is the length of the array. oFr each element in the outer stream, the inner stream iterates over the entire array.
//         *
//         *  Space Complexity: O(1), as no additional data structure is used.
//         *
//         *  Comparision with traditional approach: Both approaches have a time complexity of O(n^2). The traditional approach uses nested loops to solve this problem whereas
//         *  the stream based approach uses nested stream operations. In terms of time complexity, the optimal approach would be to use a HashSet, instead of using streams or the brute force method.
//         *  The space complexity for both approaches is O(1) because they do not use additional space.
//         *
//         */
//
//
//        //6. Rotate an array to the right by a given number of steps.
//
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int steps = 2;
//        int rotationIndex = arr1.length - steps % arr1.length;
//
//        int[] rotatedArray = IntStream.concat(Arrays.stream(Arrays.copyOfRange(arr1, rotationIndex, arr1.length)),
//                                Arrays.stream(Arrays.copyOfRange(arr1, 0, rotationIndex))).toArray();
//
//        System.out.println("Original Array: " + Arrays.toString(arr1));
//        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
//
//
//        /*
//         *  Time Complexity: O(n), where n is the length of the array.
//         *
//         *  Space Complexity:  O(n), where n is the length of the array. This is because this solution creates new arrays for storing the rotated parts, '
//         *  and the final rotated array is created by combining these arrays.'
//         *
//         *  Comparision with traditional approach: Both the approaches have linear time complexity of O(n), where n is the length of the array.
//         *  The stream based approach has space complexity of O(n), whereas the traditional approach has constant space complexity O(1), as it uses in-place array rotation.
//         *
//         */
//
//        //7. How do you find the intersection of two arrays of integers?
//
//
//        int[] intersection = Arrays.stream(arr1).filter(value -> Arrays.stream(arr2).anyMatch(value2 -> value == value2)).distinct().toArray();
//
//        System.out.println("Intersection of arrays: " + Arrays.toString(intersection));
//
//        /*
//         *  Time Complexity: O(m*n), where m is the length of first array 'arr1' and n is the length of second array 'arr2'.
//         *
//         *  Space Complexity: O(k), where k is the size of the intersection.
//         *
//         *  Comparision with traditional approach: The traditional approach uses sets to find the intersection, and has a time complexity of O(m+n), whereas
//         *  the stream based approach has a time complexity of O(m*n).
//         *  The space complexity of the traditional approach is O(min(m, n)), whereas the stream based approach has a complexity of O(k), where k is the size of intersection.
//         *  Hence, the traditional approach gives a more efficient result. On the other hand, the stream based approach gives a more readable solution.
//         *
//         */
//
//        //8. How do you perform linear search in a given array?
//
//        int target = 7;
//        boolean present =  Arrays.stream(numbers).anyMatch(element -> element == target);
//
//        if (present) {
//            System.out.println("Element " + target + "present in the array");
//        } else {
//            System.out.println("Element " + target + " not present in the array.");
//        }
//
//        /*
//         *  Time Complexity: O(n), where n is the length of the array.
//         *
//         *  Space Complexity: O(n), because of the box() operation.
//         *
//         *  Comparision with traditional approach: Both approaches have similar linear time complexity, as they iterate through the array once.
//         *  The traditional loop-based method has better space efficiency of O(1).
//         *
//         */
//
//
//    }
//}
//
//
//
//
