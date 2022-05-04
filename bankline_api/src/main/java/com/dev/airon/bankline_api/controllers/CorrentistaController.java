package com.dev.airon.bankline_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.airon.bankline_api.model.Correntista;
import com.dev.airon.bankline_api.repository.CorrentistaRepository;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(Correntista correntista) {
		repository.save(correntista);
	}

}
