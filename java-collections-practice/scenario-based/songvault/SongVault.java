package songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;


public class SongVault {

    public static void main(String[] args) {

        List<Song> songs = new ArrayList<>();
        Map<String, List<Song>> genreMap = new HashMap<>();
        Set<String> uniqueArtists = new HashSet<>();

      
        Pattern titleP = Pattern.compile("Title: (.*)");
        Pattern artistP = Pattern.compile("Artist: (.*)");
        Pattern genreP = Pattern.compile("Genre: (.*)");
        Pattern durationP = Pattern.compile("Duration: (.*)");

        try (BufferedReader br = new BufferedReader(new FileReader("song.txt"))) {

            String line;
            String title = "", artist = "", genre = "", duration = "";

            while ((line = br.readLine()) != null) {

                if (titleP.matcher(line).matches())
                    title = line.split(": ")[1];

                if (artistP.matcher(line).matches())
                    artist = line.split(": ")[1];

                if (genreP.matcher(line).matches())
                    genre = line.split(": ")[1];

                if (durationP.matcher(line).matches()) {
                    duration = line.split(": ")[1];

                    Song song = new Song(title, artist, genre, duration);
                    songs.add(song);

                    uniqueArtists.add(artist);

                    genreMap
                            .computeIfAbsent(genre, k -> new ArrayList<>())
                            .add(song);
                }
            }

         
            songs.stream()
                    .sorted(Comparator.comparing(s -> s.title))
                    .forEach(s -> System.out.println(s.title));

        } catch (IOException e) {
            System.out.println("Error reading song files.");
        }
    }
}
