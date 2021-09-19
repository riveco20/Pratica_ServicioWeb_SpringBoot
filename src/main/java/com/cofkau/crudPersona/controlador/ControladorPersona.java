package com.cofkau.crudPersona.controlador;

import com.cofkau.crudPersona.entidades.Persona;
import com.cofkau.crudPersona.excepciones.EscrituraDatosEx;
import com.cofkau.crudPersona.excepciones.LecturaDatosEx;
import com.cofkau.crudPersona.servicios.InterfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/Persona")

public class ControladorPersona {

    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){

        try {
            return servicio.listar();
        } catch (LecturaDatosEx e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guaradarPersona(@RequestBody Persona persona) throws EscrituraDatosEx {
        if(persona!=null){
            System.out.println("El objeto no tiene valor");
        }
        return servicio.guardar(persona);
    }

    @GetMapping(value = "/buscarPersona")
    public Optional<Persona> buscarPersona(@PathVariable int id) throws LecturaDatosEx {
                return servicio.listarId(id);
    }


    @DeleteMapping(value ="/eliminarPersona")
    public Optional<Persona> eliminarPersona(@PathVariable int id) throws LecturaDatosEx {
        return servicio.borrar(id);

    }

    @PutMapping(value = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona) throws LecturaDatosEx {
        return servicio.actualizar(persona);
    }




}
