package cinemahouse;
import java.util.Scanner;
class MovieShow {
    String movieName;
    int showTime; // 24-hour format (e.g., 1430 = 2:30 PM)

    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return movieName + " at " + showTime;
    }
}