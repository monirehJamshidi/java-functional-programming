package org.j2os.functional.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(25));
    }
}
