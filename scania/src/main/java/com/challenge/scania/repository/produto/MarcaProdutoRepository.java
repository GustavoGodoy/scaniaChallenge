package com.challenge.scania.repository.produto;

import com.challenge.scania.model.produto.MarcaProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaProdutoRepository extends JpaRepository<MarcaProdutoModel, Long> {
}