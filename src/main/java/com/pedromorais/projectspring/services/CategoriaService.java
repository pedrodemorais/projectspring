package com.pedromorais.projectspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedromorais.projectspring.domain.Categoria;
import com.pedromorais.projectspring.repositories.CategoriaRepository;
import com.pedromorais.projectspring.services.exceptions.ObjetoNaoEncontrado;

@Service
public class CategoriaService {// A classe responsável por fazer a busca no repositório
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	//public Categoria retornarCategoriaPorId(Integer id) {
	//	Optional<Categoria> obj = categoriaRepository.findById(id);
	//	return obj.orElse(null);
		
	//}
	
	public Categoria retornarCategoriaPorId(Integer id) { 
		
		Optional<Categoria> obj = categoriaRepository.findById(id); 
		 
		return obj.orElseThrow(() -> new ObjetoNaoEncontrado(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null)); 
		} 
	
	
	
	
	public List<Categoria> retornarTodaCategoria() {
		return categoriaRepository.findAll();
	}
	
	
	
	

}
