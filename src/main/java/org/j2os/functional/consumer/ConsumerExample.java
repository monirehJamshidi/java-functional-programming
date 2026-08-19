package org.j2os.functional.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> printer =
                name -> System.out.println(name);

        printer.accept("Hallo JAVA");
    }
}
