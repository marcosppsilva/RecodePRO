package principal;

public class Caixa {

	private double saldo = 100;
	
	public void setSaldo(double value) {
		
		saldo += value;
	}
	
	void depositaDinheiro(double valor) {
		saldo = saldo + valor;
	}
	
	void sacarDinheiro(double valor) {
		saldo = saldo - valor;
	}
	
	double extrato() {
		return saldo;
	}
	
}
