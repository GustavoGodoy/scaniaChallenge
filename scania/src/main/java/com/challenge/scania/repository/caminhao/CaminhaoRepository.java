package com.challenge.scania.repository.caminhao;

import com.challenge.scania.model.caminhao.CaminhaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaminhaoRepository extends JpaRepository<CaminhaoModel, Long> {
}