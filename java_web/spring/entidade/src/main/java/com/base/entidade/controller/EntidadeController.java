package com.base.entidade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.base.entidade.models.Pessoa;
import com.base.entidade.repository.EntidadeRepository;

@Controller
public class EntidadeController {
	
	@Autowired
	private EntidadeRepository csr;
	
	@RequestMapping("/")
	public String cadastrarUsuario() {
		return "cadastrarUsuario";
	}
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.GET)
	public String cadastrarUsuario() {
		return "/cadastrarUsuario";
	}
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.POST)
	public String cadastrarUsuario(Pessoa usuario) {
		csr.save(usuario);
		return "redirect:/";
	}

}
