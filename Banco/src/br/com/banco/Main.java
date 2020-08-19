package br.com.banco;

public class Main {

	public static void main(String[] args) {
		Cliente otavio = new Cliente(18,"Miranda","12563879","10395878772");
		Cliente joao = new Cliente(19,"Feijao","7525645","12542572");
		Cliente maria = new Cliente(20,"Antonieta","2323231","101213143");
		Cliente chico = new Cliente(21,"Bento","175144","104542");
		Cliente soraia = new Cliente(23,"Simone","145131659","64345248772");
		Cliente monica = new Cliente(24,"Souza","213123","102377211231");
		
		ContaPoupanca contaOtavio = new ContaPoupanca(18,otavio);
		ContaPoupanca contaJoao = new ContaPoupanca(19,joao);
		ContaPoupanca contaMaria = new ContaPoupanca(20,maria);
		ContaCorrente contaChico = new ContaCorrente(20,chico);
		ContaCorrente contaSoraia = new ContaCorrente(20,soraia);
		ContaCorrente contaMonica = new ContaCorrente(20,monica);
		
		//Otavio
		System.out.println("###### Otavio ######");
		contaOtavio.depositar(5000);
		contaOtavio.sacar(780);
		contaOtavio.consultarSaldo();
		contaOtavio.recolherJuros();
		System.out.println("----------------------------------------------");
		//João
		System.out.println("###### João ######");
		contaJoao.depositar(0);
		contaJoao.sacar(80);
		contaJoao.consultarSaldo();
		contaJoao.recolherJuros();
		System.out.println("----------------------------------------------");
		//Maria
		System.out.println("###### Maria ######");
		contaMaria.depositar(700);
		contaMaria.sacar(800);
		contaMaria.consultarSaldo();
		contaMaria.recolherJuros();
		System.out.println("----------------------------------------------");
		//Chico
		System.out.println("###### Chico ######");
		contaChico.depositar(700);
		contaChico.sacar(800);
		contaChico.consultarSaldo();
		contaChico.depositarCheque(500,"Santander","24/10/2020");
		System.out.println("----------------------------------------------");
		//Soraia
		System.out.println("###### Soraia ######");
		contaSoraia.depositar(700);
		contaSoraia.sacar(800);
		contaSoraia.sacar(800);
		contaSoraia.consultarSaldo();
		contaSoraia.depositarCheque(500,"Santander","24/10/2020");
		System.out.println("----------------------------------------------");
		//Mônica
		System.out.println("###### Mônica ######");
		contaMonica.depositar(100);
		contaMonica.sacar(50);
		contaMonica.consultarSaldo();
		contaMonica.depositarCheque(300,"Santander","24/10/2020");
		System.out.println("----------------------------------------------");
	}
}
