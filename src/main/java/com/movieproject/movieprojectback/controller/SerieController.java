package com.movieproject.movieprojectback.controller;

import com.movieproject.movieprojectback.dto.SerieRequest;
import com.movieproject.movieprojectback.model.Serie;
import com.movieproject.movieprojectback.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @PostMapping
    public Serie createSerie(@RequestBody SerieRequest serieRequest) { return serieService.createSerie(serieRequest); }

    @GetMapping
    public List<Serie> getAllSeries() { return serieService.getAllSeries(); }

}
