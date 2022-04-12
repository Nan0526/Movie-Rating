package com.antra.movie_rating_new.service;

import com.antra.movie_rating_new.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepo movieRepo;

    @Override
    public String getMovies() {
        return movieRepo.getMovies();
    }
}
