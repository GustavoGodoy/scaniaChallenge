package com.challenge.scania.repository.trajeto;

import com.challenge.scania.model.trajeto.PontoFinalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoFinalRepository extends JpaRepository<PontoFinalModel, Long> {
}