package com.dev.airon.bankline_api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.airon.bankline_api.dto.MovimentacaoDto;
import com.dev.airon.bankline_api.model.Movimentacao;
import com.dev.airon.bankline_api.model.MovimentacaoTipo;
import com.dev.airon.bankline_api.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	public void save(MovimentacaoDto movimentacaoDto) {
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(movimentacaoDto.getDescricao());
		movimentacao.setIdConta(movimentacaoDto.getIdConta());
		movimentacao.setTipo(movimentacaoDto.getTipo());
		Double valor = movimentacaoDto.getTipo() == MovimentacaoTipo.RECEITA ? movimentacaoDto.getValor() : movimentacaoDto.getValor() * - 1;
		
		movimentacao.setValor(valor); 
		repository.save(movimentacao);
		
	}

}
