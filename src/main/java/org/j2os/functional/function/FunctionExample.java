package org.j2os.functional.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> getLength =text -> text.length();

        System.out.println(getLength.apply("java"));

        //Method Reference
        Function<String, Integer> getLengthNew = String::length;
        System.out.println(getLengthNew.apply("Monireh"));
    }
}
