package com.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {

        try {
            // Trying to open the file
            FileInputStream fis = new FileInputStream("data.txt");

            int ch;

            // Reading file character by character
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
     
            System.out.println("File not found");
        }
    }
}
