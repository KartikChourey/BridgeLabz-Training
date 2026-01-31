package com.functionalinterface;
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}

public class Password {
    public static void main(String[] args) {

        System.out.println(SecurityUtils.isStrongPassword("Admin123"));
    }
}
