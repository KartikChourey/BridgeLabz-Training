public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String name, int id) {
        super(name, "Duck", id);
    }

    public void fly() {
        System.out.println(name + " flies short distances.");
    }

    public void swim() {
        System.out.println(name + " swims in water.");
    }

    public void display() {
        System.out.println(id + " | " + name + " | Duck | Fly & Swim");
    }
}