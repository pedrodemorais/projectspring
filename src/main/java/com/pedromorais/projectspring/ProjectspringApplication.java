package com.pedromorais.projectspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedromorais.projectspring.domain.Categoria;
import com.pedromorais.projectspring.domain.Produto;
import com.pedromorais.projectspring.repositories.CategoriaRepository;
import com.pedromorais.projectspring.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjectspringApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectspringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica"); 
		Categoria cat2 = new Categoria(null, "Escritorio"); 
		Categoria cat3 = new Categoria(null, "Software"); 
		
		
		Produto prod1 = new Produto(null, "Computador", 2000.00);
		Produto prod2 = new Produto(null, "Impressora", 800.00);
		Produto prod3 = new Produto(null, "Mouse", 80.00);
		
		
		cat1.getProdutos().addAll(Arrays.asList(prod1,prod2,prod3));
		cat2.getProdutos().addAll(Arrays.asList(prod2));
		
		prod1.getCategorias().addAll(Arrays.asList(cat1));
		prod2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		prod3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepository.saveAll(Arrays.asList(prod1,prod2,prod3));
		
		
		
		
	}

}
