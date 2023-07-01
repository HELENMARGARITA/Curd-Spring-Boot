package com.helenlopezsolano.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helenlopezsolano.proyecto.interfaceService.IUsuarioService;
import com.helenlopezsolano.proyecto.interfaces.IUsuario;
import com.helenlopezsolano.proyecto.modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuario data;
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int guardar(Usuario u) {
		// TODO Auto-generated method stub
		
		int res=0;
		Usuario usuario = data.save(u);
		if (!usuario.equals(null)) {
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
