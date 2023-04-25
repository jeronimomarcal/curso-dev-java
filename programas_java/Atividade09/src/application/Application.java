package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import model.entities.Conta;
import model.entities.ContaPF;
import model.entities.ContaPJ;
import model.entities.Endereco;
import model.entities.Pessoa;
import model.entities.PessoaFisica;
import model.entities.PessoaJuridica;
import model.entities.Telefone;

public class Application {

	 static int numdeCadastros = 0;
	 static Map<Integer, Pessoa> pessoas = new HashMap<>();

	
	 static int numDeContas = 1000;
	 static Map<Integer, Conta> contas = new HashMap<>();
	
	public static void main (String[]args) {		
		Locale.setDefault(Locale.US);
		Scanner get = new Scanner(System.in);
		String resposta;

		do {
			get.nextLine();
			resposta = questionario(get);
		
		if(resposta.equals("SAIR")) {
			System.out.println("Obrigado por usar meu programa");
		}
		
		if(resposta.equals("PF")) {
			get.nextLine();
			PessoaFisica pessoaFisica = possuiConta(get);			
			getContaPFInstance(get, pessoaFisica);
			System.out.println(pessoas.get(pessoaFisica.getIdPessoa()));
		}
		
		if (resposta.equals("PJ")) {
			get.nextLine();
			PessoaJuridica pessoaJuridica  = possuiContaJuridica(get);
			get.nextLine();
			getContaJuridicaInstance(get, pessoaJuridica);
			System.out.println( pessoas.get(pessoaJuridica.getIdPessoa()));
			
		}
		if(resposta.equals("SALDO")) {
			System.out.println("Entre com o numero da CONTA:");
			System.out.println((contas.get(get.nextInt())).getSaldo());
			get.nextLine();
		}
		if (resposta.equals("DEPOSITAR")){
			System.out.println("Entre com o numero da CONTA:");
			Conta conta = contas.get(get.nextInt());
			get.nextLine();
			System.out.println("Entre com o valor:");
			conta.depositarValor(get.nextDouble());
			get.nextLine();
		}
		if(resposta.equals("SACAR")){
			System.out.println("Entre com o numero da CONTA:");
			Conta conta = contas.get(get.nextInt());
			get.nextLine();
			System.out.println("Entre com o valor:");
			conta.sacarValor(get.nextDouble());
			get.nextLine();
			
			
		}
		if(resposta.equals("CC")) {
			contas.forEach( ((k, v) -> System.out.println((k + ":" + v))));
		}
		if(resposta.equals("PC")) {
			pessoas.forEach((k, v) -> System.out.println((k + ":" + v)));
		}
			
		
		
		}while(!resposta.equals("SAIR"));
				
		get.close();
		
		
	}
	
	
	private static PessoaJuridica getPessoaJIstance(Scanner get) {
		++numdeCadastros; //idpessoa
		Integer idPessoa = numdeCadastros;
		get.nextLine();
		System.out.println("Nome: ");
		String nome = get.nextLine();
		System.out.println("Email: ");
		String email = get.nextLine();
		System.out.println("Telefone Residencial: ");
		String residencial = get.nextLine();
		System.out.println("Telefone Celular: ");
		Telefone telefone = new Telefone(residencial, get.nextLine());
		Endereco endereco = getenderecoInstance(get);
		
		System.out.println("Tipo de empresa: ");
		String tipoEmpresa = get.nextLine();
		System.out.println("cnpj: ");
		String cnpj = get.nextLine();
		System.out.println("Inscrição estadual: ");
		String inscricaoEstadual = get.nextLine();
		System.out.println("Site: ");
		String site = get.nextLine();
		
		pessoas.put(idPessoa, new PessoaJuridica(idPessoa, nome, email, telefone, endereco, null, tipoEmpresa, cnpj, inscricaoEstadual, site));
		return (PessoaJuridica) pessoas.get(idPessoa);

		
	}

	private static PessoaJuridica possuiContaJuridica(Scanner get) {
		System.out.println("Você ja possui conta s/n");
		String possuicontaJ = get.next();
		if (possuicontaJ.toUpperCase() == "S") {
			System.out.println("Qual o seu ID:");
			int id = get.nextInt();
			return (PessoaJuridica)pessoas.get(id);
		}
		
		return getPessoaJIstance(get);
	}
	
	private static ContaPJ getContaJuridicaInstance(Scanner get, PessoaJuridica pessoaJuridica) {
		if (pessoaJuridica == null) {
			pessoaJuridica = getPessoaJIstance(get);
		}
		
		System.out.println("Numero de agencia: ");
		Integer numAg = get.nextInt();		
		Integer numConta = ++numDeContas;
		Double 	saldo = 0.0;
		
		contas.put(numConta, new ContaPJ(numAg, numConta, saldo, (PessoaJuridica) pessoas.get(pessoaJuridica.getIdPessoa())));
		return (ContaPJ) contas.get(numConta);
		
			
	}
	
	private static PessoaFisica possuiConta(Scanner get) {
		System.out.println("Você ja possui conta s/n");
		String possuiconta = get.next();
		
		if (possuiconta.toUpperCase().equals("S")) {
			System.out.println("Qual o seu ID:");
			int id = get.nextInt();
			return (PessoaFisica)pessoas.get(id);
		}
		
		return getPessoaFInstance(get);
	}
		
	private static ContaPF getContaPFInstance(Scanner get, PessoaFisica pessoaFisica) {
		if (pessoaFisica == null) {
			pessoaFisica = getPessoaFInstance(get);
		}
		
		System.out.println("Numero de agencia: ");
		Integer numAg = get.nextInt();		
		Integer numConta = ++numDeContas;
		Double 	saldo = 0.0;
		
		contas.put(numConta, new ContaPF(numAg, numConta, saldo, (PessoaFisica) pessoas.get(pessoaFisica.getIdPessoa())));
		return (ContaPF) contas.get(numConta);
		
			
	}

	private static PessoaFisica getPessoaFInstance(Scanner get) {
		get.nextLine();
		numdeCadastros++; //idpessoa
		Integer idPessoa = numdeCadastros;
		System.out.println("Nome: ");
		String nome = get.nextLine();
		System.out.println("Email: ");
		String email = get.nextLine();
		System.out.println("Telefone Residencial: ");
		String residencial = get.nextLine();
		System.out.println("Telefone Celular: ");
		Telefone telefone = new Telefone(residencial, get.nextLine());
		Endereco endereco = getenderecoInstance(get);
		
		System.out.println("CPF: ");
		 String cpf=get.nextLine();
		 System.out.println("RG: ");
		 String rg = get.nextLine();
		 System.out.println("Cargo: ");
		 String cargo = get.nextLine();
		 System.out.println("Salario: ");
		 Double salario = get.nextDouble();
				 get.nextLine();
		
		pessoas.put(idPessoa, new PessoaFisica(idPessoa, nome, email, telefone, endereco, null, cpf, rg, cargo, salario));
		return (PessoaFisica) pessoas.get(idPessoa);
		
		
		
	}

	private static Endereco getenderecoInstance(Scanner get) {
		System.out.println("Cep: ");
		 String cep = get.nextLine();
		
		System.out.println("UF: ");
		 String uf = get.nextLine();
		System.out.println("Cidade: ");
		 String cidade = get.nextLine();
		System.out.println("Bairro: ");
		 String bairro = get.nextLine();
		System.out.println("Logradouro: ");
		 String logradouro=get.nextLine();
		System.out.println("Complemento: ");
		 String complemento= get.nextLine();
		System.out.println("Numero: ");
		 String numero = get.nextLine();
		return new Endereco(cep, uf, cidade, bairro, logradouro, complemento, numero);
	}

	private static String questionario(Scanner get){
		System.out.println("O que deseja fazer?");
		System.out.println("Para Cadastrar Pessoa Fiscia escreva PF\n"
				+ "Para cadastrar Pessoa Juridica escreva PJ\n"
				+ "Para saldo escreva saldo\n"
				+ "Para depósitar escreva depositar\n"
				+ "para sacar escreva sacar\n"
				+ "Contas cadastradas CC\\n"
				+ "Pessoas cadastradas PC\n"
				+ "para parar a aplicação escreva sair:"
				);
				String resposta= get.nextLine();;
				return  resposta.toUpperCase();
	}
		


	
	
}
