import java.util.*;

public class BirdSanctuaryMain {
    static ArrayList<Bird> birds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.Display All 3.Flying 4.Swimming 5.Report 6.Delete 7.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addBird();
                case 2 -> birds.forEach(Bird::display);
                case 3 -> birds.stream().filter(b -> b instanceof Flyable).forEach(Bird::display);
                case 4 -> birds.stream().filter(b -> b instanceof Swimmable).forEach(Bird::display);
                case 5 -> report();
                case 6 -> deleteBird();
                case 7 -> System.exit(0);
            }
        }
    }

    static void addBird() {
        System.out.println("1.Eagle 2.Duck 3.Penguin");
        int type = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("ID: ");
        int id = sc.nextInt();

        Bird bird = switch (type) {
            case 1 -> new Eagle(name, id);
            case 2 -> new Duck(name, id);
            default -> new Penguin(name, id);
        };

        birds.add(bird);
    }

    static void deleteBird() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        birds.removeIf(b -> b.getId() == id);
    }

    static void report() {
        long fly = birds.stream().filter(b -> b instanceof Flyable).count();
        long swim = birds.stream().filter(b -> b instanceof Swimmable).count();
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
    }
}