
# Java 8 Stream API – Practice & Revision

This repository contains Java 8 Stream API coding practice, basic concepts, and interview-oriented questions.

## 1. What is Stream API?

Stream API was introduced in Java 8 to process collections of data in a clean and readable way.

- It helps filter, transform, sort, and process data.
- It does not modify the original collection.
- It supports functional-style programming using lambda expressions.
- A Stream does not store data; it processes data from a source.

## 2. Stream Pipeline

A Stream pipeline consists of 3 parts:

**Source → Intermediate Operations → Terminal Operation**

### 1. Source
The place from where the Stream gets its data.

Examples:
- `list.stream()`
- `Arrays.stream(array)`
- `Stream.of(1, 2, 3)`

### 2. Intermediate Operations
These operations transform or filter data and return another Stream.

They are lazy, meaning they execute only when a terminal operation is called.

| Method | Purpose |
|---|---|
| `filter()` | Select elements based on a condition |
| `map()` | Transform each element |
| `sorted()` | Sort elements |
| `distinct()` | Remove duplicates |
| `limit()` | Restrict the number of elements |
| `skip()` | Skip the first N elements |
| `flatMap()` | Flatten nested Streams |

### 3. Terminal Operations
These operations trigger Stream processing and produce a result or side effect.

| Method | Purpose |
|---|---|
| `forEach()` | Perform an action on each element |
| `collect()` | Collect elements into a collection or other result |
| `reduce()` | Combine elements into a single result |
| `count()` | Count the elements |
| `findFirst()` | Return the first element as Optional |
| `findAny()` | Return any element as Optional |
| `min()` | Find the minimum element |
| `max()` | Find the maximum element |
| `anyMatch()` | Check if any element matches |
| `allMatch()` | Check if all elements match |
| `noneMatch()` | Check if no element matches |

## 3. Important Methods – Quick Revision

### filter()
Used to select elements based on a condition.

```java
List<Integer> result = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
```

### map()
Used to transform each element into another value.

```java
List<Integer> squares = numbers.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());
```

### reduce()
Used to combine all elements into a single result, such as sum or product.

```java
int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b);
```

For multiplication:

```java
int product = numbers.stream()
    .reduce(1, (a, b) -> a * b);
```

### collect()
Used to collect Stream elements into a List, Set, Map, or another result.

```java
List<Integer> result = numbers.stream()
    .filter(n -> n > 5)
    .collect(Collectors.toList());
```

### findFirst() and Optional
`findFirst()` returns an `Optional<T>` because the Stream may be empty.

```java
Optional<Integer> result = numbers.stream()
    .filter(n -> n > 10)
    .findFirst();
```

- `get()` – Returns the value if present; throws an exception if empty.
- `orElse()` – Returns a default value if empty.
- `ifPresent()` – Executes an action if a value is present.
- `isPresent()` – Checks whether a value exists.

```java
int value = result.orElse(0);
```

## 4. Practice Questions

- [ ] How do you create Streams in Java?
- [ ] Filter even numbers from a list.
- [ ] Convert numbers in a list to their squares.
- [ ] Square even numbers from a list.
- [ ] Find the first number greater than 10 from a list.
- [ ] Count how many numbers are greater than 5 in a list.
- [ ] Find the sum/product of all numbers in a list.
- [ ] Find the sum of even numbers in a list.
- [ ] Find the maximum number in a list.
- [ ] Find the sum of squares of even numbers in a list.

## 5. Key Points to Remember

1. Intermediate operations return a Stream.
2. Terminal operations trigger Stream execution.
3. Streams are lazy until a terminal operation is called.
4. A Stream cannot be reused after a terminal operation.
5. `map()` transforms data, while `filter()` selects data.
6. `reduce()` combines elements into one result.
7. `collect()` gathers elements into a collection or another result.
8. `findFirst()` returns an Optional, not the direct value.
9. Stream operations do not modify the original collection by default.

## Goal

To strengthen Java 8 Stream API concepts through hands-on coding practice and prepare for Java backend interviews.