package com.apicursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicursos.entities.Curso;


public interface CursoRepository extends JpaRepository<Curso, Long>{
	
}
	