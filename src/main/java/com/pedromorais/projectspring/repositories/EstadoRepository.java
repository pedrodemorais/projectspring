package com.pedromorais.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedromorais.projectspring.domain.Estado;

@Repository
public interface  EstadoRepository extends JpaRepository<Estado, Integer>{

}
