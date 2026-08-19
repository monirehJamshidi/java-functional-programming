# Java Functional Programming

A practical Java project demonstrating the main concepts of Functional Programming in Java, with simple and focused examples.

The goal of this project is to understand how functional programming concepts such as Lambda Expressions, Functional Interfaces, Method References, Streams, and Optional can be used in everyday Java development.


## 🚀 Technologies

- Java 21
- Maven
- Java Functional Interfaces
- Stream API

## 📚 Topics Covered

- Lambda Expressions
- Functional Interfaces
- Predicate<T>
- Function<T, R>
- Consumer<T>
- Supplier<T>
- Method References
- Stream API
- filter()
- map()
- reduce()
- Optional

## 📁 Project Structure
src/main/java/org/j2os/functional 
│ 
├── consumer 
│ └── ConsumerExample.java 
│ ├── function 
│ └── FunctionExample.java 
│ ├── functionalinterface 
│ ├── Calculator.java │ └── FunctionalInterfaceExample.java │ ├── lambda │ └── LambdaExample.java │ ├── optional │ ├── OptionalExample.java │ └── User.java │ ├── predicate │ └── PredicateExample.java │ ├── reduce │ └── ReduceExample.java │ ├── stream │ ├── Employee.java │ └── StreamExample.java 
│ └── supplier └── SupplierExample.java


## 🔹 Lambda Expressions
Lambda expressions provide a concise way to represent a function.

Example:

```java
List<String> names = List.of("Ali", "Sara", "John");

names.forEach(name -> System.out.println(name));

```

The same operation can also be written using a method reference:

names.forEach(System.out::println);

See:

lambda/LambdaExample.java


## 🔹 Functional Interfaces

A functional interface contains exactly one abstract method and can be used as the target type for a lambda expression.

Example:

@FunctionalInterface
public interface Calculator {
int calculate(int a, int b);
}

Using the interface with a lambda:

Calculator addition = (a, b) -> a + b;

int result = addition.calculate(5, 3);

See:

functionalinterface/Calculator.java

functionalinterface/FunctionalInterfaceExample.java


## 🔹 Predicate<T>

Predicate<T> represents a function that takes an input and returns a boolean value.

Example:

Predicate<Integer> isAdult = age -> age >= 18;

System.out.println(isAdult.test(25));

It can also be used directly with the Stream API:

List<Integer> adults = ages.stream()
.filter(isAdult)
.toList();

See:

predicate/PredicateExample.java

## 🔹 Function<T, R>

Function<T, R> represents a function that:

- takes an input of type T
- returns a result of type R


Example:

Function<String, Integer> getLength =
text -> text.length();

System.out.println(getLength.apply("java"));

The same operation can be expressed with a method reference:

Function<String, Integer> getLengthNew =
String::length;

See:

function/FunctionExample.java


## 🔹 Consumer<T>

Consumer<T> takes an input and performs an operation without returning a result.

Example:

Consumer<String> printer =
name -> System.out.println(name);

printer.accept("Hallo JAVA");

See:

consumer/ConsumerExample.java


## 🔹 Supplier<T>

Supplier<T> takes no input and supplies a value.

Example:

Supplier<String> message =
() -> "Hello, Java!";

System.out.println(message.get());

See:

supplier/SupplierExample.java


## 🔹 Stream API

The Stream API allows collections to be processed in a declarative and functional style.

Example:

List<Employee> employees = List.of(
new Employee("Ali", 28),
new Employee("Sara", 35),
new Employee("John", 42)
);

List<String> names = employees.stream()
.filter(employee -> employee.age() > 30)
.map(Employee::name)
.toList();

Output:

[Sara, John]

This example demonstrates how multiple Stream operations can be combined:

filter() → selects elements
map()    → transforms elements
toList() → collects the result

See:

stream/Employee.java

stream/StreamExample.java


## 🔹 filter() and map()

A simple example combining filter() and map():

List<Integer> numbers = List.of(5, 10, 15, 20);

List<Integer> result = numbers.stream()
.filter(n -> n > 10)
.map(n -> n * 2)
.toList();

System.out.println(result);

Output:

[30, 40]

Here:

filter() → keeps numbers greater than 10
map()    → multiplies each remaining number by 2
toList() → creates the final List

See:

filter_map/Example.java


## 🔹 reduce()
reduce() combines the elements of a Stream into a single result.

Example:

List<Integer> numbers = List.of(5, 10, 15, 20);

int sum = numbers.stream()
.reduce(0, Integer::sum);

System.out.println(sum);

Output:

50

Here, the Stream elements are accumulated into a single value.

See:

reduce/ReduceExample.java



## 🔹 Optional

Optional can be used to represent a value that may or may not be present.

Example:

Optional.ofNullable(user)
.map(User::name)
.ifPresent(System.out::println);

If the Optional is empty, the operation does not execute the ifPresent() action.

See:

optional/OptionalExample.java

optional/User.java


## 🧩 Java Functional Interfaces



These interfaces are part of the java.util.function package and are commonly used together with lambda expressions and the Stream API.

## ▶️ How to Run
### Prerequisites
Make sure you have:

- Java 21 or later
- Maven

### Clone the repository
git clone https://github.com/monirehJamshidi/java-functional-programming

### Open the project
Open the project in your preferred IDE, such as:

- IntelliJ IDEA
- Eclipse
- VS Code

### Run the examples

Each example contains its own main() method and can be run independently.

ConsumerExample
FunctionExample
FunctionalInterfaceExample
LambdaExample
OptionalExample
PredicateExample
ReduceExample
StreamExample
SupplierExample


## 🎯 Purpose of This Project

This project was created as a practical reference for understanding Functional Programming concepts in Java.

Rather than focusing only on theory, each concept is demonstrated through a small and easy-to-understand example.


## 📌 Future Improvements
Possible future additions include:

- More Stream API operations
- flatMap()
- sorted()
- distinct()
- groupingBy()
- More advanced reduce() examples
- Combining multiple functional interfaces
- Unit tests with JUnit 5


## 👩‍💻 Author

### Monireh Jamshidi

Java Developer | Backend Developer

Interested in Java, Spring Boot, Functional Programming, and Backend Development.