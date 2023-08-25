package principal;

public class Produto {
	/*Atributos pois só podem ser usadas dentro desta classe
		void apenas faz, não retorna
	*/
	
	String nome;
	double preco;
	int quantidade;
	
	
	void adicionar(int qtd) {
		
		quantidade += qtd;
	}
	
	void remover(int qtd) {
		
		quantidade -= qtd;
	}
	
	
	
	double total() {
		return preco * quantidade;
	}

}
