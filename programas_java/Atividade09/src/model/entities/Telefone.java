package model.entities;

public class Telefone {
	
	private String telResidencial;
	private String telCelular;
	
	
	
	
	public Telefone() {
		super();
	}


	public Telefone(String telResidencial, String telCelular) {
		super();
		this.telResidencial = telResidencial;
		this.telCelular = telCelular;
	}


	public String getTelResidencial() {
		return telResidencial;
	}
	
	
	public void setTelResidencial(String telResidencial) {
		this.telResidencial = telResidencial;
	}
	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}


	@Override
	public String toString() {
		return "Telefone [telResidencial=" + telResidencial + ", telCelular=" + telCelular + "]\n";
	}
	
	

}
