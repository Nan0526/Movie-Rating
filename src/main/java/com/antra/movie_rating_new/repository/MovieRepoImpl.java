package com.antra.movie_rating_new.repository;

import com.antra.movie_rating_new.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MovieRepoImpl implements MovieRepo {
    @Autowired
    EntityManager em;
    @Override
    @Transactional
    public String getMovies() {
        List<Movie> movieList = em.createQuery("select m from Movie m", Movie.class).getResultList();
        Movie m = em.find(Movie.class, 10l);
        Movie n = em.find(Movie.class, 102);
        m.setName("Dawei");
        n.setName("Yoyo");
        return movieList.stream().map(Movie::getName).collect(Collectors.joining(","));
    }
}
