package com.challenge.scania.model.caminhao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "caminhao")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CaminhaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_caminhao;

    @OneToOne
    @JoinColumn(nullable = false, name = "id_fabricante")
    private FabricanteModel id_fabricante;

    @Column(nullable = false, name = "nm_caminhao")
    private String nome_camiao;

    @Column(nullable = false, name = "modelo")
    private String modelo;

    @Column(nullable = false, name = "peso")
    private double peso;

    @Column(nullable = false, name = "quilometragem")
    private int quilometragem;

    @Column(nullable = false, name = "capacidade")
    private int capacidade;
}
