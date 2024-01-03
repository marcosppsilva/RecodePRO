package principal;

public class ComprarCarro {

	public static void main(String[] args) {
		System.out.println("CUSTO CARRO");
		double custoFabrica, percDistribuidor, imposto, valorFinal;
		
		custoFabrica = 8579;
		percDistribuidor = custoFabrica * 0.28;
		imposto = custoFabrica * 0.45;
		valorFinal = (custoFabrica + percDistribuidor + imposto) * 2;
		System.out.printf("%n O custo de Fabricação do carro é de R$%.2f%n A porcentagem do Distribuidor é de R$%.2f%n O valor dos impostos é de R$%.2f%n O valor final do carro é de R$%.2f%n", custoFabrica, percDistribuidor, imposto, valorFinal);
		

	}

}
