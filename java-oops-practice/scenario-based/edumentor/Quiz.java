package edumentor;

//Quiz class handles questions and scoring
public class Quiz {

 private String[] questions;      // internal question bank (private)
 private String[] answers;        
 private int score;
 private String difficulty;

 // Constructor with variable difficulty
 public Quiz(String difficulty, String[] questions, String[] answers) {
     this.difficulty = difficulty;
     this.questions = questions;
     this.answers = answers;
 }

 // Score calculation using operators
 public void evaluate(String[] userAnswers) {

     for (int i = 0; i < answers.length; i++) {
         if (answers[i].equalsIgnoreCase(userAnswers[i])) {
             score++; 
         }
     }
 }

 public double getPercentage() {
     return (score * 100.0) / answers.length;
 }
}
