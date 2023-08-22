package principal;

import java.util.Scanner;

public class exerciciosArray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Coleção ordenada de elementos
		/*
		String [] stack = {"Java", "PHP", "JavaScript", "Python"};
		
		for (int i = 0; i < stack.length; i++) {
		System.out.println(stack[i]);
		}*/
		
		int tamanho = 5;
		
		String[] nome = new String[tamanho];
		double[] salario = new double[tamanho];
		double reajuste;
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Nome do " + (i+1) + "° Funcionario");
			nome[i] = teclado.nextLine();
			System.out.println("Salário: R$");
			salario[i] = teclado.nextDouble();
			teclado.nextLine();
		}
		
		System.out.println("== Informe o valor do reajuste (%): ==");
		reajuste = teclado.nextDouble();
		System.out.println("== Informações Atualizadas ==");
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Nome: " + nome[i] + " - Salario: " + (salario[i] += (reajuste * salario[i] / 100)));
		}
		
		teclado.close();
	}

}
