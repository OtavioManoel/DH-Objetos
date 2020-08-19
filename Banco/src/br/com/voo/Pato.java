package br.com.voo;

public class Pato implements Voador{
	
	private int energia;
	
	public Pato() {
		this.energia = 100;
	}

	@Override
	public void voar() {
		if (energia<5) {
			System.out.println("Não tenho energia suficiente para voar");
		} else {
			this.setEnergia(getEnergia() - 5);
			System.out.println("Estou voando como um pato");
		}
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	

}
