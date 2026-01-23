package com.exception;

import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking numbers
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            // Performing division
            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
       
            System.out.println("Division by zero error");

        } finally {
          
            System.out.println("Operation completed");
        }

        sc.close();
    }
}
