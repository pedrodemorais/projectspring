package com.pedromorais.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedromorais.projectspring.domain.Produto;

@Repository
public interface  ProdutoRepository extends JpaRepository<Produto, Integer> {

}
