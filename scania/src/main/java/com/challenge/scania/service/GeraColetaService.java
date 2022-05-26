package com.challenge.scania.service;

import com.challenge.scania.DTO.ResponseDTO;
import com.challenge.scania.repository.caminhao.CaminhaoRepository;

public class GeraColetaService implements CaminhaoRepository {


    @Override
    public ResponseDTO buscaInfo(String id_caminhao) {
        ResponseDTO info = new ResponseDTO(id_caminhao, "Scania XPTO","Umuarama - PR","Diadema - SP", "Explosivos");
        return info;
    }
}
