package com.challenge.scania.model.produto;

import com.challenge.scania.model.empresa.EmpresaModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_produto;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private EmpresaModel empresa;

    @Column(nullable = false, name = "nm_produto")
    private int nome_produto;

    @Column(nullable = false, name = "vl_untario")
    private double valor_unitario;

}
