package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClientePF x = new ClientePF();
//		x.setId(1);
//		x.setNome("Marcos Silva");
//		x.setTel("935113477");
//		x.setCpf("13691493793");
		
		ClientePJ y = new ClientePJ(02, "João", "928457669");
		
		
//		System.out.println("Nome: " + x.getNome());
//		System.out.println("RG: " + x.getRg());
		
		System.out.println("======================");
		
		System.out.println("Nome: " + y.getNome());
		System.out.println("CNPJ: " + y.getCnpj());
		
	}

}
