package estoque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto01 = new Produto();
		
		produto01.setNome("Óleo");
		produto01.setPreco(4.86);
		produto01.setQuantidade(45);
		
		System.out.println("Produto: " + produto01.getNome());
		System.out.println("Preço: " + produto01.getPreco());
		System.out.println("Quantidade: " + produto01.getQuantidade());
		
		produto01.adicionaProd(20);
		produto01.removerProd(5);
		
		System.out.println("Produto: " + produto01.getNome());
		System.out.println("Preço: " + produto01.getPreco());
		System.out.println("Quantidade: " + produto01.getQuantidade());
		System.out.println("Valor do Estoque: " + produto01.valorTotalEstoque());
		
	}

}
