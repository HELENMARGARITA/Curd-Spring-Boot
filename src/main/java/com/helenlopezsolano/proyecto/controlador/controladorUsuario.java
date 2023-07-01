
package com.helenlopezsolano.proyecto.controlador;

import java.util.List;

//import org.apache.el.stream.Optional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.helenlopezsolano.proyecto.interfaceService.IUsuarioService;
import com.helenlopezsolano.proyecto.modelo.Usuario;

//import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping
public class controladorUsuario {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/")
	public String Index(Model model) {
		return "index";
		
	}
	
	@GetMapping("/index2")
	public String Index2(Model model) {
		return "index2";
		
	}
	
	@GetMapping("/listar")
	public String Listar(Model model) {
		List<Usuario>usuarios = service.listar(); // 2020000100405  2020000100366  2020000100439
		model.addAttribute("usuarios", usuarios);
		return "/view/usuario/listar";
		
	}
	
	@GetMapping("/agregarusuario")
	public String Agregar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "/view/usuario/agregar";
		
	}
	@PostMapping("/guardarusuario")
	public String guardar(@Validated Usuario u, Model m) {
		service.guardar(u);
		
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editarusuario/{id}")
	public String editar(@PathVariable int id,Model model){
		Optional<Usuario>usuario = service.listarId(id);
		model.addAttribute("usuario", usuario);
		return "/view/usuario/agregar";
		
	}
	
	@GetMapping("/eliminarusuario/{id}")
	public String eliminar(@PathVariable int id,Model model){
		//Optional<Usuario>usuario = service.listarId(id);
		service.eliminar(id);
		return "redirect:/listar";
		
	}
}
