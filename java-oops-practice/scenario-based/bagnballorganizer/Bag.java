package bagnballorganizer;
import java.util.*;
class Bag implements Storable {
    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls = new ArrayList<>();

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    // Add ball
    public void addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            System.out.println("Ball added successfully.");
        } else {
            System.out.println("Bag is full! Cannot add ball.");
        }
    }

    // Remove ball
    public void removeBall(String ballId) {
        balls.removeIf(ball -> ball.getId().equals(ballId));
        System.out.println("Ball removed if it existed.");
    }

    // Display balls
    public void displayBalls() {
        if (balls.isEmpty())
            System.out.println("No balls in this bag.");
        else
            balls.forEach(System.out::println);
    }

    // Ball count
    public int getBallCount() {
        return balls.size();
    }
}