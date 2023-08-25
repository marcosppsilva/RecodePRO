package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro veiculo = new Carro();
		
		veiculo.ano = 1990;
		veiculo.fabricante = "Mercedes";
		veiculo.modelo = "Classe A";
		
		veiculo.andar();
		
		veiculo.parar();
		
		System.out.println("Ano: " + veiculo.ano);
		System.out.println("Fabricante: " + veiculo.fabricante);
		System.out.println("Modelo: " + veiculo.modelo);
		System.out.println("O carro tem " + veiculo.idade(2023) + " anos");
		
		
		
	}

}
