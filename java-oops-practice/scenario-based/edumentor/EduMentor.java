package edumentor;
public class EduMentor {

    public static void main(String[] args) {

        Learner l1 = new Learner("Kartik", "kartik@mail.com", 101, "short");

        String[] questions = {"Java is OOP?", "Java supports multiple inheritance?"};
        String[] answers = {"yes", "no"};

        Quiz quiz = new Quiz("Easy", questions, answers);

        String[] userAnswers = {"yes", "no"};
        quiz.evaluate(userAnswers);

        System.out.println("Quiz Percentage: " + quiz.getPercentage());

        l1.generateCertificate();
    }
}
