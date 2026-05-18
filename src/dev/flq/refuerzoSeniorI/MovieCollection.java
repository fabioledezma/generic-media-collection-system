package dev.flq.refuerzoSeniorI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MovieCollection {

    private String name;
    private List<Movie> movies = new ArrayList<>();

    public MovieCollection(String name) {
        this.name = name;
    }

    public void addMovie(Movie movie) {

        if (Objects.isNull(movie)) {
            System.out.println("Null Object");
            return;
        }

        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }

    public boolean removeMovie(Movie movie) {
        return movies.remove(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void printMovies() {
        System.out.println(getMovies());
    }
}
