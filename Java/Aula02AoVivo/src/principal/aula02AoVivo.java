package principal;

import java.util.Scanner;

public class aula02AoVivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double minutos, valorFinal, base;
		base = 50;
		
		int numFuncionario, horasTrab;
		double valorHora, salarioFinal;

		/*System.out.println("Quantos minutos foram consumidos?");
		minutos = teclado.nextDouble();

		if (minutos > 100) {
			valorFinal = base + ((minutos - 100) * 2);
			System.out.println("O valor de conta a pagar será R$" + valorFinal);
		} else {
			System.out.println("O valor de conta a pagar será R$" + base);
		}*/
		
		System.out.println(10 > 5 * 2);
		
		System.out.println("Informe o numero do funcionário");
		numFuncionario = teclado.nextInt();
		System.out.println("Informe as horas trabalhadas pelo funcionário no mês");
		horasTrab = teclado.nextInt();
		System.out.println("Informe o valor por hora trabalhada do funcionário");
		valorHora = teclado.nextDouble();
		
		salarioFinal = horasTrab * valorHora;
		
		System.out.println("O funcionário " + numFuncionario + " no mês atual trabalhou " + horasTrab + " o valor da sua hora é " + valorHora + " e seu salário final foi de R$ %.2f%" + salarioFinal);

		teclado.close();
	}

}
