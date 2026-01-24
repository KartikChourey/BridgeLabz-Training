package examresultuploader;
import java.io.*;
import java.util.*;
import java.util.regex.*;

//Raised when CSV format is invalid
class InvalidResultFormatException extends Exception {
 public InvalidResultFormatException(String msg) {
     super(msg);
 }
}

public class ExamResultUploader {

    public static void main(String[] args) {

        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        
        Pattern pattern = Pattern.compile("\\d+,[A-Za-z]+,[A-Za-z]+,\\d+");

        try (BufferedReader br = new BufferedReader(new FileReader("marks.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (!pattern.matcher(line).matches())
                    throw new InvalidResultFormatException("Invalid record: " + line);

                String[] data = line.split(",");

                String subject = data[2];
                int marks = Integer.parseInt(data[3]);

                subjectMarks
                        .computeIfAbsent(subject, k -> new ArrayList<>())
                        .add(marks);
            }

          
            subjectMarks.forEach((sub, marks) -> {
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                pq.addAll(marks);
                System.out.println("Topper in " + sub + ": " + pq.peek());
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
