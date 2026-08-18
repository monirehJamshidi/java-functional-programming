package org.j2os.functional.lambda;

import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Sara", "John");

        names.forEach(name -> System.out.println(name));


        //Method Reference
        names.forEach(System.out::println);
    }
}
