package com.pedromorais.projectspring.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedromorais.projectspring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoariaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria categoria = new Categoria(1,"Informatica");
		Categoria categoria2 = new Categoria(2,"Escritorio");
		
		List<Categoria> listaCategoria = new ArrayList<>();
		listaCategoria.add(categoria);
		listaCategoria.add(categoria2);
		
		return listaCategoria;
		
	}

}
