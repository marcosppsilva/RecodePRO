package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class agendaComArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<String> telefone = new ArrayList<>();
		
		nomes.add("Marcos Paulo");
		nomes.add("Fabiano");
		nomes.add("Patricia");
		nomes.add("Maria de Lourdes");
		nomes.add("João Costa");
		nomes.add("Jorge");
		
		telefone.add("935113477");
		telefone.add("999457635");
		telefone.add("999457635");
		telefone.add("999457635");
		telefone.add("999457635");
		telefone.add("999447565");
		
		System.out.println("====================AGENDA DIGITAL====================");
		System.out.println("APERTE A TECLA CORRESPONDENTE AO QUE PRETENDE");
		System.out.println("1 - PARA ADICIONAR UMA PESSOA A AGENDA");
		System.out.println("2 - PARA REMOVER UMA PESSOA A AGENDA");
		System.out.println("3 - PARA CONSULTAR TODOS OS NOMES");
		System.out.println("4 - PESQUISAR UM NOME");
		
		int op = teclado.nextInt();
		String continuar = "";
		
		switch(op) {
		case 1: {
			do {
				
				System.out.println("Indique o nome do contato");
				nomes.add(teclado.nextLine());
				teclado.skip("\\R?");
				
				System.out.println("Indique o número do contato");
				telefone.add(teclado.nextLine());
				teclado.skip("\\R?");
				teclado.nextLine();
				
				System.out.println("Adicionar outra Pessoa? [s/n]");
				continuar = teclado.next();
				
			} while (continuar.equals("s"));
		}
		break;
		
		case 3: {
			System.out.println("====================TODOS OS CONTATOS====================");
			System.out.println("Nome" + "Telefone");
			for(int i = 0; i < nomes.size(); i++) {
				System.out.println((i+1) + " - " + nomes.get(i));
			}
			break;
		}
			
		default: {
			System.out.println("Opção indicada inválida");
		}
		}
		
		
		
	}

}
