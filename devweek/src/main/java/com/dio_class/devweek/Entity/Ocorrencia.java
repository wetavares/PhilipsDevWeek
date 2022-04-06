package com.dio_class.devweek.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ocorrencia {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(nullable = false, updatable = false)
    private Long id;
    private Integer Regiao_id;
    private Integer Mes;
    private Long Faixa_id;
    private Integer Qtd_exames;

    public Ocorrencia(){}

    public Ocorrencia(Integer regiaoid, Integer mes, Long faixaide, Integer qtdexames){
        this.Regiao_id = regiaoid;
        this.Mes = mes;
        this.Faixa_id = faixaide;
        this.Qtd_exames = qtdexames;
    }

    public Long getId(){
        return id;
    }

    public Integer getRegiao_id(){
        return Regiao_id;
    }

    public void setRegiao_id(Integer regiao_id){
        Regiao_id = regiao_id;
    }

    public Integer getMes(){
        return Mes;
    }

    public void setMes(Integer mes){
        Mes = mes;
    }

    public Long getFaixa_id(){
        return Faixa_id;
    }

    public void setFaixa_id(Long faixa_id){
        Faixa_id = faixa_id;
    }

    public Integer getQtd_exames(){
        return Qtd_exames;
    }

    public void setQtd_exames(Integer qtd_exames){
        Qtd_exames = qtd_exames;
    }
}
