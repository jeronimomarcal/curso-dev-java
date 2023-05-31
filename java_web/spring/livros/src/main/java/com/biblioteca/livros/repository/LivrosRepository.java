package com.biblioteca.livros.repository;

import org.springframework.data.repository.CrudRepository;

import com.biblioteca.livros.models.Livro;


public interface LivrosRepository extends CrudRepository<Livro, Long> {
	
	Livro findByIdLivro(long idLivro);
	Livro deleteByIdLivro(long idLivro);
	
}
