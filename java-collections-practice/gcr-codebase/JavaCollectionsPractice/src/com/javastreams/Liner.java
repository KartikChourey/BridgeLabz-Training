package com.javastreams;

import java.io.*;

public class Liner {

    public static void main(String[] args) throws Exception {

      
        BufferedReader br = new BufferedReader(new FileReader("large.log"));

        String line;

      
        while ((line = br.readLine()) != null) {

            if (line.toLowerCase().contains("error")) {
                System.out.println(line);
            }
        }

        br.close();
    }
}
