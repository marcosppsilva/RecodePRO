package principal;

public class Carro {

	String modelo;
	String fabricante;
	int ano;
	
	void andar() {
		System.out.println("O carro está andando");
	}
	
	void parar() {
		System.out.println("O carro parou");
	}
	
	double idade(int atual) {
		return atual - ano;
	}
	
	
}
