package com.biblioteca.restapi.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nomeCompletoAluno;
    @Column(nullable = false)
    private String idadeAluno;
    @Column(nullable = false)
    private String cpfAluno;
    @Column(nullable = false)

    private String localizacaoAluno;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeCompletoAluno() {
        return nomeCompletoAluno;
    }
    public void setNomeCompletoAluno(String nomeCompletoAluno) {
        this.nomeCompletoAluno = nomeCompletoAluno;
    }
    public String getIdadeAluno() {
        return idadeAluno;
    }
    public void setIdadeAluno(String idadeAluno) {
        this.idadeAluno = idadeAluno;
    }
    public String getCpfAluno() {
        return cpfAluno;
    }
    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }
    public String getLocalizacaoAluno() {
        return localizacaoAluno;
    }
    public void setLocalizacaoAluno(String localizacaoAluno) {
        this.localizacaoAluno = localizacaoAluno;
    }

    

}
