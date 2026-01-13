package examproctor;

import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    public ExamProctor() {
       
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public void visitQuestion(int qId) {
        navigationStack.push(qId);
    }

    public void submitAnswer(int qId, String ans) {
        answers.put(qId, ans);
    }

 
    public int calculateScore() {
        int score = 0;
        for (int qId : answers.keySet()) {
            if (answers.get(qId)
                    .equalsIgnoreCase(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamProctor exam = new ExamProctor();

        System.out.print("Enter number of questions attempted: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter question ID: ");
            int qId = sc.nextInt();

            System.out.print("Enter answer: ");
            String ans = sc.next();

            exam.visitQuestion(qId);
            exam.submitAnswer(qId, ans);
        }

        System.out.println("Final Score = " + exam.calculateScore());
    }
}
