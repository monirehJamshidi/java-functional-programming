package org.j2os.functional.functionalinterface;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;

        int result = addition.calculate(5, 3);

        System.out.println(result);
    }
}
