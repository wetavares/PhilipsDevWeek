package com.dio_class.devweek.Entity;

import javax.annotation.Generated;

import org.springframework.cglib.reflect.MethodDelegate.Column;
import org.springframework.cglib.reflect.MethodDelegate.Generator;
import org.springframework.data.annotation.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Regiao {
    @Id 
    @Generated(strategy = Generator.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String regiao;
    private Long qtd_exames;

    public Regiao(String regiao, Long qtd_exames) {
        this.regiao = regiao;
        this.qtd_exames = qtd_exames;
    }

    public Regiao() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegiao() {
        return this.regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getQtd_exames() {
        return this.qtd_exames;
    }

    public void setQtd_exames(Long qtd_exames) {
        this.qtd_exames = qtd_exames;
    }
    

}