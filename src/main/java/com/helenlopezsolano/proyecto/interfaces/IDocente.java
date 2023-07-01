package com.helenlopezsolano.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.helenlopezsolano.proyecto.modelo.Docente;
@Repository
public interface IDocente extends CrudRepository<Docente, Integer>{

}
