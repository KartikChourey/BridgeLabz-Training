package com.CSVdatahandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {

    public static void main(String[] args) throws Exception {

        Pattern emailPattern =
            Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Pattern phonePattern =
            Pattern.compile("\\d{10}");

        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

         
            if (!emailPattern.matcher(data[2]).matches()
                || !phonePattern.matcher(data[3]).matches()) {

                System.out.println("Invalid Row: " + line);
            }
        }
        br.close();
    }
}
