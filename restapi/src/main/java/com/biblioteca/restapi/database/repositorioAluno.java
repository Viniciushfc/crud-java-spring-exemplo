package com.biblioteca.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.restapi.entidades.Aluno;

public interface repositorioAluno extends  JpaRepository<Aluno, Long>{
    
}
