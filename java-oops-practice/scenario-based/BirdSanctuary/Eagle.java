public class Eagle extends Bird implements Flyable {
    public Eagle(String name, int id) {
        super(name, "Eagle", id);
    }

    public void fly() {
        System.out.println(name + " is flying high.");
    }

    public void display() {
        System.out.println(id + " | " + name + " | Eagle | Flyable");
    }
}