package model.entities;

public class PessoaFisica extends Pessoa{

	private ContaPF contaPF;
 	
	private String cpf;
	private String rg;
	private String cargo;
	private Double salario;
	
	
	public PessoaFisica() {
		super();
	}




	public PessoaFisica(Integer idPessoa, String nome, String email, Telefone telefone, Endereco endereco,
			ContaPF contaPF, String cpf, String rg, String cargo, Double salario) {
		super(idPessoa, nome, email, telefone, endereco);
		this.contaPF = contaPF;
		this.cpf = cpf;
		this.rg = rg;
		this.cargo = cargo;
		this.salario = salario;
	}




	public ContaPF getContaPF() {
		return contaPF;
	}


	public void setContaPF(ContaPF contaPF) {
		this.contaPF = contaPF;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}




	@Override
	public String toString() {
		return super.toString() + "PessoaFisica [contaPF=" + contaPF + ", cpf=" + cpf + ", rg=" + rg + ", cargo=" + cargo + ", salario="
				+ salario + "]";
	}
	
	
	
	
	
}
