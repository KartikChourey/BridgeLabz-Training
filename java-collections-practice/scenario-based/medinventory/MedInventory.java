package medinventory;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;


public class MedInventory {

    public static void main(String[] args) {

     
        Set<Item> uniqueItems = new HashSet<>();

        
        Map<String, List<Item>> categoryMap = new HashMap<>();

      
        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

        try (BufferedReader br = new BufferedReader(new FileReader("inventory.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Item item = new Item(
                        data[0],
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3]
                );

               
                Matcher matcher = datePattern.matcher(item.expiryDate);
                if (!matcher.matches()) continue;

                // Convert string date to LocalDate
                LocalDate expiry = LocalDate.parse(
                        item.expiryDate,
                        DateTimeFormatter.ofPattern("dd-MM-yyyy")
                );

               
                if (expiry.isBefore(LocalDate.now())) continue;

               
                if (item.quantity < 10) {
                    throw new LowStockException("Critical stock low for: " + item.name);
                }

               
                uniqueItems.add(item);

            
                categoryMap
                        .computeIfAbsent(item.name, k -> new ArrayList<>())
                        .add(item);
            }

            System.out.println("Inventory processed successfully.");

        } catch (LowStockException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error reading inventory file.");
        }
    }
}
