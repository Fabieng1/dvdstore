package com.compagny.dvdstore.controller;

import com.compagny.dvdstore.entity.Movie;
import com.compagny.dvdstore.service.DefaultMovieService;
import com.compagny.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public MovieController (MovieServiceInterface movie) {
        this.movieService = movie;
    }

    public void createMovie(){

        String customerName="Taxi";
        Movie movie=new Movie();
        movie.setTitle(customerName);
        movie.setGenre(customerName);

        movieService.registerMovie(movie);
    }

    public void addUsingConsole(){
        System.out.println( "Quel est le nom du film" );
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();

        System.out.println( "Quel est le genre du film ?" );
        String genre=scanner.nextLine();
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

        movieService.registerMovie(movie);
    }
}
