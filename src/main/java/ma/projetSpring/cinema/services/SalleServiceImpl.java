package ma.projetSpring.cinema.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projetSpring.cinema.entities.Salle;
import ma.projetSpring.cinema.repositories.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@AllArgsConstructor
public class SalleServiceImpl implements GenericService<Salle, Long> {

    @Autowired
    private SalleRepository salleRepository;

    @Override
    public Salle get(Long aLong) {
        return null;
    }

    @Override
    public List<Salle> getAll() {
        return null;
    }

    @Override
    public Salle save(Salle entity) {
        return null;
    }

    @Override
    public Salle update(Long aLong, Salle entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
