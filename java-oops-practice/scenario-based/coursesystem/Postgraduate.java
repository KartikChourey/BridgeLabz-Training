class Postgraduate extends Student implements Graded {

    public Postgraduate(String name) {
        super(name);
    }

    public void assignGrade(int marks) {
        setGpa(marks / 25.0);
    }
}