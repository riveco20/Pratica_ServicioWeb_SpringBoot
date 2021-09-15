package com.cofkau.crudPersona.servicios;


import com.cofkau.crudPersona.entidades.Persona;
import com.cofkau.crudPersona.excepciones.EscrituraDatosEx;
import com.cofkau.crudPersona.excepciones.LecturaDatosEx;

import java.util.List;
import java.util.Optional;

public interface InterfasServiciosPersona {
    public List<Persona>listar() throws LecturaDatosEx;
    public Optional<Persona> listarId(int id) throws LecturaDatosEx;
    public  Persona guardar(Persona persona) throws EscrituraDatosEx;
    public Optional<Persona> borrar(int id) throws LecturaDatosEx;
    public Persona actualizar(Persona persona) throws LecturaDatosEx;
}
