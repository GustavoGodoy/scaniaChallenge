package com.challenge.scania.model.nota;

import com.challenge.scania.model.cliente.ClienteModel;
import com.challenge.scania.model.pedido.PedidoModel;
import com.challenge.scania.model.produto.ProdutoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "nota")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_nota;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private ProdutoModel id_produto;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private PedidoModel id_pedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteModel id_cliente;

    private double valor_total;

    private int qtde_produto;
}
