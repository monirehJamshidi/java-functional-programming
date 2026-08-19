package org.j2os.functional.supplier;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> message =
                () -> "Hello, Java!";

        System.out.println(message.get());
    }
}
