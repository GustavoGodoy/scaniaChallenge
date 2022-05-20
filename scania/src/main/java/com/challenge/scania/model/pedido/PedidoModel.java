package com.challenge.scania.model.pedido;

import com.challenge.scania.model.cliente.ClienteModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_funcao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteModel id_cliente;

    @Column(name = "dt_pedido")
    private Date data_pedido;
}
