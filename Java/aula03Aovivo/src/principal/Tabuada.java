package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor, adi, sub, mult, div;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("TABUADA");
		
		System.out.println("Indique o valor que pretende saber a tabuada");
		valor = teclado.nextInt();
		
		System.out.println("ADIÇÃO");
		for(int i = 1; i <= 10; i++) {
			adi = valor + i;
			System.out.println(valor + " + " + i + " = " + adi);
		}
		
		System.out.println("SUBTRAÇÃO");
		for(int i = 1; i <= 10; i++) {
			sub = valor - i;
			System.out.println(valor + " - " + i + " = " + sub);
		}
		
		System.out.println("MULTIPLICAÇÃO");
		for(int i = 1; i <= 10; i++) {
			mult = valor * i;
			System.out.println(valor + " * " + i + " = " + mult);
		}
		
		System.out.println("DIVISÃO");
		for(int i = 1; i <= 10; i++) {
			div = valor / i;
			System.out.println(valor + " / " + i + " = " + div);
		}
		
		teclado.close();

	}

}
