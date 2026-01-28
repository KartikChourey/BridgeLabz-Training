package com.CSVdatahandling;

import java.io.*;
import java.util.*;

public class DetectDuplicates {

    public static void main(String[] args) throws Exception {

        Set<String> ids = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));

        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {

            String id = line.split(",")[0];

            if (!ids.add(id)) {
                System.out.println("Duplicate Found: " + line);
            }
        }
        br.close();
    }
}
