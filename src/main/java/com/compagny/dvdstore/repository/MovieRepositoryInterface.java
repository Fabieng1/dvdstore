package com.compagny.dvdstore.repository;

import com.compagny.dvdstore.entity.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositoryInterface {

    void add(Movie movie);
}
