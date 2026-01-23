package com.exception;

public class MultipleCatch {

    public static void main(String[] args) {

        try {
            // Declaring and initializing array
            int[] arr = {10, 20, 30};

            int index = 5;

            // Accessing array element
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
         
            System.out.println("Array is not initialized!");
        }
    }
}
