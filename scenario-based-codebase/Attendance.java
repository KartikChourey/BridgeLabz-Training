import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] studentList = {
            "Rohit", "Simran", "Aakash", "Neelam", "Karan",
            "Megha", "Sahil", "Pallavi", "Nitin", "Isha"
        };

        int present = 0;
        int absent = 0;

        // checking attendance one by one
        for (String student : studentList) {
            System.out.print(student + " present? (y/n): ");
            char response = input.next().charAt(0);

            if (response == 'y' || response == 'Y') {
                present++;
            } else {
                absent++;
            }
        }

        System.out.println("\nStudents Present: " + present);
        System.out.println("Students Absent: " + absent);

       
    }
}
