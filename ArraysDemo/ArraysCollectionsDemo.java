import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysCollectionsDemo {

        public static void main(String[] args) {
            // Question 1: Sorting an Array of Integers
            int[] arr1 = {3,7,8,1,5,9};
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));

            // Question 2: Checking for Equality of Two Arrays
            //user preferences of 2 diff users - equal?
            int[] arr2 = { 6,2,1};
            System.out.println("is equal? "+ Arrays.equals(arr1, arr2));


            // Question 3: Finding the Maximum Element in an ArrayList
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 7, 3, 1, 2, 9, 2, 5));
            System.out.println("max element "+ Collections.max(list1));

            // Question 4: Shuffling Elements of an ArrayList
            //quiz app - randomise the questions

            Collections.shuffle(list1);
            System.out.println("shuffled list "+list1);
            // Question 5: Finding the Frequency of an Element in an ArrayList

            int freq = Collections.frequency(list1, 2);
            System.out.println("frequency = "+ freq);

            // Question 7: Converting Array to ArrayList
            String[] fruits = {"apple", "pineapple","cherry" ,"banana", "grapes", "cherry" ,"banana"};
            ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));
            System.out.println("fruits "+ fruitsList);
//
//            // Question 8: Reversing an Array
//            Collections.reverse(Arrays.asList(fruits));
//            System.out.println(Arrays.toString(fruits));
//
//            // Question 9: Removing All Occurrences of an Element from an ArrayList
//            list1.removeAll(Collections.singleton(2));
//            System.out.println(list1);
//
//            // Question 10: Copying Elements from ArrayList to Array
//            Integer[] arrList = list1.toArray(new Integer[0]);
//            System.out.println("copied array "+Arrays.toString(arrList));
//
//
//            // Question 11: Removing Null Values from an ArrayList
//            ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", null, "banana", null, "orange"));
//
//            stringList.removeAll(Collections.singleton(null));
//            System.out.println("removed null "+stringList);
//
//
//            // Question 14: Sorting a List of Strings in Reverse Order
//            Collections.sort(fruitsList, Collections.reverseOrder());
//            System.out.println("fruits list after sorting in reverse"+fruitsList);

            // Question 15: Finding the Index of the Last Occurrence of a sublist in a List

            int lastIndex = Collections.lastIndexOfSubList(fruitsList, Arrays.asList("cherry", "banana"));

            System.out.println("last index "+ lastIndex);

            // Question 16: Creating an Unmodifiable List
            List<Integer> unmodif = Collections.unmodifiableList(Arrays.asList(7, 9, 2));
            System.out.println(unmodif);


            // Question 17: Creating a Synchronized List

            List<String> synchList = Collections.synchronizedList(fruitsList);
            synchList.add("dragonfruit");
            System.out.println(synchList);
        }
    }


