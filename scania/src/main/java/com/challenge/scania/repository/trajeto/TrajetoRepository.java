package com.challenge.scania.repository.trajeto;

import com.challenge.scania.model.trajeto.TrajetoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajetoRepository extends JpaRepository<TrajetoModel, Long> {
}