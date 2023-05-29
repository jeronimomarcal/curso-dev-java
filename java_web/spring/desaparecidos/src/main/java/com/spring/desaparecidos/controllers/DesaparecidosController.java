package com.spring.desaparecidos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.desaparecidos.models.Desaparecido;
import com.spring.desaparecidos.repository.DesaparecidosRepository;

@Controller
public class DesaparecidosController {
	
	@Autowired
	private DesaparecidosRepository dr;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String index(Desaparecido desaparecido) {
		dr.save(desaparecido);
		
		return "redirect:/";
	}
	
}
