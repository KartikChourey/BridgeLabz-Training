import java.util.Scanner;

public class ElectionVoteManager {
    public static void main(String[] args) {
		
		// Scanner object 
        Scanner sc = new Scanner(System.in);

        int age, vote;
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

        do {
            System.out.print("Enter age (-1 to exit): ");
            age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.println("You are eligible to vote");
                System.out.print("Vote (1/2/3): ");
                vote = sc.nextInt();

                switch (vote) {
                    case 1: candidate1++; break;
                    case 2: candidate2++; break;
                    case 3: candidate3++; break;
                    default: System.out.println("Invalid vote");
                }
            } else {
                System.out.println("Not eligible to vote");
            }

        } while (true);


// Display output 
        System.out.println("\n--- Voting Result ---");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);

        
    }
}
