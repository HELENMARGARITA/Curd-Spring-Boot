package com.helenlopezsolano.proyecto.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.helenlopezsolano.proyecto.interfaceService.IDocenteService;
import com.helenlopezsolano.proyecto.modelo.Docente;



@Controller
@RequestMapping
public class controladorDocente {

	@Autowired
	private IDocenteService service;
	
	@GetMapping("/listarDocentes")
	public String Listar(Model model) {
		List<Docente>docentes = service.listar();
		model.addAttribute("docentes", docentes);
		return "/view/docente/listar";
		
	}
	
	@GetMapping("/agregardocente")
	public String Agregar(Model model) {
		model.addAttribute("docente", new Docente());
		return "/view/docente/agregar";
		
	}
	
	@PostMapping("/guardardocente")
	public String guardar(@Validated Docente d, Model m) {
		service.guardar(d);
		
		return "redirect:/listarDocentes";
		
	}
	
	@GetMapping("/editardocente/{id}")
	public String editar(@PathVariable int id,Model model){
		Optional<Docente>docente = service.listarId(id);
		model.addAttribute("docente", docente);
		return "/view/docente/agregar";
		
	}
	
	@GetMapping("/eliminardocente/{id}")
	public String eliminar(@PathVariable int id,Model model){
		//Optional<Usuario>usuario = service.listarId(id);
		service.eliminar(id);
		return "redirect:/listarDocentes";
		
	}
}
