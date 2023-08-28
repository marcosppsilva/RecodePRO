package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caixa caixa1 = new Caixa();
		
		System.out.println("Valor em conta R$" + caixa1.extrato());
		caixa1.depositaDinheiro(250);
		System.out.println("Valor em conta R$" + caixa1.extrato());
		caixa1.sacarDinheiro(150);
		System.out.println("Valor em conta R$" + caixa1.extrato());
		caixa1.setSaldo(300);
		System.out.println("Valor em conta R$" + caixa1.extrato());
		
		
		Pessoa pessoa01 = new Pessoa();
		Pessoa pessoa02 = new Pessoa();
		Veiculo veiculo01 = new Veiculo();
		
		pessoa01.setNome("Marcos Paulo");
		pessoa01.setRg("25668954");
		pessoa01.setCpf("13691493793");
		pessoa01.setSalario(2250);
		
		System.out.println("Nome: " + pessoa01.getNome());
		System.out.println(pessoa01.getRg());
		System.out.println(pessoa01.getCpf());
		System.out.println(pessoa01.getSalario());
		
		pessoa02.setNome("Fabiano");
		pessoa02.setRg("00643516");
		pessoa02.setCpf("23469874521");
		pessoa02.setSalario(1800);
		
		System.out.println("Nome: " + pessoa02.getNome());
		System.out.println(pessoa02.getRg());
		System.out.println(pessoa02.getCpf());
		System.out.println(pessoa02.getSalario());
		
		
		veiculo01.set
		
		
	}

}
