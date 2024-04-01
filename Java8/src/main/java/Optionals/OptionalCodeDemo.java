package main.java.Optionals;

import java.util.Objects;
import java.util.Optional;

public class OptionalCodeDemo {
    public static void main(String[] args) {
        // Example 1: Creating an Optional with a non-null value
        Optional<String> optional1 = Optional.of("varsha");
        System.out.println(optional1.get());


        // Example 2: Creating an empty Optional

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);



        // Example 3: Creating an Optional with a potentially null value


        Optional<String> optionalWithNullValue = Optional.ofNullable(null);
        System.out.println("optionalWithNullValue :"+optionalWithNullValue);


        // Example 4: Checking if Optional contains a value

        if(optionalWithNullValue.isPresent()){
            System.out.println("yes optional value exists "+optionalWithNullValue.get());
        } else {
            System.out.println("optional does not exist");
        }

        //api - Optional - explicitly handle it -



        // Example 5: Default value if Optional is empty

        String optWithDefault = optionalWithNullValue.orElse("Default value");
        System.out.println(optWithDefault);


        // Example 6: Default value supplier if Optional is empty

        String optWithDefaultSupplier = optionalWithNullValue.orElseGet(() -> "Default value with supplier");
        System.out.println(optWithDefaultSupplier);


        // Example 7: Throw exception if Optional is empty

        try {
            optionalWithNullValue.orElseThrow();
        } catch (Exception e){
            System.out.println("exception occured"+e);
        }


        // Example 8: Filter and map operations on Optional
        Optional<Integer> optInt = Optional.of(50);
        Optional<Integer> optFiltered = optInt.filter(val -> val < 10);
        Optional<String> optString = optFiltered.map(Objects::toString);
        System.out.println(optString.orElse("default mapped value"));


        // Example 9: Chaining methods on Optional

        String chainedOutput = Optional.of("Hello")
                .map(s -> s.concat("World"))
                .filter(s -> s.length() > 15)
                .orElse("default string");

        System.out.println(chainedOutput);


        // Example 10: Transforming Optional to Stream

        Optional.of("some string").stream().forEach(System.out::println);

        optional1.ifPresent(x  -> System.out.println("hey optional is present"));

    }
}
