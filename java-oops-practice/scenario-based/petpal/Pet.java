package petpal;

import java.util.Random;

//Base Pet class
public abstract class Pet implements Interactable {

 protected String name;
 protected String type;
 protected int age;

 // Encapsulated internal states
 private int hunger; // 0 = full, 100 = very hungry
 private int mood;   // 0 = sad, 100 = happy
 protected int energy;

 // Constructor with random default values
 public Pet(String name, String type, int age) {
     this.name = name;
     this.type = type;
     this.age = age;

     Random rand = new Random();
     this.hunger = rand.nextInt(50);
     this.mood = rand.nextInt(50) + 50;
     this.energy = rand.nextInt(50) + 50;
 }

 // Only controlled access to internal state
 protected void increaseMood(int value) {
     mood = Math.min(100, mood + value);
 }

 protected void decreaseHunger(int value) {
     hunger = Math.max(0, hunger - value);
 }

 protected void decreaseEnergy(int value) {
     energy = Math.max(0, energy - value);
 }

 protected void increaseEnergy(int value) {
     energy = Math.min(100, energy + value);
 }

 public void showStatus() {
     System.out.println(name + " | Hunger: " + hunger + " | Mood: " + mood + " | Energy: " + energy);
 }


 public abstract void makeSound();
}
