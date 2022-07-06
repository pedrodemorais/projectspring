package com.pedromorais.projectspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedromorais.projectspring.domain.Produto;
import com.pedromorais.projectspring.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto> listarProdutos(){
		
		List <Produto> list = produtoRepository.findAll();
		return list;
	}

}
