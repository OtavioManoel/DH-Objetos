package br.com.incognitous;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
//		
		PessoaJuridica maicon = new PessoaJuridica("Endere�o","maicon",78785,"otavio@emial",8,LocalDate.of(2004, 10, 30),500,4871);
		PessoaJuridica julia = new PessoaJuridica("Endere�o","julia",451321,"otavio@emial",9,LocalDate.of(2004, 10, 30),500,781548);
		PessoaJuridica maria = new PessoaJuridica("Endere�o","maria",9643,"otavio@emial",10,LocalDate.of(2020, 6, 30),500,78459);
		PessoaFisica junior = new PessoaFisica("Endere�o","junior",563244,"otavio@emial",1,LocalDate.of(2004, 10, 30),500,543564);
		PessoaFisica carlos = new PessoaFisica("Endere�o","carlos",435565,"otavio@emial",2,LocalDate.of(1100, 1, 1),500,35461);
		PessoaFisica otavio = new PessoaFisica("Endere�o","otavio",5656,"otavio@emial",3,LocalDate.of(2004, 10, 30),500,569771);
		
//		System.out.println(junior.getNit());
//		System.out.println(maicon.getCnpj());
//		
//		System.out.println(maicon.getSalario());
//		maria.receberSalarioBase(6000);
//		System.out.println(maria.getSalario());
//		carlos.receberSalarioBase(3000);
//		System.out.println(carlos.getSalario());
//		
//		otavio.consultarContraCheque();
//		julia.consultarContraCheque();
//		
//		junior.receberBonificacao();
//		carlos.receberBonificacao();
//		otavio.receberBonificacao();
		
		carlos.pedirFerias();
		carlos.pedirFerias();
		maria.pedirFerias();
		
		junior.demitir(maicon);
		carlos.demitir(junior);
		
		junior.reajusteSalario(50, otavio);
		junior.reajusteSalario(550, otavio);
		carlos.reajusteSalario(700000, junior);
		
		carlos.demitir(junior);
		carlos.demitir(maria);
		
		julia.pedirDemissao();
		otavio.solicitarAumento(600);
		
		carlos.trabalhar();
		otavio.trabalhar();
	}
	
}
// setor 1 = Gerente
// setor 2 = Supervisor
// setor 3 = Outros