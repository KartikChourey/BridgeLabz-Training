package petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        decreaseHunger(10);
        increaseMood(10);
        System.out.println(name + " pecked some seeds.");
    }

    @Override
    public void play() {
        decreaseEnergy(20);
        increaseMood(15);
        System.out.println(name + " is flying around.");
    }

    @Override
    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " is resting in its nest.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}
