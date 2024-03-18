//import java.util.*;
//
//public class ArraysAndCollectionTasks {
//
//    public static void main(String[] args) {
//        // Question 1: Sorting an Array of Integers
//        int[] array1 = {3, 1, 4, 1, 5, 9, 2, 6};
//        Arrays.sort(array1);
//        System.out.println("Sorted Array: " + Arrays.toString(array1));
//
//        // Question 2: Checking for Equality of Two Arrays
//        int[] array2 = {1, 2, 3};
//        boolean equal = Arrays.equals(array1, array2);
//        System.out.println("Are arrays equal? " + equal);
//
//        // Question 3: Finding the Maximum Element in an ArrayList
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
//        int max = Collections.max(list);
//        System.out.println("Maximum element in ArrayList: " + max);
//
//        // Question 4: Shuffling Elements of an ArrayList
//        Collections.shuffle(list);
//        System.out.println("Shuffled ArrayList: " + list);
//
//        // Question 5: Finding the Frequency of an Element in an ArrayList
//        int frequency = Collections.frequency(list, 1);
//        System.out.println("Frequency of '1' in ArrayList: " + frequency);
//
//        // Question 6: Checking if an ArrayList is Empty
//        boolean isEmpty = list.isEmpty();
//        System.out.println("Is ArrayList empty? " + isEmpty);
//
//        // Question 7: Converting Array to ArrayList
//        String[] array3 = {"apple", "banana", "orange"};
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array3));
//       String newarr[] = arrayList.toArray(new String[0]);
//        System.out.println(newarr);
//        System.out.println("ArrayList from Array: " + arrayList);
//
//        // Question 8: Reversing an Array
//        Collections.reverse(Arrays.asList(array3));
//        System.out.println("Reversed Array: " + Arrays.toString(array3));
//
//        // Question 9: Removing All Occurrences of an Element from an ArrayList
//        list.removeAll(Collections.singleton(1));
//        System.out.println("ArrayList after removing all occurrences of '1': " + list);
//
//        // Question 10: Copying Elements from ArrayList to Array
//        Integer[] array4 = list.toArray(new Integer[0]);
//        System.out.println("Copied Array: " + Arrays.toString(array4));
//
//
//        // Question 1: Removing Null Values from an ArrayList
//        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", null, "banana", null, "orange"));
//        stringList.removeAll(Collections.singleton(null));
//        System.out.println("1. List after removing null values: " + stringList);
//
//        // Question 2: Finding the Average of an Array
//        int[] numbers = {1, 2, 3, 4, 5};
//        double average = Arrays.stream(numbers).average().orElse(Double.NaN);
//        System.out.println("2. Average of the array: " + average);
//
//        // Question 3: Checking for Palindromes in an ArrayList
//        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("radar", "apple", "level", "banana"));
//        for (String word : wordList) {
//            boolean isPalindrome = new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
//            System.out.println("3. " + word + " is a palindrome: " + isPalindrome);
//        }
//
//        // Question 4: Merging Two Arrays into a Single Array
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 6};
//        int[] mergedArray = new int[array1.length + array2.length];
//        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
//        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
//        System.out.println("4. Merged array: " + Arrays.toString(mergedArray));
//
//        // Question 5: Finding the Mode of an ArrayList
//        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 2, 6, 7, 2, 8, 9, 2));
//        int mode = numberList.stream().max(Comparator.comparingInt(Collections::frequency)).orElse(null);
//        System.out.println("5. Mode of the list: " + mode);
//
//        // Question 6: Rotating an Array
//        int[] arrayToRotate = {1, 2, 3, 4, 5};
//        int rotateBy = 2;
//        int[] rotatedArray = new int[arrayToRotate.length];
//        for (int i = 0; i < arrayToRotate.length; i++) {
//            rotatedArray[(i + rotateBy) % arrayToRotate.length] = arrayToRotate[i];
//        }
//        System.out.println("6. Rotated array: " + Arrays.toString(rotatedArray));
//
//        // Question 7: Removing Even Numbers from an ArrayList
//        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        integerList.removeIf(num -> num % 2 == 0);
//        System.out.println("7. List after removing even numbers: " + integerList);
//
//        // Question 8: Finding the Intersection of Two Arrays
//        int[] arrayA = {1, 2, 3, 4, 5};
//        int[] arrayB = {3, 4, 5, 6, 7};
//        Set<Integer> intersection = new HashSet<>();
//        for (int num : arrayA) {
//            if (Arrays.binarySearch(arrayB, num) >= 0) {
//                intersection.add(num);
//            }
//        }
//        System.out.println("8. Intersection of arrays: " + intersection);
//    }
//}
