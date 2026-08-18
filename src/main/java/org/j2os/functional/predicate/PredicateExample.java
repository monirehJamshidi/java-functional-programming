package org.j2os.functional.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(25));


        //with Stream
        //wir gibt Predicate direkt zu filter()
        // und Predicate ist isAdult
        List<Integer> ages = List.of(15, 18, 21, 30);

        List<Integer> adults = ages.stream()
                .filter(isAdult) //.filter(age -> age >= 18)
                .toList();

        adults.forEach(System.out::println);

        /*
        * What is a Predicate in Java?
        * A Predicate is a functional interface that takes an
        * input and returns a boolean value. It is commonly used
        * for filtering data.
        *
        *
        *
        * */
    }
}
