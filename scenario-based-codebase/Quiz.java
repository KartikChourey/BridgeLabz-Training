import java.util.Scanner;

public class Quiz{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "1. Java is a ____ language?",
            "2. Which keyword is used to inherit a class?",
            "3. Which loop runs at least once?",
            "4. JVM stands for?",
            "5. Which data type stores true/false?"
        };

        
        String[][] options = {
            {"A) Low Level", "B) High Level", "C) Machine Level", "D) Assembly"},
            {"A) implements", "B) inherits", "C) extends", "D) super"},
            {"A) for", "B) while", "C) do-while", "D) foreach"},
            {"A) Java Virtual Machine", "B) Java Verified Mode", "C) Java Visual Model", "D) Joint Virtual Memory"},
            {"A) int", "B) float", "C) boolean", "D) char"}
        };

       
        char[] answers = {'B', 'C', 'C', 'A', 'C'};

       
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            // Print options
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Switch for answer checking
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        score++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println(" Wrong! Correct answer is: " + answers[i]);
                    }
                    break;

                default:
                    System.out.println(" Invalid option! No marks awarded.");
            }
        }

        // Final result
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " / 5");

       
    }
}
