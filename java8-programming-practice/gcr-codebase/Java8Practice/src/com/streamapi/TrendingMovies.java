package com.streamapi;

import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("Movie A", 8.5, 2024),
                new Movie("Movie B", 9.0, 2023),
                new Movie("Movie C", 7.8, 2025),
                new Movie("Movie D", 8.9, 2024),
                new Movie("Movie E", 9.2, 2025),
                new Movie("Movie F", 8.0, 2022)
        );

        movies.stream()
              .filter(m -> m.year >= 2023)
              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
              .limit(5)
              .forEach(m -> System.out.println(m.name));
    }
}
