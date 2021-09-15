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
        return servicio.guardar(persona);
    }







}
