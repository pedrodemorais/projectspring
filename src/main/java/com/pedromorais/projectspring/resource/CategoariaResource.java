package com.pedromorais.projectspring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedromorais.projectspring.domain.Categoria;
import com.pedromorais.projectspring.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoariaResource {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listar(@PathVariable Integer id) { // @PathVariable informando para o metodo que esse id
																// virá pela váriavel
		// ResponseEntity<?> tipo especial do Spring que armazena e encapsula varias
		// informações de uma resposta http para um serviço REST

		Categoria categoria = categoriaService.retornarCategoriaPorId(id);

		return ResponseEntity.ok().body(categoria);

	}

}
