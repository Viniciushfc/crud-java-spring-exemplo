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

import com.biblioteca.restapi.database.repositorioLivro;
import com.biblioteca.restapi.entidades.Livro;

@RestController
@RequestMapping("/livro")
public class LivroREST {

    @Autowired
    private repositorioLivro repositorio;

    @GetMapping
    public List<Livro> get() {
        return repositorio.findAll();
    }
    @PostMapping
    public void post(@RequestBody Livro livro) {
        repositorio.save(livro);
    }
    @PutMapping
    public void put(@RequestBody Livro livro) {
        if (livro.getId() > 0)
            repositorio.save(livro);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(Livro livro) {
        repositorio.delete(livro);
    }
}
