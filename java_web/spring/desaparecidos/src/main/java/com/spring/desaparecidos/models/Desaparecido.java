package com.spring.desaparecidos.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Desaparecido implements Serializable {
	
	// atributos
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idDesaparecido;
	
	private String nome;
	private String sobrenome;
	private String diaDesaparecimento;
	private String local;
	private String ocorrencia;
	private String dp;
	
	private int idade;

	// construtor
	public Desaparecido() {
		// TODO Auto-generated constructor stub
	}

	// getters e setters
	public long getIdDesaparecido() {
		return idDesaparecido;
	}

	public void setIdDesaparecido(long idDesaparecido) {
		this.idDesaparecido = idDesaparecido;
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

	public String getDiaDesaparecimento() {
		return diaDesaparecimento;
	}

	public void setDiaDesaparecimento(String diaDesaparecimento) {
		this.diaDesaparecimento = diaDesaparecimento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getDp() {
		return dp;
	}

	public void setDp(String dp) {
		this.dp = dp;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
