package principal;
import java.util.Scanner;

public class ajusteSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double[] salario = new double[5];
		String[] funcionarios = new String[5];
		double ajuste = 0;
		
		for(int i = 0; i < 5; i++) {

			System.out.println("Informe o nome do " + (i+1) + "° Funcionário");
			funcionarios[i] = teclado.nextLine();
			
			System.out.println("Informe o Salário do " + (i+1) + "° Funcionário");
			salario[i] = teclado.nextDouble();
			teclado.nextLine();
		}
		
		ajuste = 15;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("O Salário da(o) Funcionária(o) " + funcionarios[i] + " com reajuste de " + ajuste + "% é de R$" + (salario[i] = salario[i] + (salario[i] * (ajuste /100)))); 
		}
		
		
		
		teclado.close();

	}

}
