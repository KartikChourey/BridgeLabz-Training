package DealTracker;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;


public class DealTracker {

    public static void main(String[] args) {

        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();

        Pattern discountPattern = Pattern.compile("(\\d+)%");
        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("deal.txt")))) {

            String line;
            String code = "", date = "";
            int discount = 0;

            while ((line = br.readLine()) != null) {

                if (line.startsWith("DealCode"))
                    code = line.split(": ")[1];

                if (line.startsWith("ValidTill"))
                    date = line.split(": ")[1];

                if (line.startsWith("Discount")) {
                    Matcher m = discountPattern.matcher(line);
                    if (m.find())
                        discount = Integer.parseInt(m.group(1));
                }
            }

            LocalDate validTill = LocalDate.parse(
                    date,
                    DateTimeFormatter.ofPattern("dd-MM-yyyy")
            );

            if (validTill.isAfter(LocalDate.now()) && dealCodes.add(code)) {
                dealMap.put(code, new Deal(code, discount));
            }

            // Sort deals by discount
            dealMap.values().stream()
                    .sorted((a, b) -> b.discount - a.discount)
                    .forEach(d -> System.out.println(d.code + " -> " + d.discount + "%"));

        } catch (Exception e) {
            System.out.println("Error processing deals.");
        }
    }
}
