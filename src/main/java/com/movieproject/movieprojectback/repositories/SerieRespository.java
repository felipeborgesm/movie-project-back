package com.movieproject.movieprojectback.repositories;

import com.movieproject.movieprojectback.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRespository extends JpaRepository<Serie, Long> {
}
