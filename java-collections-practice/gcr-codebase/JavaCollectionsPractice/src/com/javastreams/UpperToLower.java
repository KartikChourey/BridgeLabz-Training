package com.javastreams;

import java.io.*;

public class UpperToLower {

    public static void main(String[] args) throws Exception {

        // Reading from source text file
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

  
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String line;

        // Reading file line by line
        while ((line = br.readLine()) != null) {

            // Converting line to lowercase
            bw.write(line.toLowerCase());
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Uppercase converted to lowercase successfully.");
    }
}
