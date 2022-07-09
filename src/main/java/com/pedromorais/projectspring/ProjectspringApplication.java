package com.pedromorais.projectspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedromorais.projectspring.domain.Categoria;
import com.pedromorais.projectspring.domain.Cidade;
import com.pedromorais.projectspring.domain.Estado;
import com.pedromorais.projectspring.domain.Produto;
import com.pedromorais.projectspring.repositories.CategoriaRepository;
import com.pedromorais.projectspring.repositories.CidadeRepository;
import com.pedromorais.projectspring.repositories.EstadoRepository;
import com.pedromorais.projectspring.repositories.ProdutoRepository;

@SpringBootApplication
public class ProjectspringApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;

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
		
		Estado estado1 = new Estado(null, "Goiás"); 
		Estado estado2 = new Estado(null, "Minas Gerais"); 
		Estado estado3 = new Estado(null, "Bahia"); 
		
		Cidade cid1 = new Cidade(null, "Anápolis", estado1);
		Cidade cid2 = new Cidade(null, "Goiânia", estado1);
		Cidade cid3 = new Cidade(null, "Porto Seguro", estado3);
		Cidade cid4 = new Cidade(null, "Uberaba", estado2);
		Cidade cid5 = new Cidade(null, "Uberlândia", estado2);
		
		estado1.getCidades().addAll(Arrays.asList(cid1,cid2));
		estado2.getCidades().addAll(Arrays.asList(cid4,cid5));
		estado3.getCidades().add(cid3);
		
		
		
		estadoRepository.saveAll(Arrays.asList(estado1, estado2, estado3));
		cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3,cid4,cid5));
		
	}

}
