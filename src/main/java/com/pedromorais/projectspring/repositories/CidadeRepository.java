package com.pedromorais.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromorais.projectspring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
