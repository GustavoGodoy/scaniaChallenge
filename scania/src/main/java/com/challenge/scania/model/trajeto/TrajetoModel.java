package com.challenge.scania.model.trajeto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "trajeto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrajetoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_trajeto;

    @OneToOne
    @JoinColumn(name = "id_inicial")
    private PontoIncialModel id_inicio;

    @OneToOne
    @JoinColumn(name = "id_final")
    private PontoFinalModel id_final;

    @Column(nullable = false, name = "distancia")
    private Long distancia;

}
