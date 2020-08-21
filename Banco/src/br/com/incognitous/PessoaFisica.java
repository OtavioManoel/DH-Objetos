package br.com.incognitous;

import java.time.LocalDate;

public class PessoaFisica extends Funcionario {
	
	public double nit;
	
	public PessoaFisica(String enderco, String nome, double cpf, String email, int setor, LocalDate dataDeAdmissao,
			double salario, double nit) {
		super(enderco, nome, cpf, email, setor, dataDeAdmissao, salario);
		this.nit = nit;
		}
	
	public void receberBonificacao () {
		if(this.getSetor() > 2) {
			System.out.println("voce não é Gerente ou Supervisor");
		} else if (this.getSetor() == 1) {
			this.setSalario(this.getSalario()*1.12);
			System.out.println("Você recebeu um bonus! novo salario: " + this.getSalario());
		} else {
			this.setSalario(this.getSalario()*1.08);
			System.out.println("Você recebeu um bonus! novo salario: " + this.getSalario());
		}
	}
	public void demitir(Funcionario funcionario) {
		if (funcionario.getSetor()==1) {
			System.out.println("não tem autorização para demitir esse funcionario");
		} else if (this.getSetor() > 2 || funcionario.getSetor()<=2){
			System.out.println("não tem autorização para demitir esse funcionario");
		}else {
			funcionario.setDataDeDemissao(LocalDate.now());
			System.out.println(funcionario.getNome() + " Foi demitido");
		}
	}
	
	public void reajusteSalario(double novoSalario, Funcionario funcionario) {
		if (this.getSetor() != 1 || funcionario.getSetor() == 1) {
			System.out.println("Erro, acesso negado, ou voce não é gerente ou está tentando aumentar o salário de um");
		} else if (novoSalario <= funcionario.getSalario()) {
			System.out.println("Você não pode diminuir o salário");
		} else {
			funcionario.setSalario(novoSalario);
			System.out.println("O salário de " + funcionario.getNome() + " foi atualizado para " + funcionario.getSalario());
		}
	}
	//Get Set
	public double getNit() {
		return nit;
	}

	public void setNit(double nit) {
		this.nit = nit;
	}
}
