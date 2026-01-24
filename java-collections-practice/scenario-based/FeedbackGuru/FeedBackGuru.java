package FeedbackGuru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedBackGuru {

    public static void main(String[] args) {


        Map<String, List<String>> feedbackMap = new HashMap<>();
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        // Regex to extract ratings
        Pattern ratingPattern = Pattern.compile("(\\d+)/10");

        try (BufferedReader br = new BufferedReader(new FileReader("feedback.txt"))) {

            String line;

            
            while ((line = br.readLine()) != null) {

                Matcher matcher = ratingPattern.matcher(line);

                if (matcher.find()) {
                    int rating = Integer.parseInt(matcher.group(1));

                    if (rating >= 8)
                        feedbackMap.get("Positive").add(line);
                    else if (rating >= 5)
                        feedbackMap.get("Neutral").add(line);
                    else
                        feedbackMap.get("Negative").add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading feedback file");
        }

    
        feedbackMap.forEach((k, v) -> {
            System.out.println(k + ": " + v.size());
        });
    }
}
