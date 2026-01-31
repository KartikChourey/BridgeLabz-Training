package markmate;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MarkMate {

    public static String grade(double avg) {
        if (avg >= 85) return "A";
        if (avg >= 70) return "B";
        return "C";
    }

    public static void main(String[] args) throws Exception {

        List<String> lines = Files.readAllLines(Paths.get("marks.csv"));
        JSONArray reportCards = new JSONArray();

        for (int i = 1; i < lines.size(); i++) {

            String[] data = lines.get(i).split(",");

            int maths = Integer.parseInt(data[2]);
            int science = Integer.parseInt(data[3]);
            int english = Integer.parseInt(data[4]);

            int total = maths + science + english;
            double average = total / 3.0;

            JSONObject student = new JSONObject();
            student.put("id", data[0]);
            student.put("name", data[1]);
            student.put("total", total);
            student.put("average", average);
            student.put("grade", grade(average));

            reportCards.put(student);
        }

        Files.write(
                Paths.get("report_card.json"),
                reportCards.toString(2).getBytes()
        );

        System.out.println("Report cards generated");
    }
}
