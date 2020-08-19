package br.com.voo;

public class SuperHomem implements Voador {
	
	private int experiencia;
	
	public SuperHomem() {
		super();
		this.experiencia = 0;
	}

	@Override
	public void voar() {
		this.setExperiencia(this.getExperiencia() + 3);
		System.out.println("Estou voando como um campeão");
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}
