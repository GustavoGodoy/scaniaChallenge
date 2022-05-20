package com.challenge.scania.model.entrega;

import com.challenge.scania.model.caminhao.CaminhaoModel;
import com.challenge.scania.model.cliente.ClienteModel;
import com.challenge.scania.model.empresa.EmpresaModel;
import com.challenge.scania.model.pedido.PedidoModel;
import com.challenge.scania.model.trajeto.TrajetoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "entrega")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntregaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_entrega;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private EmpresaModel id_empresa;

    @ManyToOne
    @JoinColumn(name = "id_caminhao")
    private CaminhaoModel id_caminhao;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private PedidoModel id_pedido;

    @OneToOne
    @JoinColumn(name = "id_trajeto")
    private TrajetoModel id_trajeto;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private ClienteModel id_cliente;

    @Column(name = "nome_entrega")
    private String nome_entrega;

    private String observacao;

}
