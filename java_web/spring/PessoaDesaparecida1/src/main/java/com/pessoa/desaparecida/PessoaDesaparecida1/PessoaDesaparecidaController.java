package com.pessoa.desaparecida.PessoaDesaparecida1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaDesaparecidaController {
    private final PessoaDesaparecidaRepository pessoaDesaparecidaRepository;

    @Autowired
    public PessoaDesaparecidaController(PessoaDesaparecidaRepository pessoaDesaparecidaRepository) {
        this.pessoaDesaparecidaRepository = pessoaDesaparecidaRepository;
    }

    @GetMapping("/cadastro")
    public String exibirFormulario(Model model) {
        model.addAttribute("pessoaDesaparecida", new PessoaDesaparecida());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrar(PessoaDesaparecida pessoaDesaparecida) {
        pessoaDesaparecidaRepository.save(pessoaDesaparecida);
        return "redirect:/cadastro";
    }
}
