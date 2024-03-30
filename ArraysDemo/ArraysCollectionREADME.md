
---

# Arrays and Collections Utility Class

## Overview

The Arrays and Collections Utility Class in Java provides a set of static methods to perform common operations on arrays and collections efficiently. These methods encapsulate common functionalities to simplify code and improve readability.

## Features

The utility class offers the following features:

- **Sorting Arrays**: Sort arrays of primitives or objects in ascending or descending order.
- **Converting Arrays to Collections**: Convert arrays to ArrayLists or other collection types.
- **Manipulating Collections**: Perform various operations on collections like shuffling, reversing, and removing duplicates.
- **Finding Elements**: Find minimum, maximum, and average elements in collections.
- **Frequency and Occurrence**: Calculate the frequency of elements or find the last occurrence of an element.
- **Checking Properties**: Check if a collection is empty or contains null values.
- **Immutable and Synchronized Collections**: Create unmodifiable or synchronized views of collections.

## Code Snippets

### Sorting an Array:

```java
import com.example.ArraysAndCollectionsUtils;

int[] array = {3, 1, 4, 1, 5, 9, 2, 6};
ArraysAndCollectionsUtils.sort(array);
System.out.println("Sorted Array: " + Arrays.toString(array));
```

### Converting Array to ArrayList:

```java
import com.example.ArraysAndCollectionsUtils;

int[] array = {3, 1, 4, 1, 5, 9, 2, 6};
ArrayList<Integer> arrayList = ArraysAndCollectionsUtils.arrayToList(array);
System.out.println("ArrayList from Array: " + arrayList);
```

### Finding Maximum Element in ArrayList:

```java
import com.example.ArraysAndCollectionsUtils;

ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
int max = ArraysAndCollectionsUtils.findMax(arrayList);
System.out.println("Maximum element in ArrayList: " + max);
```

