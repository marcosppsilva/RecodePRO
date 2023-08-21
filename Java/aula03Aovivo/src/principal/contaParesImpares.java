package principal;

import java.util.Scanner;

public class contaParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int i, num1, num2, totpar =0, totimpar = 0;
		
		System.out.println("Indique o número inicial");
		num1 = teclado.nextInt();
		
		System.out.println("Indique o número final");
		num2 = teclado.nextInt();
		
		if((num1 < num2) && (num1 > 0)){
			
			for(i = num1; i <= num2; i++) {
				if(i % 2 == 0) {
					totpar = totpar + 1;
				} else {
					totimpar = totimpar + 1;
				}
			}
			
			System.out.println("O contador foi de " + num1 + " até " + num2);
			System.out.println("Foram encontrados " + totpar + " números Pares");
			System.out.println("Foram encontrados " + totimpar + " números Impares");
			
		} else {
			System.out.println("Números indicados inválidos. O primeiro número precisa ser maior do que zero e menor do que o ultimo número");
		}	
		
	}

}
