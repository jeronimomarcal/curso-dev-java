package model.entities;

public class Pessoa {

	private Integer idPessoa;
	private String nome;
	private String email;
	private Telefone telefone;
	private Endereco endereco;
	
	
	
	
	public Pessoa() {
		super();
	}
	
	
	public Pessoa(Integer idPessoa, String nome, String email, Telefone telefone, Endereco endereco) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}


	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", endereco=" + endereco + "]\n";
	}
	
	
	
	
}
