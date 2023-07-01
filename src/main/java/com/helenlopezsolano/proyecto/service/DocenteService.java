package com.helenlopezsolano.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helenlopezsolano.proyecto.interfaceService.IDocenteService;
import com.helenlopezsolano.proyecto.interfaces.IDocente;
import com.helenlopezsolano.proyecto.modelo.Docente;

@Service
public class DocenteService implements IDocenteService{
 
	@Autowired
	private IDocente data;
	@Override
	public List<Docente> listar() {
		// TODO Auto-generated method stub
		return (List<Docente>)data.findAll();
	}

	@Override
	public Optional<Docente> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int guardar(Docente d) {
		// TODO Auto-generated method stub
		int res=0;
		Docente docente = data.save(d);
		if (!docente.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}

