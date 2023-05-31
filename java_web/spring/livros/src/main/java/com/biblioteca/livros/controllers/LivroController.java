package com.biblioteca.livros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.livros.models.Livro;
import com.biblioteca.livros.repository.LivrosRepository;



@Controller
@RequestMapping("/")
public class LivroController {

    @Autowired
    private LivrosRepository lr;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("livro", new Livro());
        return "index"; 
    }

	@RequestMapping(value="/cadastrar-livro", method=RequestMethod.GET)
	public String cadastrarLivro() {
		return "content/cadastrar-livro";
	}
	
	
	@PostMapping("/livros")
	public String cadastrar(@ModelAttribute("livro") Livro livro) {
	    lr.save(livro);
	    return "redirect:/";
	}
	@RequestMapping("/listar-livros")
	public ModelAndView listarLivros() {
		
		ModelAndView mv = new ModelAndView("content/listar-livros");
		
		Iterable<Livro> livros = lr.findAll();
		mv.addObject("livros", livros);
		
		return mv;
    }
	
	@RequestMapping("/confirmarExclusaoLivro/{idLivro}")
	public ModelAndView confirmarExclusaoLivro(@PathVariable("idLivro") long idLivro) {
		
		Livro livro = lr.findByIdLivro(idLivro);
		
		ModelAndView mv = new ModelAndView("content/excluir-livro");
		
		mv.addObject("livro", livro);
		
		return mv;
	}

	@RequestMapping("/excluirLivro")
	public String excluirLivro(long idLivro) {
		
		Livro livro = lr.findByIdLivro(idLivro);
		lr.delete(livro);
		
		return "redirect:/listar-livros";
		
	}
	
	
}

