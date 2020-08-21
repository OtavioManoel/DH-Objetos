package br.com.incognitous;

import java.util.Random;
import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario {
	public String enderco;
	public String nome;
	public double cpf;
	public String email;
	public int setor;
	public LocalDate dataDeAdmissao;
	public LocalDate dataDeDemissao;
	public double salario;
	public boolean ferias;
	public LocalDate dataFerias;
	
	
	public Funcionario(String enderco, String nome, double cpf, String email, int setor, LocalDate dataDeAdmissao, double salario) {
		this.enderco = enderco;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.dataDeDemissao = null;
		this.salario = salario;
		this.ferias = false;
		this.dataFerias = LocalDate.of(1000, 1, 1);
	}
	
	public void receberSalarioBase( double salario) {
		this.setSalario(salario);
		System.out.println("Salario base definido: " + this.getSalario());
	}
	
	public void consultarContraCheque() {
		System.out.println("Contra-Cheque: " + this.getSalario());
	}
	public void trabalhar() {
		if (this.isFerias()) {
			System.out.println("Você esta de ferias");
		} else {
			System.out.println("Trabalhando...");
		}
	}
	
	public void pedirDemissao() {
		if (this.getDataDeAdmissao()!=null) {
			System.out.println("Erro, não trabalha aqui");
		} else {
			this.setDataDeDemissao(LocalDate.now());
			System.out.println("Até logo campeão");
		}
	}
	
	public void solicitarAumento(double aumento) {
		Random gerador = new Random();
		if (gerador.nextInt(2)==0) {
			System.out.println("Aumento negado");
		} else {
			this.setSalario(this.getSalario()+ aumento);
			System.out.println("Aprovado! seus salario novo é " + this.getSalario());
		}
	}
	public void pedirFerias() {
		Period periodoUltimaFerias = Period.between(this.getDataFerias(),LocalDate.now());
		Period periodoDeEmpresa = Period.between(this.getDataDeAdmissao(),LocalDate.now());
		if (this.isFerias()) {
			System.out.println("Já esta de ferias");
		} else if (periodoDeEmpresa.toTotalMonths() < 11 ) {
			System.out.println("Está a pouco temo na empresa, não pode pedir ferias");
		} else if(periodoUltimaFerias.toTotalMonths() < 4) {
			System.out.println("Negado, você tirou ferias a pouco tempo");
		} else {
			this.setFerias(true);
			this.setDataFerias(LocalDate.now());
			System.out.println("Boas ferias!!");
		}
	}
	
	// Get Set
	public String getEnderco() {
		return enderco;
	}
	public void setEnderco(String enderco) {
		this.enderco = enderco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public LocalDate getDataDeDemissao() {
		return dataDeDemissao;
	}
	public void setDataDeDemissao(LocalDate dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isFerias() {
		return ferias;
	}
	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}

	public LocalDate getDataFerias() {
		return dataFerias;
	}

	public void setDataFerias(LocalDate dataFerias) {
		this.dataFerias = dataFerias;
	}
	
}
