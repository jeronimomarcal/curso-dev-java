package model.entities;

public class ContaPF extends Conta {

	private PessoaFisica titularDaConta;
	
	public ContaPF() {
		super();
	}
	
	public ContaPF(Integer numAg, Integer numConta, Double saldo, PessoaFisica titularDaConta) {
		super(numAg, numConta, saldo);
		this.titularDaConta = titularDaConta;
	}



	public PessoaFisica getTitularDaConta() {
		return titularDaConta;
	}
	@Override
	public String toString() {
		return super.toString() + "\nContaPF [titularDaConta=" + titularDaConta + "]";
	}
	
	
	
}
