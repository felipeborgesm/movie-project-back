package com.movieproject.movieprojectback.model;

import com.movieproject.movieprojectback.dto.SerieRequest;
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
@Table(name = "serie")
@Entity(name = "serie")
@EqualsAndHashCode(of="id")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "seasons", nullable = false)
    private Integer seasons;

    @Column(name = "who_chose", nullable = false)
    private String whoChose;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre", nullable = false)
    private Genre genre;

    @Column(name = "watched")
    private boolean whatched;

    @Column(name = "add_date")
    private LocalDateTime addDate;

    public Serie (SerieRequest serieRequest) {
        this.name = serieRequest.name();
        this.seasons = serieRequest.seasons();
        this.whoChose = serieRequest.whoChose();
        this.genre = Genre.ANIME;
    }
}
