package br.com.banco;


public abstract class Contas {
	
	private double id,saldo;
	private Cliente cliente;
	
	public Contas(double id, Cliente cliente) {
		super();
		this.id = id;
		this.saldo = 0;
		this.cliente = cliente;
	}
	
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Dinheiro depositado, Saldo atual: " + this.getSaldo());
	}
	public void sacar(double saque) {
		if (this.getSaldo() < saque) {
			System.out.println("Saldo insuficiente, Você tem: " + this.getSaldo());
		} else {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saque realizado, dinheiro atual: " + this.getSaldo());
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo é de: " + this.getSaldo() + " Reais" );
	}
	
	// set e get 
	public double getIdConta() {
		return id;
	}

	public void setIdConta(double id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
