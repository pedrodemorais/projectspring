package com.pedromorais.projectspring.resource.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pedromorais.projectspring.services.exceptions.ObjetoNaoEncontrado;

@ControllerAdvice
public class ManipuladorExcecoesRecurso {
	
	@ExceptionHandler(ObjetoNaoEncontrado.class)
	public ResponseEntity<ErroPadrao> objetoNaoEncontrado( ObjetoNaoEncontrado objetoNaoEncontrado,HttpServletRequest request ){//assinatura padrão
		
		ErroPadrao erroPadrao = new ErroPadrao(HttpStatus.NOT_FOUND.value(), objetoNaoEncontrado.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroPadrao);
		
	}
	
	

}
