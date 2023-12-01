package com.movieproject.movieprojectback.dto;

import com.movieproject.movieprojectback.model.enums.Genre;

public record MovieRequest(String name, String description, String whoChose) {
}
