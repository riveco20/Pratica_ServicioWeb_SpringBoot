package com.cofkau.crudPersona.servicios;


import com.cofkau.crudPersona.entidades.Persona;

import java.util.List;

public interface InterfasServiciosPersona {
    public List<Persona>listar();
    public Persona listarId(int id);
    public  Persona guardar(Persona persona);
    public Persona borrar(int id);
    public Persona actualizar(Persona persona);
}
