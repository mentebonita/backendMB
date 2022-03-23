package com.prueba.example.pruebaBack;

import com.prueba.example.pruebaBack.Component.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaBackApplication implements CommandLineRunner {

	public Persona persona;
	public PruebaBackApplication(Persona persona){
		this.persona=persona;
	}
	public static void main(String[] args) {
		SpringApplication.run(PruebaBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		persona.revisar();
	}
}
