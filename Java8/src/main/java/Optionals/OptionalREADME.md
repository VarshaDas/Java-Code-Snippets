**README.md**

# Optional in Java

## What is Optional?

`Optional` is a container object that may or may not contain a non-null value. It was introduced in Java 8 as part of the `java.util` package to represent optional values and to deal with the problem of null references in a more effective and expressive way.

## Why Optional?

Prior to the introduction of `Optional` in Java 8, handling null values often led to NullPointerExceptions (NPEs), which could be difficult to debug and manage. `Optional` provides a more explicit and safer way to handle the absence of a value, reducing the likelihood of NPEs and improving code clarity and robustness.

## Before Optional

Before the introduction of `Optional`, developers commonly used null references to represent the absence of a value. This approach often resulted in code that was hard to read, maintain, and debug. Null checks were required everywhere, leading to verbose and error-prone code. Additionally, it was not always clear whether a method could return null or not, making it challenging to reason about the behavior of the code.

## Problems Solved by Optional

### 1. Null Pointer Safety
- `Optional` provides a safer alternative to null references, reducing the risk of NullPointerExceptions and improving code reliability.

### 2. Improved Code Readability
- By using `Optional`, code becomes more expressive and self-documenting, as it clearly indicates whether a value may be absent or present.

### 3. Forced Null Checking
- `Optional` encourages developers to explicitly handle the case of a missing value, either by providing a default value or performing an alternative action, thus promoting defensive programming practices.

## Basic Methods

### Creation:
- `Optional.of(T value)`: Creates an `Optional` with the specified non-null value, throwing a NullPointerException if the value is null.
- `Optional.ofNullable(T value)`: Creates an `Optional` with the specified value, which may be null.

### Checking for Presence:
- `isPresent()`: Returns true if the `Optional` contains a non-null value.
- `isEmpty()`: Returns true if the `Optional` is empty.

### Getting the Value:
- `get()`: Returns the value if present, otherwise throws a NoSuchElementException.

### Conditional Retrieval:
- `orElse(T other)`: Returns the value if present, otherwise returns the specified default value.
- `orElseGet(Supplier<? extends T> other)`: Returns the value if present, otherwise invokes the specified supplier and returns its result.
- `orElseThrow()`: Returns the value if present, otherwise throws the specified exception.

### Mapping and Filtering:
- `map(Function<? super T, ? extends U> mapper)`: Applies the specified mapping function to the value if present.
- `flatMap(Function<? super T, ? extends Optional<? extends U>> mapper)`: Applies the specified mapping function to the value if present and returns the result.
- `filter(Predicate<? super T> predicate)`: If a value is present, applies the given predicate to it, and returns an `Optional` describing the value if the predicate returns true.

### Utility Methods:
- `ifPresent(Consumer<? super T> consumer)`: If a value is present, performs the given action with the value.
- `ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)`: If a value is present, performs the given action with the value, otherwise performs the specified empty action.
- `equals(Object obj)`: Indicates whether some other object is "equal to" this Optional.

## Conclusion

`Optional` provides a more structured and reliable approach to handling optional values in Java, addressing common pitfalls associated with null references. By encouraging explicit handling of absent values and providing a rich set of methods for working with optionals, `Optional` improves code clarity, safety, and maintainability.