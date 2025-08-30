package ma.projetSpring.cinema.repositories;

import ma.projetSpring.cinema.entities.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectionRepository extends JpaRepository<ProjectionFilm,Long> {
}
