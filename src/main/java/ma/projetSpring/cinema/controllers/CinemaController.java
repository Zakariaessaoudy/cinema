package ma.projetSpring.cinema.controllers;


import ma.projetSpring.cinema.entities.Cinema;
import ma.projetSpring.cinema.services.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cinemas")
public class CinemaController {
    @Autowired
    private CinemaServiceImpl cinemaService;

    @GetMapping
    public List<Cinema> getAllFilms() {
        return cinemaService.getAllCinemas();
    }

    @PostMapping
    public Cinema addCinema(@RequestBody Cinema cinema) {
        return cinemaService.saveCinema(cinema);
    }
}