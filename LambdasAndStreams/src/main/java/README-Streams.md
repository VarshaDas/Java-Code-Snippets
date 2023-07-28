# 

# Java Streams

A *Stream in Java* - **sequence of elements from a source**.

## Background and History

Before Java 8, working with collections in Java involved writing iterative loops and manually performing operations on the data. However, Java 8 introduced Java Streams, a game-changing feature that brought functional programming concepts to the Java language. This opened up new possibilities for writing expressive and concise code when working with collections.

#### Before
![Screenshot 2023-07-27 at 11.07.16 PM.png](..%2F..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202023-07-27%20at%2011.07.16%20PM.png)

## Importance of Learning Java Streams

Learning Java Streams is crucial for several reasons. Firstly, it enables you to write more readable and maintainable code. With the power of lambda expressions and functional interfaces, you can perform complex operations on collections in a more concise and expressive manner.

Secondly, Java Streams promote a declarative style of programming, where you focus on describing what you want to achieve rather than the step-by-step implementation details. This leads to cleaner code that is easier to understand and maintain.

Furthermore, Java Streams provide a higher level of abstraction, allowing you to perform common data manipulation tasks such as filtering, mapping, and reducing with simplicity and efficiency. This abstraction makes your code more modular and reusable, saving you time and effort in the long run.

## Operations

#### Stream Creation

Streams can be created from various data sources such as collections, arrays, I/O channels, or generator functions. Here are examples of creating stream

```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> streamFromList = numbers.stream();

int[] array = {1, 2, 3, 4, 5};
IntStream streamFromArray = Arrays.stream(array);

Stream<String> streamFromIO = Files.lines(Paths.get("file.txt"));

Stream<Integer> streamFromGenerator = Stream.generate(() -> 42);

```

#### Intermediate Operations

Intermediate operations are used to transform, filter, or manipulate the elements of a Stream. They return a new Stream as a result. Some commonly used intermediate operations are:

* `filter(Predicate<T>)`: Filters elements based on a given condition.
* `map(Function<T, R>)`: Transforms each element of the Stream to another type.
* `flatMap(Function<T, Stream<R>> )`: Flattens nested Streams into a single Stream.

#### Terminal Operations

Terminal operations produce a final result or a side effect. They trigger the processing of the Stream and do not return another Stream. Examples of terminal operations are:

* `forEach(Consumer<T>)`: Performs an action for each element in the Stream.
* `collect(Collector<T, A, R>)`: Accumulates the elements into a collection or other data structure.
* `reduce(BinaryOperator<T>)`: Performs a reduction on the elements of the Stream.

#### Lazy Evaluation

Java Streams employ lazy evaluation, which means that the elements of a Stream are processed on-demand, only when a terminal operation is invoked. This approach allows for optimization by avoiding unnecessary computations and improving performance when working with large or infinite Streams.
