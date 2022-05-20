package com.challenge.scania.repository.empresa;

import com.challenge.scania.model.empresa.EmpresaEnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaEnderecoRepository extends JpaRepository<EmpresaEnderecoModel, Long> {
}