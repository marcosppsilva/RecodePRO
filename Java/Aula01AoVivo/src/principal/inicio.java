package principal;

import java.util.Random;

public class inicio {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo");
		
		int a = 10;
		
		double b = 125;
				
		String c = "Recode";
		
		double d = 300.123456;
		
		Random rand = new Random();
		
		int ale;
		
		//float salarioMinimo = 1500.78f; 
		
		double soma = a + b;
		
		System.out.println("A soma dos valores = " + soma);
		
		/*  %.2f%n 
		 * 
		 *  A primeira parte sendo o %.2f será o número de casas decimais que será exibido após a virgula.
		 *  A segunda parte %n é para dar quebra de linha ja que para exibir dessa forma tem de usar o printf
		 *  
		 *  Para float não deixa colocar valor quebrado mas para double deixa
		 *  
		 *  */
		
		System.out.printf("Valor de D = %.4f%n", d);
		
		System.out.printf("%.2f%n", Math.PI);
		
		for(int i = 0; i <= 5; i++) {
			ale = rand.nextInt(60);
			
			if (ale == 0) {
				ale += 1;
			}
			
			System.out.println(i + 1 + "° Número Sorteado: " + ale);
		}
		
	}

}
