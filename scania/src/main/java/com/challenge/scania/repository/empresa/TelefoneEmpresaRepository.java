package com.challenge.scania.repository.empresa;

import com.challenge.scania.model.empresa.TelefoneEmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneEmpresaRepository extends JpaRepository<TelefoneEmpresaModel, Long> {
}