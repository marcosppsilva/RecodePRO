package principal;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "";
		int idade = 0;
		
		nome = "Marcos Paulo";
		idade = 33;
		
		if(idade < 18) {
			System.out.println("Olá " + nome + " você tem "+ idade + " anos. Sendo assim, tem menos de 18 anos.");
		} else {
			System.out.println("Olá " + nome + " você tem "+ idade + " anos. Sendo assim, tem mais de 18 anos.");
		}
		
	}

}
