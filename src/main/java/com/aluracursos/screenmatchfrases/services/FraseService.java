package com.aluracursos.screenmatchfrases.services;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.models.Frase;
import com.aluracursos.screenmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseRandom(){
        return convertirDatos(repository.encontrarFraseRandom());

    }

    public FraseDTO convertirDatos(Frase frase){
        FraseDTO fraseDTO = new FraseDTO(frase.getId(), frase.getTitulo(), frase.getPoster(), frase.getFrase(), frase.getPersonaje());
        return fraseDTO;
    }
}
