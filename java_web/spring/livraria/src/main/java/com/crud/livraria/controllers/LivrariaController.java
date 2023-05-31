package com.crud.livraria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crud.livraria.models.Livro;
import com.crud.livraria.repository.LivrariaRepository;

@Controller
public class LivrariaController {
	
	@Autowired
	private LivrariaRepository lr;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/cadastrarLivro", method=RequestMethod.GET)
	public String cadastrarLivro() {
		return "content/cadastrar-livro";
	}
	
	@RequestMapping(value="/cadastrarLivro", method=RequestMethod.POST)
	public String cadastrarLivro(Livro livro) {
		lr.save(livro);
		return "redirect:/";
	}
	
	@RequestMapping("/listarLivros")
	public ModelAndView listarLivros() {
		
		ModelAndView mv = new ModelAndView("content/listar-livros");
		
		Iterable<Livro> livros = lr.findAll();
		mv.addObject("livros", livros);
		
		return mv;
		
	}
	
}
