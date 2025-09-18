package com.compagny.dvdstore.repository.memory;

import com.compagny.dvdstore.entity.Movie;
import com.compagny.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    List<Movie> movieList = new ArrayList<>();

    public void add (Movie movie) {

        movieList.add(movie);

        System.out.println("Le film " + movie.getTitle()  + " et son genre " + movie.getGenre() + " ont été ajouté");
    }
}
