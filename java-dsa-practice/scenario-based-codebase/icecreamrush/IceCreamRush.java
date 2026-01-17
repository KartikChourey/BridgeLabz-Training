package icecreamrush;
import java.util.Scanner;
public class IceCreamRush {

    public static void bubbleSort(IceCream[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].soldCount < arr[j + 1].soldCount) {
                    IceCream temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(IceCream[] arr) {
        for (IceCream ice : arr) {
            System.out.println(ice);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of ice cream flavors: ");
        int n = sc.nextInt();
        sc.nextLine();

        IceCream[] flavors = new IceCream[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nFlavor " + (i + 1));
            System.out.print("Enter flavor name: ");
            String name = sc.nextLine();

            System.out.print("Enter number sold this week: ");
            int sold = sc.nextInt();
            sc.nextLine();

            flavors[i] = new IceCream(name, sold);
        }

        bubbleSort(flavors);

        System.out.println("\nFlavors Sorted by Popularity (High → Low):");
        display(flavors);

        sc.close();
    }
}