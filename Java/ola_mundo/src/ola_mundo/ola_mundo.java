package ola_mundo;

import java.util.Scanner;

public class ola_mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		int opcao;
	do {
		
	Scanner entrada = new Scanner(System.in);
	
	
	int numero;
	//int opcao;
	
	System.out.println("Escolha uma opção");
	System.out.println("1 - Para verificar Maioridade");
	System.out.println("2 - Para verificar Trimestre");
	System.out.println("3 - Tabuada de Multiplicação");
	System.out.println("4 - Contagem Crescente ou Contagem Decrescente");
	System.out.println("5 - Contagem de 1 a 10");
	System.out.println("6 - Para Encerrar Programa");
	opcao = entrada.nextInt();
	
	switch(opcao) {
	
	case 1: {
		
				System.out.println("Informe uma idade");
				numero = entrada.nextInt();
		
					if(numero < 18) {
						System.out.println("Você tem "+ numero + " anos e é menor de idade");
					} else {
						System.out.println("Você tem "+ numero + " anos e é maior de Idade");
					}
					break;
			}
	case 2: {
				System.out.println("Informe um número");
				numero = entrada.nextInt();
				
				if(numero <= 3) {
					System.out.println("Primeiro trimestre: Janeiro, Fevereiro e Março");
				} else if ((numero > 3) && (numero <= 6)) {
					System.out.println("Segundo trimestre: Abril, Maio e Junho");
				} else if ((numero > 6) && (numero <= 9)) {
					System.out.println("Terceiro trimestre: Julho, Agosto e Setembro");
				} else if ((numero > 9) && (numero <= 12)) {
					System.out.println("Terceiro trimestre: Outubro, Novembro e Dezembro");
				} else {
					System.out.println("Inválido, não existe trimestre com o número selecionado");
				}
				break;	
			}
	case 3: {
			
			System.out.println("Indique qual número pretende saber a tabuada de multiplicação");
			numero = entrada.nextInt();
			
				for(int i = 1; i <=10; i++) {
					System.out.println(i + " x " + numero + " = " + (i * numero));
				}
				break;
			}
	case 4: {
		
		System.out.println("Indique o número inicial");
		numero = entrada.nextInt();
		
		System.out.println("Indique o número final");
		int numero2 = entrada.nextInt();
		
			if(numero2 < numero) {
				
				for(int i = numero2; i >numero; i--) {
					System.out.println(i);
				}
				
			} else if(numero == numero2) {
				
				System.out.println("Os numeros digitados são iguais");
				
			} else {
				
				for(int i = numero; i <=numero2; i++) {
					System.out.println(i);
				}
				
			}			
			break;
		}
	case 5: {
		
		int i = 1;
		
		while(i <= 10)
				{
					System.out.println(i);
					i++;
				}
			break;
		}
	default: {
			System.out.println("Opção indicada inválida");
	}
	
	
	}
	
	entrada.close();
	
	} while(opcao <6);
	
	}
	

}
