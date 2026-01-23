package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWith {

    public static void main(String[] args) {

        // try-with-resources automatically 
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            // Reading first line of file
            String line = br.readLine();
            System.out.println(line);

        } catch (IOException e) {
       
            System.out.println("Error reading file");
        }
    }
}
