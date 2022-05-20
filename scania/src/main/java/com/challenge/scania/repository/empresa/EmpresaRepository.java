package com.challenge.scania.repository.empresa;

import com.challenge.scania.model.empresa.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Long> {
}