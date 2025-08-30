package ma.projetSpring.cinema.entities;

import jakarta.persistence.*;

import java.util.Date;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("SEANCE")
public class Seance extends ProjectionFilm{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date heureDebut;
}
