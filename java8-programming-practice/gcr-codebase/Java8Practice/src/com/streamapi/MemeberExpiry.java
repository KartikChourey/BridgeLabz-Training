package com.streamapi;

import java.time.LocalDate;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class MemeberExpiry {
    public static void main(String[] args) {

        List<Member> members = List.of(
                new Member("Kartik", LocalDate.now().plusDays(10)),
                new Member("Rahul", LocalDate.now().plusDays(40)),
                new Member("Neha", LocalDate.now().plusDays(25))
        );

        members.stream()
               .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
               .forEach(m -> System.out.println(m.name));
    }
}
