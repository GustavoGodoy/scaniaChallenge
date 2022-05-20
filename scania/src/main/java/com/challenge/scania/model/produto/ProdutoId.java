package com.challenge.scania.model.produto;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ProdutoId implements Serializable {

    @JoinColumn(name = "id_produto")
    private ProdutoModel id_produto;
    @JoinColumn(name = "id_tipo")
    private TipoProdutoModel id_tipo;
    @JoinColumn(name = "id_marca")
    private MarcaProdutoModel id_marca;
    @JoinColumn(name = "id_funcao")
    private FuncaoProdutoModel id_funcao;

}
