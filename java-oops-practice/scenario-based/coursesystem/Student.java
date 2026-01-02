
interface Graded {
    void assignGrade(int marks);
}

// ---------------------- Student ----------------------
abstract class Student {
    private String name;
    private double gpa;

    public Student(String name) {
        this.name = name;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getTranscript() {
        return name + " | GPA: " + gpa;
    }
}
