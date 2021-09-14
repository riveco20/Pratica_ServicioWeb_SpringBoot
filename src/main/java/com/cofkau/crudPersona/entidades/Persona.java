package com.cofkau.crudPersona.entidades;

import javax.persistence.*;

@Entity// Asi defino que es una entidad
@Table(name = "Persona") //como es una base relacional trabajan con tablas

public class Persona {
    @Id //identificadno las estiquetas
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Coloca el valor de la id como automatico
    private Integer id;
    private String nombre;
    private String edad;//siempre que un atributo o variable no realize algun calculo se degine como String


    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
