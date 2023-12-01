package com.movieproject.movieprojectback.services;

import com.movieproject.movieprojectback.dto.MovieRequest;
import com.movieproject.movieprojectback.model.Movie;
import com.movieproject.movieprojectback.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie createMovie(MovieRequest movieRequest) {
        Movie movie = new Movie(movieRequest);
        movie.setAddDate(LocalDateTime.now());
        movie.setWhatched(false);
        return movieRepository.save(movie);
    }
}
