package com.compagny.dvdstore.service;

import com.compagny.dvdstore.entity.Movie;
import com.compagny.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){

        movieRepository.add(movie);
    }
}
/*
*  public static long lastNumber = 0L;

    private InvoiceRepository invoiceRepository = new InvoiceRepository();

    public void createInvoice(Invoice invoice) {

        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);

    }
* */