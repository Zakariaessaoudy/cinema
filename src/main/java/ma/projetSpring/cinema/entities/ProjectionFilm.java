package ma.projetSpring.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 8)
@DiscriminatorValue("PROJFILM")
@Data @AllArgsConstructor @NoArgsConstructor
public class ProjectionFilm {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateProjection;
    private double prix;
    @OneToMany(mappedBy = "projectionFilm")
    private Collection<Ticket> tickets;
    @ManyToOne
    private Film film;
    @ManyToOne
    private Salle salle;
}
