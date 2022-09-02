package com.spring.controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/index", "/", "home" })
	public String index(Model model) {
		model.addAttribute("titulo", "hola Spring Framework");
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Cristian");
		usuario.setApellido("Revelo");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de usuario :".concat(usuario.getNombre()));
		return "Perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = Arrays.asList(new Usuario("cristian","revelo","cristian@gmail.com"),new Usuario("katherin","ramirez","katherin@gmail.com"),new Usuario("carlos","alvarado","alvarado@gmail.com"));
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		return "Listar";
	}

}
