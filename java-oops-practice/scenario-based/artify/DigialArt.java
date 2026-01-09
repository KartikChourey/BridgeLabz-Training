package artify;

public class DigialArt extends Artwork {

    public DigialArt(String title, String artist, double price) {
        super(title, artist, price, "Digital License");
    }

    @Override
    public void license() {
        System.out.println("Digital license granted for personal use.");
    }
}
