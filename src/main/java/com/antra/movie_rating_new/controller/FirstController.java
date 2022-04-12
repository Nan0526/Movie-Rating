package com.antra.movie_rating_new.controller;

import com.antra.movie_rating_new.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class FirstController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public String getMovies() {
        return movieService.getMovies();
    }

}
