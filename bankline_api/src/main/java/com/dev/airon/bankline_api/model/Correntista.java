package com.dev.airon.bankline_api.model;

import java.io.Serializable;

public class Correntista implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cpf;
	private String nome;
	private Conta conta;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	

}
