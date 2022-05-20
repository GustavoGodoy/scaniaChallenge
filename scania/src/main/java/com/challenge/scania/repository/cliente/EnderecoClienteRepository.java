package com.challenge.scania.repository.cliente;

import com.challenge.scania.model.cliente.EnderecoClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoClienteRepository extends JpaRepository<EnderecoClienteModel, Long> {
}