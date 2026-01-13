package gamebox;

class ArcadeGame extends Game {

    public ArcadeGame(String title, double price) {
        super(title, price);
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    public void playDemo() {
        System.out.println("Fast-paced arcade demo playing");
    }
}