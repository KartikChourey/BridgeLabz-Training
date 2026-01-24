package chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;


public class ChatLogParser {

    public static void main(String[] args) {

 
        Map<String, List<String>> userMessages = new TreeMap<>();

      
        Pattern pattern = Pattern.compile("\\[(.*?)\\] (.*?): (.*)");

        // Idle chat keywords
        List<String> idleWords = List.of("lol", "brb", "haha");

        // Filter to remove idle chats
        MessageFilter<String> filter = msg ->
                idleWords.stream().noneMatch(word -> msg.toLowerCase().contains(word));

        try (BufferedReader br = new BufferedReader(new FileReader("chat.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                Matcher matcher = pattern.matcher(line);

                if (matcher.matches()) {
                    String user = matcher.group(2);
                    String message = matcher.group(3);

                  
                    if (!filter.allow(message)) continue;

                    userMessages
                            .computeIfAbsent(user, k -> new ArrayList<>())
                            .add(message);
                }
            }

        
            userMessages.forEach((user, msgs) -> {
                System.out.println(user + " -> " + msgs);
            });

        } catch (IOException e) {
            System.out.println("Error reading chat logs.");
        }
    }
}
