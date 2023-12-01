package com.movieproject.movieprojectback.model;

import com.movieproject.movieprojectback.dto.MovieRequest;
import com.movieproject.movieprojectback.model.enums.Genre;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@With
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
@Entity(name = "movie")
@EqualsAndHashCode(of="id")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "whoChose", nullable = false)
    private String whoChose;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre", nullable = false)
    private Genre genre;

    @Column(name = "watched")
    private boolean whatched;

    @Column(name = "addDate")
    private LocalDateTime addDate;

    public Movie (MovieRequest movieRequest) {
        this.name = movieRequest.name();
        this.description = movieRequest.description();
        this.whoChose = movieRequest.whoChose();
        this.genre = Genre.AVENTURA;
    }
}
