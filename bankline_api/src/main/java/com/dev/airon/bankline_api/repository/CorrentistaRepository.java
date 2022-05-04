package com.dev.airon.bankline_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.airon.bankline_api.model.Correntista;

@Repository
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
