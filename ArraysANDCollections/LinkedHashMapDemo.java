import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // Create a LinkedHashMap with access order set to true
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        //Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);

        // Add elements to the LinkedHashMap
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);

        // Print the elements in insertion order
        System.out.println("LinkedHashMap elements in insertion order:");
        printMap(linkedHashMap);

        // Access an element to change the access order
        System.out.println("\nAccessing an element to change access order: "+linkedHashMap.get("Two"));

        // Print the elements again to show access order
        System.out.println("\nLinkedHashMap elements after accessing an element (access order):");
        printMap(linkedHashMap);
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
