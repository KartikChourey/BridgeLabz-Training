package com.functionalinterface;

interface Sensitivee {
}

class UserCredentials implements Sensitivee {
    String password = "secret";
}

public class Sensitive {
    public static void main(String[] args) {

        UserCredentials user = new UserCredentials();
        System.out.println("Sensitive data object created");
    }
}
