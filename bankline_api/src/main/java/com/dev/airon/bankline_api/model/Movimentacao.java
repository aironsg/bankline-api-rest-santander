package com.dev.airon.bankline_api.model;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Movimentacao implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	

}
