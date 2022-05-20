package com.challenge.scania.model.caminhao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "fabricante")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FabricanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_fabricante;

    @Column(nullable = false, name = "nm_fabricante")
    private String fabricante;

}
