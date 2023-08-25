package principal;

public class Main {

	public static void main(String[] args) {
		// Atributos pois só podem ser usadas dentro desta classe
		
		Produto feijao = new Produto();
		Produto arroz = new Produto();
		Produto macarrao = new Produto();
		
		feijao.nome = "Carioca";
		feijao.preco = 12;
		feijao.quantidade = 30;
		
		//feijao.adicionar(50);
		
		feijao.adicionar(5);
		
		System.out.println(feijao.nome);
		System.out.println(feijao.quantidade);
		System.out.println(feijao.preco);
		System.out.println(feijao.total());

	}

}
