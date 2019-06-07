package com.gustavo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.domain.Cliente;

@Repository
public interface CidadeRepository extends JpaRepository<Cliente, Integer>{
	
}