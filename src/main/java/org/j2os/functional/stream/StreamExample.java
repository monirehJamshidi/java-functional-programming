package org.j2os.functional.stream;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ali", 28),
                new Employee("Sara", 35),
                new Employee("John", 42)
        );

        List<String> names = employees.stream()
                .filter(employee -> employee.age() > 30)
                .map(Employee::name)
                .toList();

        System.out.println(names);
    }
}
