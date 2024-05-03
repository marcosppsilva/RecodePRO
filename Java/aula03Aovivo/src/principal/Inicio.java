package principal;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome, senha, tipo;
		
		nome = "Marcos";
		senha = "1990";
		tipo = "adm";
		
		String nomeComparacao = "Marcos";
		String senhaComparacao = "1990";
		String tipoComparacao = "adm";
		
		if(nome.equals(nomeComparacao) && senha.equals(senhaComparacao)) {
			
			if(tipo.equals(tipoComparacao)) {
					System.out.println("Entrou como Administrador");
			} else {
				
				System.out.println("Entrou como Usuário Padrão");
			}
			
		}else {
			
			System.out.println("Senha ou Usuário incorretos! Tente novamente");
			
		}

	}

}
