package model.entities;

public class Conta implements IConta {

	private Integer numAg;
	private Integer numConta;
	private Double saldo;
	public Integer getNumAg() {
		return numAg;
	}
		
	public Conta() {
		super();
	}
	
	public Conta(Integer numAg, Integer numConta, Double saldo) {
		super();
		this.numAg = numAg;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void setNumAg(Integer numAg) {
		this.numAg = numAg;
	}
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double depositarValor(double valor) {
		this.saldo += valor;
		return saldo;
		
	}

	@Override
	public double sacarValor(double valor) {
		this.saldo -= valor;
		return this.saldo;
	}

	@Override
	public String toString() {
		return "Conta [numAg=" + numAg + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
	
	
}
