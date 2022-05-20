package com.challenge.scania.model.trajeto;

import com.challenge.scania.model.empresa.EmpresaModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ponto_final")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PontoFinalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_final;

    @Column(nullable = false, name = "cep")
    private int cep;
}
