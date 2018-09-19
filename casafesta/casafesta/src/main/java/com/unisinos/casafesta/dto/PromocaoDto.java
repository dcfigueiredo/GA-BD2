package com.unisinos.casafesta.dto;

import java.time.LocalDate;
import java.util.List;

public class PromocaoDto {

    private Long id;

    private int desconto;

    private LocalDate inicioVigencia;

    private LocalDate finalVigencia;

    private List<Long> idFestas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(LocalDate inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public LocalDate getFinalVigencia() {
        return finalVigencia;
    }

    public void setFinalVigencia(LocalDate finalVigencia) {
        this.finalVigencia = finalVigencia;
    }

    public List<Long> getIdFestas() {
        return idFestas;
    }

    public void setIdFestas(List<Long> idFestas) {
        this.idFestas = idFestas;
    }
}
