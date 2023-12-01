package com.movieproject.movieprojectback.repositories;

import com.movieproject.movieprojectback.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
