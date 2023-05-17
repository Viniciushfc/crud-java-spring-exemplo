package com.biblioteca.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.restapi.entidades.Livro;


public interface repositorioLivro extends JpaRepository<Livro,Long>{

}