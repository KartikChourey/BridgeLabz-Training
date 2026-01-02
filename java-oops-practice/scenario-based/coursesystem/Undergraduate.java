class Undergraduate extends Student implements Graded {

    public Undergraduate(String name) {
        super(name);
    }

    public void assignGrade(int marks) {
        setGpa(marks / 20.0); // simple GPA logic
    }
}