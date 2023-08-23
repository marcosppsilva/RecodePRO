package principal;
import java.util.ArrayList;
import java.util.Scanner;

public class resolvendoProblemaNomeDuplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double[] salario = new double[5];
		String[] funcionarios = new String[5];
		
		for (int i = 0; i < 5; i++) {

			 

			System.out.println("Informe o nome do " + (i + 1) + "° Funcionário");

			funcionarios[i] = teclado.nextLine();

			

 

			System.out.print("Informe o Salário do " + (i + 1) + "° Funcionário");

			salario[i] = teclado.nextDouble();

			teclado.skip("\\R?");

		}

	}

}
