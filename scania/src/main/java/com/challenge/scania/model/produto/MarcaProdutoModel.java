package com.challenge.scania.model.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "marca_produto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MarcaProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_marca;

    @Column(nullable = false, name = "nm_marca")
    private int nome_marca;
}
