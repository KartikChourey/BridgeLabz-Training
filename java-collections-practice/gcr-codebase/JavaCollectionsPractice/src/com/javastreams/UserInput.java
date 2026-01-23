package com.javastreams;

import java.io.*;

public class UserInput {

    public static void main(String[] args) {

        try {
            // Reading input from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Writing data into a file
            FileWriter fw = new FileWriter("Info.txt");

            System.out.print("Enter Name: ");
            String name = br.readLine();

            System.out.print("Enter Age: ");
            String age = br.readLine();

            System.out.print("Favorite Programming Language: ");
            String language = br.readLine();

            // Writing user details to file
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Language: " + language + "\n");

            fw.close();

            System.out.println("User details saved successfully.");

        } catch (Exception e) {

            System.out.println("Error while saving user data.");
        }
    }
}
