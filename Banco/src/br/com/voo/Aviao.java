package br.com.voo;

public class Aviao implements Voador{
	
	private int horasDeVoo;
	
	
	public Aviao() {
		this.horasDeVoo = 0;
	}


	@Override
	public void voar() {
		this.setHorasDeVoo(this.getHorasDeVoo() + 13);
		System.out.println("Estou voando como um avião, e tenho " + this.getHorasDeVoo() + " Horas de voo");
	}

	public int getHorasDeVoo() {
		return horasDeVoo;
	}


	public void setHorasDeVoo(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

}
