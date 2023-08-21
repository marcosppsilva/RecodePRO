package principal;

import java.util.Scanner;

public class tiragemGenero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int maiorIdade = 0,idade, maior, homens = 0, mjovem, idadeHomens = 0, sex, menorIdade = 150;
		double mediaIdHomens;
		String continua = "s";
		
		do {
			System.out.println("Qual o seu gênero? [1 - Masc/ 2 - Fem]");
			sex = teclado.nextInt();
			
			System.out.println("Qual a sua idade?");
			idade = teclado.nextInt();
			
			if(sex == 1) {
				maiorIdade = idade;
			}
			
			if(sex == 1) {
				homens = homens +1;
				idadeHomens = idadeHomens + idade;
			}
			
			if((sex == 2) && (idade < menorIdade)) {
				menorIdade = idade;
			}
			
			System.out.println("Deseja cadastrar mais alguém?");
			continua = teclado.next();
		}
		while (continua.equals("s"));
		
		System.out.println("A maior idade digitada foi " + maiorIdade);
		System.out.println("Foram cadastrados " + homens + " homens");
		System.out.println("A mulher mais jovem tem " + menorIdade);
		
		mediaIdHomens = idadeHomens / homens;
		
		System.out.println("A média da idade dos homens foi de " + mediaIdHomens);
	}

}
