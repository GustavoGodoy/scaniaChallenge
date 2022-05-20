package com.challenge.scania.model.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tipo_produto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TipoProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_tipo;

    @Column(nullable = false, name = "nm_tipo")
    private int nome_tipo;
}
