package principal;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner digita = new Scanner(System.in);
		
		System.out.println("Indique o nome do funcionário");
		String nome = digita.nextLine();
		
		System.out.println("Indique quantas horas o funcionário trabalha");
		int horas = digita.nextInt();
		
		digita.nextLine();
		
		System.out.println("Indique o valor da hora");
		double valorHora = digita.nextDouble();
		
		double salario = (valorHora * horas) * 30;
		
		System.out.println("O funcionário " + nome + " de numero x receberá R$" + salario + " de salário");
		
		digita.close();
	}

}
