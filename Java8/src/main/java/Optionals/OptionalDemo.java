package Optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {

        public static void main(String[] args) {
            // Example 1: Creating an Optional with a non-null value
            Optional<String> optional1 = Optional.of("Hello");
            System.out.println("1. Optional with non-null value: " + optional1);

            // Example 2: Creating an empty Optional
            Optional<String> optional2 = Optional.empty();
            System.out.println("2. Empty Optional: " + optional2);

            // Example 3: Creating an Optional with a potentially null value
            String str = "World";
            Optional<String> optional3 = Optional.ofNullable(null);
            System.out.println("3. Optional with potentially null value: " + optional3);

            // Example 4: Checking if Optional contains a value
            if (optional3.isPresent()) {
                System.out.println("4. Optional contains a value: " + optional3.get());
            } else {
                System.out.println("4. Optional is empty");
            }

            // Example 5: Default value if Optional is empty
            String value = optional2.orElse("Default Value");
            System.out.println("5. Value of Optional (or default): " + value);

            // Example 6: Default value supplier if Optional is empty
            String valueSupplier = optional2.orElseGet(() -> "Default Value from Supplier");
            System.out.println("6. Value of Optional (or default from supplier): " + valueSupplier);

            // Example 7: Throw exception if Optional is empty
            try {
                String valueOrThrow = optional2.orElseThrow(() -> new NoSuchElementException("Optional is empty"));
                System.out.println("7. Value of Optional (or throw exception): " + valueOrThrow);
            } catch (NoSuchElementException e) {
                System.out.println("7. " + e.getMessage());
            }

            // Example 8: Filter and map operations on Optional
            Optional<Integer> optionalInt = Optional.of(10);
            Optional<Integer> filtered = optionalInt.filter(x -> x > 5);
            Optional<String> mapped = filtered.map(Object::toString);
            System.out.println("8. Filtered and mapped value: " + mapped.orElse("Empty"));

            // Example 9: Chaining methods on Optional
            String result = Optional.of("Hello")
                    .map(s -> s + " World")
                    .filter(s -> s.length() > 5)
                    .orElse("Too short");
            System.out.println("9. Chained methods result: " + result);

            // Example 10: Transforming Optional to Stream
            Optional<String> optionalString = Optional.of("Transform");
            optionalString.stream().forEach(System.out::println);

            Optional<String> optional = Optional.of("hello");
            optional.ifPresent(val -> System.out.println("Value: " + value));
        }
    }


