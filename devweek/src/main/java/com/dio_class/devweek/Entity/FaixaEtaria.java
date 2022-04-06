package com.dio_class.devweek.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class FaixaEtaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable = false)
    private Long id;
    private Long faixa_i;
    private Long faixa_n;
    private String descricao;

    public FaixaEtaria(Long id, Long faixa_i, Long faixa_n, String descricao) {
        this.faixa_i = faixa_i;
        this.faixa_n = faixa_n;
        this.descricao = descricao;
    }

    public FaixaEtaria() {
    }


    public Long getId() {
        return this.id;
    }

    public Long getFaixa_i() {
        return this.faixa_i;
    }

    public void setFaixa_i(Long faixa_i) {
        this.faixa_i = faixa_i;
    }

    public Long getFaixa_n() {
        return this.faixa_n;
    }

    public void setFaixa_n(Long faixa_n) {
        this.faixa_n = faixa_n;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
