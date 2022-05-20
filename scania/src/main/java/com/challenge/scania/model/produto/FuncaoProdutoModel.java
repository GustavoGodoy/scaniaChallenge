package com.challenge.scania.model.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "funcao_produto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FuncaoProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_funcao;

    @Column(nullable = false, name = "nm_funcao")
    private int nome_funcao;
}
