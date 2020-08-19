package br.com.banco;

public class Cliente {
	
	private double id;
	private String sobrenome, rg, cpf;
	
	public Cliente(double id, String sobrenome, String rg, String cpf) {
		this.id = id;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
