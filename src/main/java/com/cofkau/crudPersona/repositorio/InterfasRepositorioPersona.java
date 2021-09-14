package com.cofkau.crudPersona.repositorio;

import com.cofkau.crudPersona.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfasRepositorioPersona extends CrudRepository<Persona,Integer>{
}
