package br.com.banco;

public class ContaCorrente extends Contas {
	
	private boolean chequeEspecial;

	public ContaCorrente(double id, Cliente cliente) {
		
		super(id, cliente);
		this.chequeEspecial=false;
	}
	
	public void depositarCheque(double valor, String banco, String data) {
		if (valor <= 0) {
			System.out.println("Valor invalido");
		} else {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Sucesso! Dinheiro recebido na data de: " + data + " com o valor de: " + valor + " Do Banco " + banco);
			System.out.println("Seu saldo atual é de: " + this.getSaldo());
		}
	}
	@Override
	public void sacar(double saque) {
		if (saque > this.getSaldo() && !(this.chequeEspecial)) {
			this.setSaldo(getSaldo() - saque);
			this.setChequeEspecial(true);
			System.out.println("Saque feito em cheque especial, seu saldo é: " + this.getSaldo());
		} else if (this.chequeEspecial) {
			System.out.println("Operação negada");
		} else {
			this.setSaldo(getSaldo() - saque);
			System.out.println("Saque feito, seu saldo é: " + this.getSaldo());
		}
	}
	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

}
