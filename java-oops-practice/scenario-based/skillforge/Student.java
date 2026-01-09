package skillforge;

public class Student extends User {

    private int progress; // percentage

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules; // operator usage
    }

    public int getProgress() {
        return progress;
    }
}
