package principal;

import java.util.Scanner;

public class compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int quant, i;
		double total = 0, totalfinal = 0, valor, desconto = 0;
		
		System.out.println("Indique a quantidade de produtos");
		quant = teclado.nextInt();
		
		for(i = 1; i <= quant; i++) {
			System.out.println("Informe o valor do " + i + "° produto");
			valor = teclado.nextDouble();
			total = total + valor;
		}
		
		desconto = ((total * 18) / 100);
		totalfinal = total - desconto;
		
		System.out.printf("O valor da compra foi de R$"+ totalfinal);
		System.out.println("O valor de Imposto referente a 18% foi de R$"+ desconto);
		
		teclado.close();
	}

}
