package br.com.incognitous;

import java.time.LocalDate;

public class PessoaJuridica extends Funcionario {
	public double cnpj;
	public PessoaJuridica(String enderco, String nome, double cpf, String email, int setor, LocalDate dataDeAdmissao,
			double salario, double cnpj) {
		super(enderco, nome, cpf, email, setor, dataDeAdmissao, salario);
		this.cnpj = cnpj;
		}

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}
	
}
