##  مفاهیم مهم Functional Programming در Java

برای مصاحبه بهتره آدم این موارد را بلد باشه :

### 1. Lambda Expression

Lambda یعنی یک تابع کوتاه و بدون نام.
```java
(a, b) -> a + b
```

مثلاً:

```java
List<String> names = List.of("Ali", "Sara", "John");

names.forEach(name -> System.out.println(name));
```

یا:

```java
names.forEach(System.out::println);
```

### 2. Functional Interface

یک Interface که دقیقاً یک abstract method دارد.
مثلاً:

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

بعد:

```java
Calculator add = (a, b) -> a + b;

System.out.println(add.calculate(5, 3));
```

خروجی:

```java
8
```

Interfaceهای معروف Java:

- Predicate<T>
- Function<T, R>
- Consumer<T>
- Supplier<T>
- UnaryOperator<T>
- BinaryOperator<T>

### 3. Predicate

برای زمانی که می‌خواهیم یک شرط را بررسی کنیم.

```java
Predicate<Integer> isAdult = age -> age >= 18;

System.out.println(isAdult.test(20));
```

خروجی:

```java
true
```

در Stream خیلی استفاده می‌شود:

```java
numbers.stream()
       .filter(n -> n > 10)
       .toList();
```

اینجا Lambda داخل filter عملاً نقش یک Predicate را دارد.

### 4. Function

یک مقدار می‌گیرد و یک مقدار دیگر برمی‌گرداند.

```java
Function<String, Integer> length = text -> text.length();

System.out.println(length.apply("Java"));
```

خروجی:

```java
4
```

مثلاً:

```java
Function<Employee, String> getName =
        employee -> employee.getName();
```


### 5. Consumer

یک مقدار می‌گیرد ولی چیزی برنمی‌گرداند.

```java
Consumer<String> printer =
        name -> System.out.println(name);

printer.accept("Monireh");
```

### 6. Supplier

هیچ ورودی نمی‌گیرد ولی یک مقدار تولید می‌کند.

```java
Supplier<Double> randomNumber =
        () -> Math.random();

System.out.println(randomNumber.get());
```


### 7. Stream API ⭐

این قسمت برای کسی به‌عنوان Java Developer خیلی مهم است.

مثلاً:

```java
List<Integer> numbers =
        List.of(5, 12, 20, 7, 30);
```

می‌خواهیم اعداد بزرگ‌تر از 10 را پیدا کنیم:

```java
List<Integer> result = numbers.stream()
        .filter(n -> n > 10)
        .toList();
```


خروجی:

```java
[12, 20, 30]
```

می‌توانیم چند operation را زنجیره‌ای کنیم:

```java
List<String> result = employees.stream()
        .filter(e -> e.getAge() > 30)
        .map(Employee::getName)
        .sorted()
        .toList();
```

اینجا:

```java
filter → map → sorted → toList
```


### 8. map و filter

این دو را حتماً برای مصاحبه خوب یاد گرفت.

#### filter

```java
numbers.stream()
       .filter(n -> n > 10)
```

#### map

هر عنصر را به چیز دیگری تبدیل می‌کند:

```java
names.stream()
     .map(String::toUpperCase)
```

مثلاً:

```java
["ali", "sara"]
```

تبدیل می‌شود به:

```java
["ALI", "SARA"]
```

### 9. Method Reference

به جای:
```java
names.forEach(name -> System.out.println(name));
```


می‌توانیم بنویسیم:
```java
names.forEach(System.out::println);
```

این را Method Reference می‌گویند.


چند شکل مهم:

```java
ClassName::staticMethod
```
    
```java
object::instanceMethod
```

```java
ClassName::instanceMethod
```

و constructor:

```java
ClassName::new
```

### 10. Optional

Optional هم از مفاهیم مهم Java 8 و سبک Functional است.

مثلاً به جای:

```java
if (user != null) {
    System.out.println(user.getName());
}
```

می‌توانیم داشته باشیم:

```java
Optional.ofNullable(user)
        .map(User::getName)
        .ifPresent(System.out::println);
```

البته در پروژه واقعی نباید همه‌جا از Optional استفاده کنیم.

