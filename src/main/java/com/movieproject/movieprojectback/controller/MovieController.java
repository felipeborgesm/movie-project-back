package com.movieproject.movieprojectback.controller;

import com.movieproject.movieprojectback.dto.MovieRequest;
import com.movieproject.movieprojectback.model.Movie;
import com.movieproject.movieprojectback.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public Movie createMovie(@RequestBody MovieRequest movieRequest) {
        return movieService.createMovie(movieRequest);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}
