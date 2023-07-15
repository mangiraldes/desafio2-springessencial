package com.giraldes.manolo.evento.entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="tbl_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    @OneToMany
    private Set<Bloco> blocos = new HashSet<>();
    @ManyToMany(mappedBy = "atividades")
    private Set<Participante> participantes = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Set<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(Set<Bloco> blocos) {
        this.blocos = blocos;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public Atividade(String nome, String descricao, Double preco, Set<Bloco> blocos, Set<Participante> participantes) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.blocos = blocos;
        this.participantes = participantes;
    }

    public Atividade() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atividade atividade = (Atividade) o;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
