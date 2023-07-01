package com.helenlopezsolano.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.helenlopezsolano.proyecto.modelo.Docente;

public interface IDocenteService {
	
	public List<Docente>listar();
	public Optional<Docente>listarId(int id);
	public int guardar(Docente d);
	public void eliminar(int id);

}
