package org.j2os.functional.reduce;

import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, 20);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
