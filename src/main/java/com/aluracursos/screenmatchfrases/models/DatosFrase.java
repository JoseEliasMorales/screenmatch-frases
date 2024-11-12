package com.aluracursos.screenmatchfrases.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosFrase(
@JsonAlias("Title") String titulo,
@JsonAlias("Poster") String poster
) {
}
