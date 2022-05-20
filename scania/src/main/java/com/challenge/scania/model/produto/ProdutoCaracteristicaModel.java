package com.challenge.scania.model.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "produto_caracteristica")
@IdClass(ProdutoId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProdutoCaracteristicaModel {


    @Id
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private ProdutoModel id_produto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoProdutoModel id_tipo;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private MarcaProdutoModel id_marca;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_funcao")
    private FuncaoProdutoModel id_funcao;

}
