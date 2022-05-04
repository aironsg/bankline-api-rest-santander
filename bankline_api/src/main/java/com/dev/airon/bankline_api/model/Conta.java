package com.dev.airon.bankline_api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Conta implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long numeroConta;
	private Double saldo;
	
	public Long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

}
