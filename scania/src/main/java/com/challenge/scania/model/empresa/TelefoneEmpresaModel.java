package com.challenge.scania.model.empresa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "telefone_empresa")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TelefoneEmpresaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_telefone;

    @Column(nullable = false, name = "nm_telefone")
    private int numero_telefone;
}
