package principal;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = new Contato();
		
		//Adiciona contato ao banco de dados
		/*contato.setNome("Fabio");
		contato.setIdade(30);
		contato.setDataCadastro(new Date());
		
		//Remove contato do banco de dados
		contatoDAO.save(contato);*/
		//contatoDAO.removeById(01);
		
		for (Contato c : contatoDAO.getContatos()) { 

			System.out.println("NOME: " + c.getNome());
			System.out.println("IDADE: " + c.getIdade());
			System.out.println("DATA CADASTRO: " + c.getDataCadastro());
			System.out.println("----------------------------------- ");
		}	

	}

}
