package com.unisinos.casafesta.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Festa {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String estilo;

    private LocalDate data;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Promocao> promocoes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "festa")
    private List<Ingresso> ingressos = new ArrayList<>();

    public Festa() {
    }

    public Festa(String nome, String estilo, LocalDate data) {
        this.nome = nome;
        this.estilo = estilo;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public List<Promocao> getPromocoes() {
        return promocoes;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public Long getId() {
        return id;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPromocoes(List<Promocao> promocoes) {
        this.promocoes = promocoes;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "; Nome: " + nome + "; Estilo: " + estilo + "; Data: " + data;
    }
}
