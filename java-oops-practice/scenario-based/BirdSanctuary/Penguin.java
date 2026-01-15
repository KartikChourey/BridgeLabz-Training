public class Penguin extends Bird implements Swimmable {
    public Penguin(String name, int id) {
        super(name, "Penguin", id);
    }

    public void swim() {
        System.out.println(name + " swims expertly.");
    }

    public void display() {
        System.out.println(id + " | " + name + " | Penguin | Swim");
    }
}