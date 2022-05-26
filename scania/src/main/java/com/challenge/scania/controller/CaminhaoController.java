package com.challenge.scania.controller;

import com.challenge.scania.DTO.ResponseDTO;
import com.challenge.scania.model.caminhao.CaminhaoModel;
import com.challenge.scania.service.GeraColetaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaminhaoController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("feature/index");
        return model;
    }

    @GetMapping("/caminhao")
    public ModelAndView buscar(){
        ModelAndView model = new ModelAndView("feature/caminhao");
        ResponseDTO caminhao = new ResponseDTO();
        model.addObject("caminhao", caminhao);
        return model;
    }

    @PostMapping("/caminhao")
    public ModelAndView caminhao(@ModelAttribute("caminhao") ResponseDTO caminhaoDTO){
        ModelAndView model = new ModelAndView("feature/result");
        GeraColetaService service = new GeraColetaService();
        caminhaoDTO = service.buscaInfo(caminhaoDTO.getId_caminhao());
        model.addObject("caminhao", caminhaoDTO);
        return model;
    }
}
