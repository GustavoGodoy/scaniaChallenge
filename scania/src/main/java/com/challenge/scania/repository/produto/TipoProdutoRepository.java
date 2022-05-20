package com.challenge.scania.repository.produto;

import com.challenge.scania.model.produto.TipoProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProdutoRepository extends JpaRepository<TipoProdutoModel, Long> {
}