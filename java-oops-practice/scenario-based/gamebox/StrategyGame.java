package gamebox;

class StrategyGame extends Game {

    public StrategyGame(String title, double price) {
        super(title, price);
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    public void playDemo() {
        System.out.println("Turn-based strategy demo playing");
    }
}
