public class UniversitySystem {
    public static void main(String[] args) {

        Student s1 = new Undergraduate("Aman");
        Student s2 = new Postgraduate("Neha");

        ((Graded) s1).assignGrade(80);
        ((Graded) s2).assignGrade(90);

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}