package principal;

import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int i;
		int num;
		
		System.out.println("Informe um número");
		num = teclado.nextInt();
		
		try {
		for (i = 1; i <= num; i++) {
			System.out.println("Número " + i);
		}
		}
		catch(InputMismatchException exception) {
			System.out.println("Inválido, só pode ser indicado números");
		}
	}

}
