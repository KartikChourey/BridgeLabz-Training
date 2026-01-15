package examcell;

class Student {
    int rollNo;
    int score;

    public Student(int rollNo, int score) {
        this.rollNo = rollNo;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Score: " + score;
    }
}