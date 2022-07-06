package com.pedromorais.projectspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedromorais.projectspring.domain.Categoria;
import com.pedromorais.projectspring.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjectspringApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica"); 
		Categoria cat2 = new Categoria(null, "Escritorio"); 
		Categoria cat3 = new Categoria(null, "Software"); 
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		
		
		
	}

}
