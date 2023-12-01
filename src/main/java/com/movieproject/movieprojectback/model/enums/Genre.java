package com.movieproject.movieprojectback.model.enums;

public enum Genre {
    ACAO("Ação"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    AVENTURA("Aventura"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    FANTASIA("Fantasia"),
    THRILLER_SUSPENSE("Thriller/Suspense"),
    HORROR("Horror"),
    ANIMACAO("Animação"),
    ROMANCE("Romance");

    private final String titulo;

    Genre(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
