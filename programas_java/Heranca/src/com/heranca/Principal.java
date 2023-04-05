package com.heranca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia objeto
		PessoaFisica usuario = new PessoaFisica(101, "Maculino");
		PessoaJuridica empresa = new PessoaJuridica(201);
		
		// repasse os valores para o objeto usuario
		usuario.nome = "Jeronimo Marçal";
		usuario.cpf = "111.222.333-44";
		usuario.rg = "1.111.111";
		usuario.idade = "23";
		usuario.endereco = "Campo da Esperanaça";
		usuario.telefone = "(61) 98765-4321.\n";
		
		//repassa os valores para o objeto empresa
		empresa.razaoSocial = "Jeronimo LTDA";
		empresa.nomeFantasia = "Cleitimm";
		empresa.cnpj = "61.036.397/0001-66";
		empresa.endereco = "SENAI Taguatinga";
		empresa.telefone = "(11) 19932-2764";

		//saida de dados do usuario
		System.out.println(empresa.cumprimentar());
		System.out.println(empresa.apresentar());
		System.out.println("ID: " + usuario.idPessoa + ".");
		System.out.println("Nome: " + usuario.nome + ".");
		System.out.println("Cpf: " + usuario.cpf + ".");
		System.out.println("Idade: " + usuario.idade + ".");
		System.out.println("RG: " + usuario.rg + ".");
		System.out.println("Endereço: " + usuario.endereco + ".");
		System.out.println("Telefone: " + usuario.telefone + ".");
		
		
		//saida de dados da empresa
		System.out.println(empresa.cumprimentar());
		System.out.println(empresa.apresentar());
		System.out.println("ID da empresa:" + empresa.idPessoa + ".");
		System.out.println("Razão social: " + empresa.razaoSocial + ".");
		System.out.println("Nome fantasia: " + empresa.nomeFantasia + ".");
		System.out.println("Telefone: " + empresa.telefone + ".");
		System.out.println("Endereço: " + empresa.endereco + ".");
	}

}
