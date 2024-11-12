package com.aluracursos.screenmatchfrases.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
