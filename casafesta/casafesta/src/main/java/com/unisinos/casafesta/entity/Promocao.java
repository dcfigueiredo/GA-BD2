package com.unisinos.casafesta.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Promocao {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Porcentagem_desconto")
    private int desconto;

    @Column(name = "Data_inicio_Vigencia")
    private LocalDate inicioVigencia;

    @Column(name = "Data_final_Vigencia")
    private LocalDate finalVigencia;

    @ManyToMany(mappedBy = "promocoes", cascade = CascadeType.ALL)
    private List<Festa> festas = new ArrayList<>();

    public Promocao() {
    }

    public Promocao(int desconto, LocalDate inicioVigencia, LocalDate finalVigencia) {
        this.desconto = desconto;
        this.inicioVigencia = inicioVigencia;
        this.finalVigencia = finalVigencia;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public void setInicioVigencia(LocalDate inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public void setFinalVigencia(LocalDate finalVigencia) {
        this.finalVigencia = finalVigencia;
    }

    public void setFestas(List<Festa> festas) {
        this.festas = festas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDesconto() {
        return desconto;
    }

    public LocalDate getFinalVigencia() {
        return finalVigencia;
    }

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public List<Festa> getFestas() {
        return festas;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "; Desconto: " + desconto + "%; Inicio vigência: " + inicioVigencia + "; Final vigência: " + finalVigencia;
    }
}
