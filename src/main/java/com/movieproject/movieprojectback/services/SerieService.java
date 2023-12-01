package com.movieproject.movieprojectback.services;

import com.movieproject.movieprojectback.dto.SerieRequest;
import com.movieproject.movieprojectback.model.Serie;
import com.movieproject.movieprojectback.repositories.SerieRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRespository serieRespository;

    public List<Serie> getAllSeries() { return serieRespository.findAll(); }

    public Serie createSerie(SerieRequest serieRequest) {
        Serie serie = new Serie(serieRequest);
        serie.setAddDate(LocalDateTime.now());
        serie.setWhatched(false);
        return serieRespository.save(serie);
    }
}
