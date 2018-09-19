package com.unisinos.casafesta.dto;

import java.time.LocalDate;
import java.util.List;

public class IntegranteDto {

    private Long id;

    private String nome;

    private String telefone;

    private List<Long> idIngressos;

    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Long> getIdIngressos() {
        return idIngressos;
    }

    public void setIdIngressos(List<Long> idIngressos) {
        this.idIngressos = idIngressos;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
