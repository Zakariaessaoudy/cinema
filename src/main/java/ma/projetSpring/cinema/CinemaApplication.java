package ma.projetSpring.cinema;

import ma.projetSpring.cinema.entities.Cinema;
import ma.projetSpring.cinema.entities.Ville;
import ma.projetSpring.cinema.repositories.CategoryRepository;
import ma.projetSpring.cinema.repositories.CinemaRepository;
import ma.projetSpring.cinema.repositories.FilmRepository;
import ma.projetSpring.cinema.repositories.VilleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CinemaRepository cinemaRepository,
							FilmRepository filmRepository,
							CategoryRepository categoryRepository,
							VilleRepository villeRepository){
		return args -> {
			Cinema cinema1 = new Cinema();
			cinema1.setId(null);
			cinema1.setLatitude(1200);
			cinema1.setLongitude(3000);
			cinema1.setAltitude(2000);
			cinema1.setName("Yaaqoub Mansour");
			cinema1.setNombreSalles(9);
			//cinemaRepository.save(cinema1);

			Cinema cinema2 = new Cinema();
			cinema2.setId(null);
			cinema2.setLatitude(1100);
			cinema2.setLongitude(400);
			cinema2.setAltitude(1000);
			cinema2.setName("Ain Diab");
			cinema2.setNombreSalles(10);
			//cinemaRepository.save(cinema2);

			Cinema cinema3 = new Cinema();
			cinema3.setId(null);
			cinema3.setLatitude(2000);
			cinema3.setLongitude(5000);
			cinema3.setAltitude(2200);
			cinema3.setName("Mohammed V");
			cinema3.setNombreSalles(12);
			//cinemaRepository.save(cinema3);

			Cinema cinema4 = new Cinema();
			cinema4.setId(null);
			cinema4.setLatitude(100);
			cinema4.setLongitude(500);
			cinema4.setAltitude(1100);
			cinema4.setName("Essouissi");
			cinema4.setNombreSalles(10);
			//cinemaRepository.save(cinema4);
			cinemaRepository.saveAll(List.of(cinema1,cinema4,cinema2,cinema3));

			/*
			Ville casa = new Ville();
			Ville rabat = new Ville();

			casa.setName("CasaBlanca");
			casa.setId(null);

			rabat.setName("Rabat");
			*/

		};
	}
}
