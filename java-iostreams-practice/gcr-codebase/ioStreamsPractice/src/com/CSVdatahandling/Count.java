package com.CSVdatahandling;
import java.io.*;

public class Count {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));

      
        br.readLine();

        int count = 0;
        while (br.readLine() != null) {
            count++;
        }

        br.close();
        System.out.println("Total Records: " + count);
    }
}
