package com.cofkau.crudPersona.controlador;

import com.cofkau.crudPersona.entidades.Persona;
import com.cofkau.crudPersona.servicios.InterfasServiciosPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")

public class ControladorPersona {

    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){

        return servicio.listar();
    }

    @PostMapping(value = "/guardarPersona")
    public Persona guaradarPersona(@RequestBody Persona persona){
        if(persona!=null){
            System.out.println("El objeto no tiene valor");
        }


        return servicio.guardar(persona);
    }

    @GetMapping(value = "/buscarPersona")
    public Persona buscarPersona(@PathVariable int id){
                return servicio.listarId(id);
    }


    @DeleteMapping(value ="/eliminarPersona")
    public Persona eliminarPersona(@PathVariable int id){
        return servicio.borrar(id);

    }

    @PutMapping(value = "/actualizarPersona")
    public Persona actualizarPersona(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }




}
