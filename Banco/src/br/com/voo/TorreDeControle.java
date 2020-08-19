package br.com.voo;

public class TorreDeControle {
	private Voador[] voadores;
	

	public TorreDeControle(Voador[] voadores) {
		this.voadores = voadores;
	}
	
	public void voemTodos() {
		for( int i = 0; i < this.voadores.length; i++ ) {
			this.voadores[i].voar();
		}
		
	}
	
	public Voador[] getVoadores() {
		return voadores;
	}

	public void setVoadores(Voador[] voadores) {
		this.voadores = voadores;
	}
}
