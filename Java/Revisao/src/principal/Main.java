package principal;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

//		Criando Objetos manualmente		
//		Medico medico = new Medico("2564568", "Marcos Silva", "Rua Joao Mayrink, 151");		
//		Paciente paciente = new Paciente(01, "Nivia Marques", "Rua Silva Porto, 17", "F", new Date());
		
//	Criando Objetos com teclado
		Medico medico = new Medico();
		Paciente paciente = new Paciente();
		
		System.out.println("Entre com os dados do Médico:");
		System.out.println("Informe o nome do Médico:");
		String nome = teclado.nextLine();
		medico.setNome(nome);
				
		System.out.println("Informe o CRM do Médico:");
		String crm = teclado.nextLine();
		medico.setCrm(crm);
		
		System.out.println("Informe o Endereço do Médico:");
		String endereco = teclado.nextLine();
		medico.setEndereco(endereco);;
		
		System.out.println("Entre com os dados do Paciente:");
		
		System.out.println("Informe o ID do Paciente:");
		int id = teclado.nextInt();
		paciente.setId(id);
		teclado.nextLine();
		
		System.out.println("Informe o nome do Paciente:");
		String nomeP = teclado.nextLine();
		paciente.setNome(nomeP);
		
		System.out.println("Informe o Endereço do Paciente:");
		String enderecoP = teclado.nextLine();
		paciente.setEndereco(enderecoP);
		
		System.out.println("Informe o Sexo do Paciente:");
		String sexo = teclado.next();
		paciente.setSexo(sexo);
		
		paciente.setDate(new Date());
		
		Consulta consulta = new Consulta(01, new Date(), medico, paciente);
		
		
		
		System.out.println("====== Dados da Consulta ======");
		System.out.println("Data: " + consulta.getData());
		System.out.println("Código: " + consulta.getId());
		System.out.println("Médico: Dr " + consulta.getMedico().getNome());
		System.out.println("Paciente: " + consulta.getPaciente().getNome());

	}

}
