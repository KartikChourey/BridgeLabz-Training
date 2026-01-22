package MusicApp;
import java.util.Scanner;


public class MusicApp {

    public static void main(String[] args) {

        MusicTrack app = new MusicTrack();

        app.insert(101, "Tum hi ho", "Arjit");
        app.insert(50, "Viah", "Jass Manak");
        app.insert(200, "xyz", "xyz");

        app.search(50);

        System.out.println("\nPlaylist:");
        app.show();
    }
}
