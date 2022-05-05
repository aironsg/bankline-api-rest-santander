package com.dev.airon.bankline_api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.airon.bankline_api.dto.MovimentacaoDto;
import com.dev.airon.bankline_api.model.Correntista;
import com.dev.airon.bankline_api.model.Movimentacao;
import com.dev.airon.bankline_api.model.MovimentacaoTipo;
import com.dev.airon.bankline_api.repository.CorrentistaRepository;
import com.dev.airon.bankline_api.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	public void save(MovimentacaoDto movimentacaoDto) {
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(movimentacaoDto.getDescricao());
		movimentacao.setIdConta(movimentacaoDto.getIdConta());
		movimentacao.setTipo(movimentacaoDto.getTipo());
		Double valor = movimentacaoDto.getTipo() == MovimentacaoTipo.RECEITA ? movimentacaoDto.getValor() : movimentacaoDto.getValor() * - 1;
		Correntista correntista = new Correntista();
		correntista = correntistaRepository.findById(movimentacaoDto.getIdConta()).orElse(null);
		if(correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
			
		}
		movimentacao.setValor(valor); 
		repository.save(movimentacao);
		
	}

}
