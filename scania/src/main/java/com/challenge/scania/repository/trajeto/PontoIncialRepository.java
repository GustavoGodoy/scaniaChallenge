package com.challenge.scania.repository.trajeto;

import com.challenge.scania.model.trajeto.PontoIncialModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoIncialRepository extends JpaRepository<PontoIncialModel, Long> {
}