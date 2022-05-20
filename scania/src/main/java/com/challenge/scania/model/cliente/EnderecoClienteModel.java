package com.challenge.scania.model.cliente;

import com.challenge.scania.model.empresa.EmpresaModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "endereco_cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_endereco;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteModel id_cliente;

    @Column(nullable = false, name = "nm_rua")
    private String nome_rua;

    @Column(name = "nr_rua")
    private int numero;

    @Column(nullable = false, name = "cidade")
    private String cidade;

    @Column(nullable = false, name = "estado")
    private String estado;

    @Column(nullable = false, name = "cep")
    private int cep;
}
