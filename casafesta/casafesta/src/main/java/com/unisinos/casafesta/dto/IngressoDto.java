package com.unisinos.casafesta.dto;

public class IngressoDto {

    private Long id;

    private String categoria;

    private Double preco;

    private Long idFesta;

    private Long idIntegrante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getIdFesta() {
        return idFesta;
    }

    public void setIdFesta(Long idFesta) {
        this.idFesta = idFesta;
    }

    public Long getIdIntegrante() {
        return idIntegrante;
    }

    public void setIdIntegrante(Long idIntegrante) {
        this.idIntegrante = idIntegrante;
    }
}
