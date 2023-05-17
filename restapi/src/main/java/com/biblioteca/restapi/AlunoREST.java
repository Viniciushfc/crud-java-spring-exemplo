package com.biblioteca.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.restapi.database.repositorioAluno;

import com.biblioteca.restapi.entidades.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoREST {

    @Autowired
    private repositorioAluno repositorio;

    @GetMapping
    public List<Aluno> getAluno() {
        return repositorio.findAll();
    }

    @PostMapping
    public void postAluno(@RequestBody Aluno aluno) {
        repositorio.save(aluno);
    }

    @PutMapping
    public void putAluno(@RequestBody Aluno aluno) {
        if (aluno.getId() > 0) {
            repositorio.save(aluno);
        }
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAluno(@RequestBody Aluno aluno){
        repositorio.delete(aluno);
    }
}
