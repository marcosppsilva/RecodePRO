package aula02;

import java.util.Scanner;

public class variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		valor = 5;
		double troco = 1.55;
		
		System.out.println(valor);
		System.out.println(troco);
		System.out.println(valor - troco);
		
		String titulo;
		titulo = "Olá, eu sou uma String";
		
		System.out.println(titulo);
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, soma;
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println(soma);
		entrada.close();
	}

}
