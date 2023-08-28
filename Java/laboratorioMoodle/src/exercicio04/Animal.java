package exercicio04;

public class Animal {

	String nome = "";
	String [] tipo = {"Cachorro","Gato","Peixe"};
	
	private String[] habitat = {"Água", "Terra"};
	private String[] dieta = {"Carnivoro", "Herbivoro"};
	
	
	void defineTipo(String mostraTipo) {
		for(int i = 0; i < 3; i++) {
			if(mostraTipo != "Cachorro" || mostraTipo != "Gato" || mostraTipo != "Peixe") {
				mostraTipo = tipo[2];
			}
		}
	}
	
	void getTipo() {
		
	}
}
