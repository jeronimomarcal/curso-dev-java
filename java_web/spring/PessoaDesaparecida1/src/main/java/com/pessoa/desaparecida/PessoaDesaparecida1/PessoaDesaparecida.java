package com.pessoa.desaparecida.PessoaDesaparecida1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class PessoaDesaparecida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;

    private LocalDate dataDesaparecimento;

    private int idadeDesaparecimento;
    private String regiao;
    private String numeroOcorrencia;
    private String dpRegistro;

    // Construtores, getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataDesaparecimento() {
        return dataDesaparecimento;
    }

    public void setDataDesaparecimento(LocalDate dataDesaparecimento) {
        this.dataDesaparecimento = dataDesaparecimento;
    }

    public int getIdadeDesaparecimento() {
        return idadeDesaparecimento;
    }

    public void setIdadeDesaparecimento(int idadeDesaparecimento) {
        this.idadeDesaparecimento = idadeDesaparecimento;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNumeroOcorrencia() {
        return numeroOcorrencia;
    }

    public void setNumeroOcorrencia(String numeroOcorrencia) {
        this.numeroOcorrencia = numeroOcorrencia;
    }

    public String getDpRegistro() {
        return dpRegistro;
    }

    public void setDpRegistro(String dpRegistro) {
        this.dpRegistro = dpRegistro;
    }
}
