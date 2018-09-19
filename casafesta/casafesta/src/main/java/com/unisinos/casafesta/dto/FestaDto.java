package com.unisinos.casafesta.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FestaDto {

    private Long id;

    private String nome;

    private String estilo;

    private LocalDate data;

    private List<Long> idPromocoes = new ArrayList<>();

    private List<Long> idIngressos = new ArrayList<>();

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

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Long> getIdPromocoes() {
        return idPromocoes;
    }

    public void setIdPromocoes(List<Long> idPromocoes) {
        this.idPromocoes = idPromocoes;
    }

    public List<Long> getIdIngressos() {
        return idIngressos;
    }

    public void setIdIngressos(List<Long> idIngressos) {
        this.idIngressos = idIngressos;
    }
}
