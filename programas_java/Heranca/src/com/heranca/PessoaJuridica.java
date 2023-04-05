package com.heranca;

public final class PessoaJuridica extends Pessoa {
	
	//atributos
	public String razaoSocial;
	public String nomeFantasia;
	public String cnpj;

	public PessoaJuridica(int idPessoa) {
		super(idPessoa);
		// TODO Auto-generated constructor stub
	}
	public String apresentar() {
		return "Meu nome é " + this.razaoSocial + super.apresentar();
	}
}
