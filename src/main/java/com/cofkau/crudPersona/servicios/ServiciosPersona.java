package com.cofkau.crudPersona.servicios;

import com.cofkau.crudPersona.entidades.Persona;
import com.cofkau.crudPersona.excepciones.*;
import com.cofkau.crudPersona.repositorio.InterfasRepositorioPersona;
import org.apache.coyote.ContinueResponseTiming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service

public class ServiciosPersona implements InterfasServiciosPersona {

    @Autowired
    private InterfasRepositorioPersona data;


    @Override
    public List<Persona> listar() throws LecturaDatosEx {

        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) throws LecturaDatosEx{

        return data.findById(id);
    }

    @Override
    public Persona guardar(Persona persona) throws EscrituraDatosEx {
        if(persona.getNombre()==null){
            System.out.println("No a ingresando ninguna persona");
        }
                return data.save(persona);
    }

    @Override
    public Optional<Persona> borrar(int id) throws LecturaDatosEx {
        return data.findById(id);
    }

    @Override
    public Persona actualizar(Persona persona) throws LecturaDatosEx {
        Optional<Persona> persona1 = data.findById(persona.getId());
        if(persona1.isEmpty()){
            System.out.println("El usuairo no existe");
        }
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre");
        String nombre = consola.nextLine();
        System.out.println("Ingrese la nueva edad");
        persona.setNombre(nombre);
    }
}
