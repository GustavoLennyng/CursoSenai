package com.gustavo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{


	
}

