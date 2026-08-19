package org.j2os.functional.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        User user = new User("Monireh");

        Optional.ofNullable(user)
                .map(User::name)
                .ifPresent(System.out::println);


        //Es zeigt empty
        //aber druckt nichts aus
        Optional<User> user1 = Optional.empty();

        user1.map(User::name)
                .ifPresent(System.out::println);
    }
}
