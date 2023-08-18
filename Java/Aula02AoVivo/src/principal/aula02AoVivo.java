package principal;

import java.util.Scanner;

public class aula02AoVivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double minutos, valorFinal, base;
		base = 50;

		System.out.println("Quantos minutos foram consumidos?");
		minutos = teclado.nextDouble();

		if (minutos > 100) {
			valorFinal = base + ((minutos - 100) * 2);
			System.out.println("O valor de conta a pagar será R$" + valorFinal);
		} else {
			System.out.println("O valor de conta a pagar será R$" + base);
		}

		teclado.close();
	}

}
