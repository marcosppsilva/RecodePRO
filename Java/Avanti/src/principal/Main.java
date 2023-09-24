package principal;

import java.util.List;

import principal.DAO.UsuarioDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Usuario user01 = new Usuario(0,"354895867", 27, "ramon@gmail.com", "Ramon de Jesus", "987875478", "Travessa do Beco estreito, 15, Pero Pinheiro, Sintra", "uber1224", "cliente");
		UsuarioDAO userdao = new UsuarioDAO();
		//userdao.cadastrarUsuario(user01);
		//userdao.excluirUsuario(1);
		UsuarioDAO userdao2 = new UsuarioDAO();
		
		
	System.out.println("LISTA DE CLIENTES:");
	List<Usuario> usuarios = null;
	try {

		usuarios = userdao.listarUsuario();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	int index = 1;
	for (Usuario usuario : usuarios) {
		System.out.println("===================== Cliente "+index+" ====================== \n"+"ID Cliente:" + usuario.getId_usuario() + "\n" + "Nome: " + usuario.getNome() + "\n" + "CPF: " + usuario.getCpf() + "\n" + "Tel: " + usuario.getTelefone() + "\n" + "Email: " + usuario.getEmail() + "\n" + "Endereço: " + usuario.getEndereco() + "\n" + "Idade: " + usuario.getIdade());
		index++;
	}
	
	Usuario usuario2 = userdao2.verUsuarioId(2);
	System.out.println("================================== \n USUARIO UNICO DO BD \n"+"ID Cliente:" + usuario2.getId_usuario() + "\n" + "Nome: " + usuario2.getNome() + "\n" + "CPF: " + usuario2.getCpf() + "\n" + "Tel: " + usuario2.getTelefone() + "\n" + "Email: " + usuario2.getEmail() + "\n" + "Endereço: " + usuario2.getEndereco() + "\n" + "Idade: " + usuario2.getIdade());
	
	}

}
