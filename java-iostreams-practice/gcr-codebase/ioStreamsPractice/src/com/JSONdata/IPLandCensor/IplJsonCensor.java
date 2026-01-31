package com.JSONdata.IPLandCensor;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class IplJsonCensor {

    public static String maskTeam(String team) {
        return team.split(" ")[0] + " ***";
    }

    public static void main(String[] args) throws Exception {

       
        String content = new String(
                Files.readAllBytes(Paths.get("ipl_input.json"))
        );

        JSONArray matches = new JSONArray(content);

        for (int i = 0; i < matches.length(); i++) {
            JSONObject match = matches.getJSONObject(i);

      
            String team1 = match.getString("team1");
            String team2 = match.getString("team2");

            match.put("team1", maskTeam(team1));
            match.put("team2", maskTeam(team2));

        
            match.put("player_of_match", "REDACTED");

          
            match.put("winner", maskTeam(match.getString("winner")));
        }

   
        Files.write(
                Paths.get("ipl_censored.json"),
                matches.toString(2).getBytes()
        );

        System.out.println("JSON Censorship Completed");
    }
}
