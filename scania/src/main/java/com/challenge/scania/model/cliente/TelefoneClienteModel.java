package com.challenge.scania.model.cliente;

import com.challenge.scania.model.empresa.EmpresaModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "telefone_cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TelefoneClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_telefone;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteModel id_cliente;

    @Column(nullable = false, name = "nm_telefone")
    private int numero_telefone;

    @OneToOne
    private ClienteModel cliente;
}
