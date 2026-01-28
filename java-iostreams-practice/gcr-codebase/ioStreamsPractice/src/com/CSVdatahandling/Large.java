package com.CSVdatahandling;

import java.io.*;

public class Large {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("big.csv"));
        int count = 0;
        int processed = 0;

        br.readLine(); 
        String line;

        while ((line = br.readLine()) != null) {

            processed++;
            count++;

           
            if (count == 100) {
                System.out.println("Processed: " + processed);
                count = 0;
            }
        }
        br.close();
    }
}

