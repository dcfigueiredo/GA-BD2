package com.unisinos.casafesta.entity;

import javax.persistence.*;

@Entity
public class Ingresso {

    @Id
    @GeneratedValue
    private Long id;

    private String categoria;

    private Double preco;

    @ManyToOne(cascade = CascadeType.ALL)
    private Festa festa;

    @ManyToOne(cascade = CascadeType.ALL)
    private Integrante integrante;

    public Ingresso() {
    }

    public Ingresso(String categoria, Double preco) {
        this.categoria = categoria;
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setFesta(Festa festa) {
        this.festa = festa;
    }

    public void setIntegrante(Integrante integrante) {
        this.integrante = integrante;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public Festa getFesta() {
        return festa;
    }

    public Integrante getIntegrante() {
        return integrante;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "; Categoria: " + categoria + "; Preço: " + preco;
    }
}
