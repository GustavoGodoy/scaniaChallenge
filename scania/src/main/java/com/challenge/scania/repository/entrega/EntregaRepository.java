package com.challenge.scania.repository.entrega;

import com.challenge.scania.model.entrega.EntregaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<EntregaModel, Long> {
}