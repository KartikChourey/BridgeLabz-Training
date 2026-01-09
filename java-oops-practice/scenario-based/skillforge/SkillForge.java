package skillforge;

public class SkillForge {

    public static void main(String[] args) {

        // Instructor creation
        Instructor instructor =
                new Instructor("Vishal Bhakare", "vishal@skillforge.com");

        // Course with custom modules
        String[] modules = {
                "Introduction",
                "Core Concepts",
                "Hands-on Practice",
                "Mini Project",
                "Final Project",
                "Interview Prep"
        };

        Course course = new Course(
                "Java Backend Development",
                instructor,
                modules
        );

        // Student creation
        Student student =
                new Student("Kartik Chourey", "kartik@skillforge.com");

        // Student progress update
        student.updateProgress(6, modules.length);

        System.out.println("Student Progress: " + student.getProgress() + "%");

        // Certificate generation (polymorphism based on course level)
        course.generateCertificate();
    }
}
