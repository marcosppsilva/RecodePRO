package estoque;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotalEstoque() {
		return quantidade * preco;
	}
	
	public void adicionaProd(int quant) {
		quantidade = quantidade + quant;
	}
	
	public void removerProd(int quant) {
		quantidade = quantidade - quant;
	}
	
}
