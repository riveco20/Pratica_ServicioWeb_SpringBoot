package com.cofkau.crudPersona.servicios;

import com.cofkau.crudPersona.entidades.Persona;
import com.cofkau.crudPersona.repositorio.InterfasRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiciosPersona implements InterfasServiciosPersona {

    @Autowired
    private InterfasRepositorioPersona data;


    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return null;
    }

    @Override
    public Persona guardar(Persona persona) {
        return data.save(persona);
    }

    @Override
    public Persona borrar(int id) {
        return null;
    }

    @Override
    public Persona actualizar(Persona persona) {
        return null;
    }
}
