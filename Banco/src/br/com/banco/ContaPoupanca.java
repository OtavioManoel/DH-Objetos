package br.com.banco;

public class ContaPoupanca extends Contas {
	
	public ContaPoupanca(double id, Cliente cliente) {
		super(id, cliente);
	}
	
	public void recolherJuros() {
		if (this.getSaldo()<=0) {
			System.out.println("N�o tem juros para coletar");
		} else {
			double juros = this.getSaldo()*0.1;
			this.setSaldo(this.getSaldo() - juros);
			System.out.println("Voc� retirou um juros de: " + juros + " Reais | Seu saldo atual � de: " + this.getSaldo());
		}
	}
	
}
