package resumeanalyzer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeAnalyzer {

    public static void main(String[] args) {


        File resumeFolder = new File("resumes");

      
        Map<String, ResumeData> resumeMap = new HashMap<>();

      
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");
        Pattern phonePattern = Pattern.compile("\\b[6-9][0-9]{9}\\b");


        Pattern keywordPattern = Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

        // Loop through each file in folder
        for (File file : resumeFolder.listFiles()) {
            try {
                // Skip non-text files
                if (!file.getName().endsWith(".txt")) {
                    throw new IOException("Invalid file format");
                }

                // Read entire resume content
                String content = Files.readString(file.toPath());

                // Extract email
                Matcher emailMatcher = emailPattern.matcher(content);
                if (!emailMatcher.find()) continue;

                String email = emailMatcher.group();

                
                Matcher phoneMatcher = phonePattern.matcher(content);
                String phone = phoneMatcher.find() ? phoneMatcher.group() : "Not Found";

           
                Matcher keywordMatcher = keywordPattern.matcher(content);
                int count = 0;
                while (keywordMatcher.find()) count++;

      
                resumeMap.put(email, new ResumeData(email, phone, count));

            } catch (Exception e) {
           
                System.out.println("Skipping file: " + file.getName());
            }
        }

        
        List<ResumeData> sortedList = new ArrayList<>(resumeMap.values());
        sortedList.sort((a, b) -> b.keywordCount - a.keywordCount);

        for (ResumeData r : sortedList) {
            System.out.println(r.email + " | Keywords: " + r.keywordCount);
        }
    }
}
