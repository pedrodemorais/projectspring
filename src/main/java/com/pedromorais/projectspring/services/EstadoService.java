package com.pedromorais.projectspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedromorais.projectspring.domain.Estado;
import com.pedromorais.projectspring.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listarTodosEstados(){
		return estadoRepository.findAll();
		
			
	}

}
