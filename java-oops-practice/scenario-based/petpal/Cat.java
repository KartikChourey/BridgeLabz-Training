package petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        decreaseHunger(15);
        increaseMood(15);
        System.out.println(name + " ate quietly.");
    }

    @Override
    public void play() {
        decreaseEnergy(10);
        increaseMood(10);
        System.out.println(name + " is chasing a toy.");
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
        System.out.println(name + " is napping.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
