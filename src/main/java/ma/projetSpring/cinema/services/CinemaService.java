package ma.projetSpring.cinema.services;

import ma.projetSpring.cinema.entities.Cinema;

import java.util.List;

interface CinemaService {
    Cinema getCinema(Long id);
    List<Cinema> getAllCinemas() throws Exception;
    Cinema saveCinema(Cinema cinema);
    void deleteCinema(Long id);

}
