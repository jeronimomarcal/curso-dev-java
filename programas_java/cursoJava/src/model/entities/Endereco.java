package model.entities;

public class Endereco {
	
	private String cep;
	private String uf;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String complemento;
	private String numero;
	
	public Endereco() {
		super();
	}

	public Endereco(String cep, String uf, String cidade, String bairro, String logradouro, String complemento,
			String numero) {
		super();
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", uf=" + uf + ", cidade=" + cidade + ", bairro=" + bairro + ", logradouro="
				+ logradouro + ", complemento=" + complemento + ", numero=" + numero + "]\n";
	}
	
	

}
