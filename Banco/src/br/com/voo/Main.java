package br.com.voo;

public class Main {

	public static void main(String[] args) {
		
		Voador voador[] = new Voador[3];
		voador[0] = new Pato();
		voador[1] = new Aviao();
		voador[2] = new SuperHomem();
		
		voador[0].voar();
		voador[1].voar();
		voador[2].voar();
		System.out.println("-----------------------------------------");
		TorreDeControle c = new TorreDeControle(voador);
		c.voemTodos();
	}
}
