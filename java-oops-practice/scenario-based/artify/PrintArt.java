package artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print License");
    }

    @Override
    public void license() {
        System.out.println("Print license granted (limited copies).");
    }
}
