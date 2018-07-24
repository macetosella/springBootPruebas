package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="NOTA")
@Entity
public class Nota implements Serializable {

    public Nota(){}

    public Nota(String nombre, String titulo, String contenido) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    @GeneratedValue
    @Id
    @Column(name = "ID_NOTA")
    private long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "CONTENIDO")
    private String contenido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
