package com.dev.airon.bankline_api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.airon.bankline_api.dto.CorrentistaDto;
import com.dev.airon.bankline_api.model.Conta;
import com.dev.airon.bankline_api.model.Correntista;
import com.dev.airon.bankline_api.repository.CorrentistaRepository;

@Service

public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	
	public void save(CorrentistaDto correntistaDto) {
		Correntista correntista = new Correntista();
		correntista.setNome(correntistaDto.getNome());
		correntista.setCpf(correntistaDto.getCpf());
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumeroConta(new Date().getTime());
		correntista.setConta(conta);
		repository.save(correntista);
	}

}
