package com.challenge.scania.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseDTO {
    public String id_caminhao;
    public String modelo;
    public String saida;
    public String chegada;
    public String tipo_produto;
}
