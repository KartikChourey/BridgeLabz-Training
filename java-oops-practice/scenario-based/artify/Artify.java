package artify;

public class Artify {

    public static void main(String[] args) {

        User user = new User("Kartik", 5000);
        Artwork art = new DigialArt("Sunset NFT", "Vishal", 1200);

        art.purchase(user);
        art.license();
    }
}
