package olamundo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 1001;
		System.out.println("Olá Mundo, somos a recode pro " + numero);
		numero = 1990;
		System.out.println(numero);
		
		for(int i = 0; i <= 15; i++) {
			System.out.println((i + i) + "° Numero");
		}
		for(int i = 15; i >= 0; i--) {
			System.out.println(i + "° Numero");
		}
		
		int [] vetorTeste = {2,5,7,9,8,11,85,100,25};
		for(int i = 0; i < vetorTeste.length; i++) {
			System.out.println(vetorTeste[i]);
		}
	}

}
