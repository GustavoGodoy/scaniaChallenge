package com.challenge.scania.repository.produto;

import com.challenge.scania.model.produto.FuncaoProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoProdutoRepository extends JpaRepository<FuncaoProdutoModel, Long> {
}