package principal;

import java.util.Scanner;

public class AluguelCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double km, dias, valorFinal, valorkm, valordias;
		
		Scanner digita = new Scanner(System.in);
		
		System.out.println("CALCULA VALOR DE ALUGUEL DE CARRO");
		
		System.out.println("Quantos km foram percorridos com o carro?");		
		km = digita.nextDouble();
		
		System.out.println("Por quantos dias o carro foi alugado?");		
		dias = digita.nextDouble();
		
		valordias = dias * 90;
		valorkm = km * 0.20;
		valorFinal = valordias + valorkm;
		
		System.out.println("O valor dos km percorridos foi " + valorkm);
		System.out.println("O valor pelos dias alugados foi  " + valordias);
		System.out.println("O valor total do aluguel foi " + valorFinal);
		
		
		
		digita.close();
	}

}
