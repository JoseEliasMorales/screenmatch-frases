package com.aluracursos.screenmatchfrases.models;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String poster;
    private String frase;
    private String personaje;

    public Frase(){}

    public Frase(String frase, String personaje, DatosFrase datosFrase){
        this.titulo = datosFrase.titulo();
        this.poster = datosFrase.poster();
        this.frase = frase;
        this.personaje = personaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Frase{" +
                "titulo='" + titulo + '\'' +
                ", poster='" + poster + '\'' +
                ", frase='" + frase + '\'' +
                ", autor='" + personaje + '\'' +
                '}';
    }
}
