package com.JSONdata.IPLandCensor;

import java.nio.file.*;
import java.util.*;

public class IplCsvCensor {

    public static String maskTeam(String team) {
        return team.split(" ")[0] + " ***";
    }

    public static void main(String[] args) throws Exception {

        List<String> lines = Files.readAllLines(Paths.get("ipl_input.csv"));
        List<String> output = new ArrayList<>();

      
        output.add(lines.get(0));

   
        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");

            data[1] = maskTeam(data[1]);   
            data[2] = maskTeam(data[2]);   
            data[5] = maskTeam(data[5]);  
            data[6] = "REDACTED";          

            output.add(String.join(",", data));
        }

        Files.write(Paths.get("ipl_censored.csv"), output);

        System.out.println("CSV Censorship Completed");
    }
}
