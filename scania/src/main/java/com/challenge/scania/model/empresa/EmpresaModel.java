package com.challenge.scania.model.empresa;

import com.challenge.scania.model.produto.ProdutoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_empresa;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private EmpresaEnderecoModel id_endereco;

    @OneToOne
    @JoinColumn(name = "id_telefone")
    private TelefoneEmpresaModel id_telefone;

    @Column(nullable = false, name = "nm_empresa")
    private String nome_empresa;

    @Column(nullable = false, name = "cnpj")
    private String cnpj;

}
