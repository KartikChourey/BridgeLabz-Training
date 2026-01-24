package examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    public static void main(String[] args) throws IOException {

        
        String[] answerKey = {"A", "B", "C", "D", "A", "B", "C"};

  
        Map<String, Integer> scores = new HashMap<>();

      
        Pattern csvPattern = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

        BufferedReader br = new BufferedReader(new FileReader("answers.csv"));
        String line;

        while ((line = br.readLine()) != null) {

         
            if (!csvPattern.matcher(line).matches()) continue;

            String[] parts = line.split(",");
            String name = parts[0];
            int score = 0;

            // Compare 
            for (int i = 1; i < parts.length; i++) {
                if (parts[i].equals(answerKey[i - 1])) {
                    score++;
                }
            }

            scores.put(name, score);
        }

        br.close();


        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(scores.entrySet());

     
        while (!pq.isEmpty()) {
            var entry = pq.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
