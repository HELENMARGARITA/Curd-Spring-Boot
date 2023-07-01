package com.helenlopezsolano.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.helenlopezsolano.proyecto.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Integer>{

}