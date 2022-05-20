package com.challenge.scania.repository.caminhao;

import com.challenge.scania.model.caminhao.FabricanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepository extends JpaRepository<FabricanteModel, Long> {
}