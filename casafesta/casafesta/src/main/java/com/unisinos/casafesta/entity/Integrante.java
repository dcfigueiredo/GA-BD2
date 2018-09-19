package com.unisinos.casafesta.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Integrante {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String telefone;

    @OneToMany(mappedBy = "integrante", cascade = CascadeType.ALL)
    private List<Ingresso> ingressos;

    @Column(name = "Data_nascimento")
    private LocalDate dataNascimento;

    public Integrante() {
    }

    public Integrante(String nome, String telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + "; Nome: " + nome + "; Telefone: " + telefone + "; Data Nascimento: " + dataNascimento;
    }
}
