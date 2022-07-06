package com.pedromorais.projectspring.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedromorais.projectspring.domain.Produto;
import com.pedromorais.projectspring.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> retornarProdutos(){
		
		List<Produto> list = produtoService.listarProdutos();
		return ResponseEntity.ok().body(list);
	}
	
	
	
	

}
