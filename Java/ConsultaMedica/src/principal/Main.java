package principal;

import java.util.List;
import java.util.Scanner;

import principal.DAO.MedicoDAO;
import principal.DAO.PacienteDAO;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String continuar = "s";
		int opcao = 0;
		
		//Criando MedicoDAO e Medico
		MedicoDAO medicoDAO = new MedicoDAO();
		Medico medico1 = new Medico();
		
		//Criando PacienteDAO e Paciente
		PacienteDAO pacienteDAO = new PacienteDAO();		
		Paciente paciente01 = new Paciente();
		
		do {			
			System.out.println("=========================================");
			System.out.println("Clinica Médica POO");
			System.out.println("1 - Para Cadastrar Médicos");
			System.out.println("2 - Para Excluir Médicos");
			System.out.println("3 - Para Editar Médicos");
			System.out.println("4 - Para Consultar Médicos");
			System.out.println("5 - Para Cadastrar Pacientes");
			System.out.println("6 - Para Excluir Pacientes");
			System.out.println("7 - Para Editar Pacientes");
			System.out.println("8 - Para Consultar Pacientes");
			System.out.println("9 - Para Cadastrar Consultas");
			System.out.println("10 - Para Excluir Consultas");
			System.out.println("11 - Para Consultar Consultas");		
			System.out.println("=========================================");
			System.out.println("Indique uma opção");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
			
			case 1: {
				System.out.println("ADICIONANDO MÉDICO");
				
				//Recebe informações para serem inseridas no Sistema
				System.out.println("Informe o nome do Médico:");				
				medico1.setNome(teclado.nextLine());
				//teclado.nextLine();
				
				System.out.println("Informe a Especialidade do Médico:");
				medico1.setEspecialidade(teclado.nextLine());
				//teclado.nextLine();
				
				//Chama o metodo DAO para inserir as informações no banco de dados
				medicoDAO.criarMedico(medico1);
				
			}
			break;
			
			case 2:{
				System.out.println("EXCLUINDO MÉDICO");
				System.out.println("Informe o ID do Médico que pretende excluir");
				medicoDAO.excluirMedico(teclado.nextInt());
				
			}
			break;
			
			case 3: {
				int edit = 0;
				String novoNome = "";
				String novaEspecialidade = "";
				
				System.out.println("EDITANDO MÉDICOS");
				System.out.println("Informe o ID do Médico que pretende editar");
				edit = teclado.nextInt();
				teclado.nextLine();
				
				Medico mdatualizar = medicoDAO.buscarMedicoPorId(edit);
				
				if(mdatualizar !=null) {
				
					System.out.println("Informe a alteração no Nome do Médico que fazer");
					novoNome = teclado.nextLine();
						if (novoNome.equals("")) {
								novoNome = mdatualizar.getNome();
						}
						mdatualizar.setNome(novoNome);
				
					System.out.println("Informe a alteração da Especialidade do Médico que fazer");
					novaEspecialidade = teclado.nextLine();
				
						if (novaEspecialidade.equals("")) {
								novaEspecialidade = mdatualizar.getEspecialidade();				
						}
					mdatualizar.setEspecialidade(novaEspecialidade);
				
				medicoDAO.atualizarMedico(mdatualizar);
				}
								
				}
				break;
			
			case 4: {
				System.out.println("CONSULTANDO MÉDICOS");
					
				List<Medico> medicos = null;
					try {	
						medicos = medicoDAO.listarMedicos();
						} catch (Exception e) {
					e.printStackTrace();
						}
	
					for (Medico medico : medicos) {
						System.out.println("MD-ID " + medico.getId() + ": " + medico.getNome() + " - " + medico.getEspecialidade());
					}
				}
				break;
				
			case 7: {
				int edit = 0;
				String novoNome = "";
				int novaIdade = 0;
				
				System.out.println("EDITANDO PACIENTES");
				System.out.println("Informe o ID do Paciente que pretende editar");
				edit = teclado.nextInt();
				teclado.nextLine();
				
				Paciente pcatualizar = pacienteDAO.buscarPacientePorId(edit);
				
				if(pcatualizar !=null) {
				
					System.out.println("Informe a alteração no Nome do Paciente que pretende fazer");
					novoNome = teclado.nextLine();
						if (novoNome.equals("")) {
								novoNome = pcatualizar.getNome();
						}
						pcatualizar.setNome(novoNome);
				
					System.out.println("Informe a alteração da Idade do Paciente que pretende fazer");
					novaIdade = teclado.nextInt();
					teclado.nextLine();
				
						if (novaIdade == 0) {
								novaIdade = pcatualizar.getIdade();				
						}
					pcatualizar.setIdade(novaIdade);
				
				pacienteDAO.atualizarPaciente(pcatualizar);
				}
								
				}
				break;
				
			}
			
			
			
			System.out.println("Deseja Fazer outra Operação?");
			continuar = teclado.next();
			
			 // Limpar Tela
		    System.out.print("\033[H\033[2J");
		    System.out.flush();
			
		} while (continuar.equals("s"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
//				 Criar objeto da Classe DAO do médico
//
//				MedicoDAO medicoDAO = new MedicoDAO(); 
//
//				// Criar médico
//
////				Medico medico1 = new Medico();
////				medico1.setNome("Dra. Danna Scully");
////				medico1.setEspecialidade("Legista FBI");
////				medico1.setId(6);
//				//medicoDAO.criarMedico(medico1);
////				
//				//Excluir Médico
//				
//				//medicoDAO.excluirMedico(4);
//				
//				// Listar médicos
//
////				System.out.println("Médicos:");
////				List<Medico> medicos = null;
////				try {
////
////					medicos = medicoDAO.listarMedicos();
////				} catch (Exception e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////
////				for (Medico medico : medicos) {
////					System.out.println("MD-ID " + medico.getId() + ": " + medico.getNome() + " - " + medico.getEspecialidade());
////				}
//				
////		      	Atualizar médico
//
//		      	//medicoDAO.atualizarMedico(medico1);
//				
//				//Fechar conexão
//				
//				//medicoDAO.fecharConexao();
//				
//				/////////////////PACIENTE////////////////////////
//				
//				PacienteDAO pacienteDAO = new PacienteDAO();
//				
//				Paciente paciente01 = new Paciente();
//				paciente01.setNome("João Costa");
//				paciente01.setIdade(28);
//				//pacienteDAO.criarPaciente(paciente01);
//				paciente01.setId(4);
//				
//				//pacienteDAO.excluirPaciente(2);
//				
//				//pacienteDAO.atualizarPaciente(paciente01);
//				
//				//pacienteDAO.fecharConexao();
//				
//				
//				System.out.println("Pacientes:");
//				List<Paciente> pacientes = null;
//				try {
//
//					pacientes = pacienteDAO.listarPacientes();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				for (Paciente paciente : pacientes) {
//					System.out.println("Paciente-ID " + paciente.getId() + ": " + paciente.getNome() + " - " + paciente.getIdade());
//				}
				
	}

}
