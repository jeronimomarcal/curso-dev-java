package model.entities;

public class PessoaJuridica extends Pessoa{
	
	private ContaPJ contaPJ;
	
	private String tipoEmpresa;
	private String cnpj;
	private String inscricaoEstadual;
	private String site;
	
	
	
	
	public PessoaJuridica() {
		super();
	}
	
	

	public PessoaJuridica(Integer idPessoa, String nome, String email, Telefone telefone, Endereco endereco,
			ContaPJ contaPJ, String tipoEmpresa, String cnpj, String inscricaoEstadual, String site) {
		super(idPessoa, nome, email, telefone, endereco);
		this.contaPJ = contaPJ;
		this.tipoEmpresa = tipoEmpresa;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.site = site;
	}



	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public ContaPJ getContaPJ() {
		return contaPJ;
	}

	public void setContaPJ(ContaPJ contaPJ) {
		this.contaPJ = contaPJ;
	}



	@Override
	public String toString() {
		return super.toString() +"PessoaJuridica [contaPJ=" + contaPJ + ", tipoEmpresa=" + tipoEmpresa + ", cnpj=" + cnpj
				+ ", inscricaoEstadual=" + inscricaoEstadual + ", site=" + site + "]\n";
	}



	
	
	
	

}
