package gamebox;

abstract class Game implements IDownloadable {

    protected String title;
    protected double price;
    protected double rating;

    public Game(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Seasonal offer using operator
    public double applyDiscount(double percent) {
        return price - (price * percent / 100);
    }
}
