package com.challenge.scania.repository.nota;

import com.challenge.scania.model.nota.NotaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<NotaModel, Long> {
}