package ma.projetSpring.cinema.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.projetSpring.cinema.entities.Cinema;
import ma.projetSpring.cinema.repositories.CinemaRepository;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CinemaServiceImpl implements CinemaService {


    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public Cinema getCinema(Long id) {
        return cinemaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pas de Cinemas sauvegardés"));
    }


    @Override
    public List<Cinema> getAllCinemas(){
        if(cinemaRepository.findAll()!=null){
            return cinemaRepository.findAll();
        }
        throw new RuntimeException("Pas de Cinemas sauvegardes");
    }

    @Override
    public Cinema saveCinema(Cinema cinema) {
        if(cinemaRepository.findByName(cinema.getName()).equals(null)){
            return cinemaRepository.save(cinema);
        }
        throw new RuntimeException("cinema existe deja");
    }

    @Override
    public void deleteCinema(Long id) {
        if(cinemaRepository.findById(id).equals(null))
            throw new RuntimeException("Aucune Cinema correspondante");
        cinemaRepository.deleteById(id);
    }
}
