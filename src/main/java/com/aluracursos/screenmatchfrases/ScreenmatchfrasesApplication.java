package com.aluracursos.screenmatchfrases;

import com.aluracursos.screenmatchfrases.principal.Principal;
import com.aluracursos.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchfrasesApplication implements CommandLineRunner {

	@Autowired
	private FraseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchfrasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.nuevaFraseDePelicula();
	}
}
