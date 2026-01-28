package com.CSVdatahandling;

import java.io.*;

public class WriteCSV {

    public static void main(String[] args) throws Exception {

      
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

       
        bw.write("ID,Name,Department,Salary");
        bw.newLine();

      
        bw.write("101,Ravi,IT,60000");
        bw.newLine();
        bw.write("102,Anita,HR,45000");
        bw.newLine();
        bw.write("103,Karan,Finance,70000");
        bw.newLine();
        bw.write("104,Pooja,IT,80000");
        bw.newLine();
        bw.write("105,Neha,Sales,50000");

        bw.close();
        System.out.println("CSV file written successfully");
    }
}
