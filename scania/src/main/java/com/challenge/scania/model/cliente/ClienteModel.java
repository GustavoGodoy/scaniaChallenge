package com.challenge.scania.model.cliente;

import com.challenge.scania.model.pedido.PedidoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cliente;

    @Column(nullable = false, name = "nm_cliente")
    private String nome_cliente;

    @Column(nullable = false, name = "cnpj")
    private String cnpj;

}
