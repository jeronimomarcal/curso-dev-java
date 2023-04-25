package model.entities;

public class ContaPJ extends Conta{

	private PessoaJuridica titularDaContaPJ;
	
	

	public ContaPJ() {
		super();
	}



	public ContaPJ(Integer numAg, Integer numConta, Double saldo, PessoaJuridica titularDaContaPJ) {
		super(numAg, numConta, saldo);
		this.titularDaContaPJ = titularDaContaPJ;
	}



	public PessoaJuridica getTitularDaContaPJ() {
		return titularDaContaPJ;
	}



	@Override
	public String toString() {
		return super.toString()+ "\nContaPJ [titularDaContaPJ=" + titularDaContaPJ + "]";
	}
	

	
}
