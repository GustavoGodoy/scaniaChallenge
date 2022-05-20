package com.challenge.scania.repository.cliente;

import com.challenge.scania.model.cliente.TelefoneClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneClienteRepository extends JpaRepository<TelefoneClienteModel, Long> {
}