package com.pedromorais.projectspring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedromorais.projectspring.domain.Estado;
import com.pedromorais.projectspring.services.EstadoService;

@RestController
@RequestMapping(value="/estados")
public class EstadoResource {
	@Autowired
	EstadoService estadoService;
	
	@GetMapping
	public ResponseEntity<?> retornarEstados(){
		List<Estado> list = estadoService.listarTodosEstados();
		
		return ResponseEntity.ok().body(list);
		
	}

}
