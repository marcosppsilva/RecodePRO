package principal;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nomes = new ArrayList<>(); 
		
		nomes.add("Marcos Paulo");
		nomes.add("Fabiano");
		nomes.add("Patricia");
		nomes.add("Maria de Lourdes");
		nomes.add("Aylén Arancibia");
		nomes.add("Jorge");
		
		
		//primeira forma de ver dados de arraylist
		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println(" ");
		nomes.remove(1);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome: " + nomes.get(i));
		}
		
		System.out.println(" ");
		nomes.remove("Jorge");
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome: " + nomes.get(i));
		}
	}
	
	

}
