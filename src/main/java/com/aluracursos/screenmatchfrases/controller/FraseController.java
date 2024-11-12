package com.aluracursos.screenmatchfrases.controller;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseRandom(){
        return fraseService.obtenerFraseRandom();
    }
}
