package geomeasure;
import java.util.*;
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> comparisons = new ArrayList<>();

        System.out.print("Enter number of comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);

            System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
            Line line1 = new Line(sc.nextDouble(), sc.nextDouble(),
                                  sc.nextDouble(), sc.nextDouble());

            System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
            Line line2 = new Line(sc.nextDouble(), sc.nextDouble(),
                                  sc.nextDouble(), sc.nextDouble());

            double len1 = line1.calculateLength();
            double len2 = line2.calculateLength();

            comparisons.add(len1);
            comparisons.add(len2);

            if (len1 == len2)
                System.out.println("Both lines are equal in length.");
            else if (len1 > len2)
                System.out.println("Line 1 is longer.");
            else
                System.out.println("Line 2 is longer.");
        }

        sc.close();
    }
}