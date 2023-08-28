package principal;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double soma = 0, total = 0;
		int quantidade = 0;
				
		System.out.println("Quantos produtos foram comprados?");
		quantidade = teclado.nextInt();
		
		double [] acumulador = new double[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			
			System.out.println(String.format("Digite o valor do %s° produto", i + 1));
			acumulador[i] = teclado.nextDouble();
			soma += acumulador[i];
		}
		
		total = soma * 5.18;
		String mensagem = (total > 3000) ? "Pagará 20% de Imposto" : "Isento de Imposto";
		System.out.println(String.format("O total da sua compra foi R$ %s", total)+ " " + mensagem);
	}

}
