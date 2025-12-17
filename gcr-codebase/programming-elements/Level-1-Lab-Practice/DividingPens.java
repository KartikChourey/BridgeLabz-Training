public class DividingPens {
    public static void main(String[] args) {

        // Total number of pens
        int pens = 14;

        // Total number of students
        int students = 3;

        // Calculating pens per student using division operator
        int pensPerStudent = pens / students;

        // Calculating remaining pens using modulus operator
        int remainingPens = pens % students;

        // Displaying the result
        System.out.println(
            "The Pen Per Student is " + pensPerStudent +
            " and the remaining pen not distributed is " + remainingPens
        );
    }
}
