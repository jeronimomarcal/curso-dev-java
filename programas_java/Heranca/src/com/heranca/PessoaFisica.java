package com.heranca;

public final class PessoaFisica extends Pessoa {
	public String nome;
	public String cpf;
	public String rg;
	public String idade;
	public String genero;

	public PessoaFisica(int idPessoa, String genero) {
		super(idPessoa);
		// TODO Auto-generated constructor stub
		this.genero = genero;
	}
	
	public String apresentar() {
		return "Meu nome é " + this.nome + super.apresentar();
		
	}

}
