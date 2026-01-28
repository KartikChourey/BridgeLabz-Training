package com.CSVdatahandling;

import java.io.*;

public class SearchEmployee {

    public static void main(String[] args) throws Exception {

        String searchName = "Ravi";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));

        br.readLine(); 
        String line;

        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

          
            if (data[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + data[2]);
                System.out.println("Salary: " + data[3]);
                break;
            }
        }
        br.close();
    }
}
