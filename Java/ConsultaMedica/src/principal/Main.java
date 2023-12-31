package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import principal.DAO.ConsultaDAO;
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
		PacienteDAO pacienteDAO = new PacienteDAO();
		Paciente paciente01 = new Paciente();
		ConsultaDAO consultaDAO = new ConsultaDAO();
		Consulta consulta1 = new Consulta();
				
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
			System.out.println("10 - Para Buscar Consultas");
			System.out.println("11 - Para Atualizar Consultas");
			System.out.println("12 - Para Excluir Consultas");
			System.out.println("13 - Para Sair");
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
				
			} break;
			
			case 2:{
				System.out.println("EXCLUINDO MÉDICO");
				System.out.println("Informe o ID do Médico que pretende excluir");
				medicoDAO.excluirMedico(teclado.nextInt());
				
			} break;
			
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
								
				} break;
			
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
				} break;
				
			case 5: {
				System.out.println("ADICIONANDO PACIENTE");
				
				//Recebe informações para serem inseridas no Sistema
				System.out.println("Informe o nome do Paciente:");				
				paciente01.setNome(teclado.nextLine());
				
				System.out.println("Informe a Idade do Paciente:");
				paciente01.setIdade(teclado.nextInt());
				teclado.nextLine();
				
				//Chama o metodo DAO para inserir as informações no banco de dados
				pacienteDAO.criarPaciente(paciente01);
				
			} break;
			
			case 6:{
				System.out.println("EXCLUINDO PACIENTE");
				System.out.println("Informe o ID do Paciente que pretende excluir");
				pacienteDAO.excluirPaciente(teclado.nextInt());
				
			} break;
				
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
			} break;
			
			case 8: {
				System.out.println("CONSULTANDO PACIENTES");
					
				List<Paciente> pacientes = null;
					try {	
						pacientes = pacienteDAO.listarPacientes();
						} catch (Exception e) {
					e.printStackTrace();
						}
	
					for (Paciente paciente : pacientes) {
						System.out.println("PACIENTE-ID " + paciente.getId() + ": " + paciente.getNome() + " - " + paciente.getIdade());
					}
				} break;
				
			case 9: {
				System.out.println("CADASTRANDO CONSULTA");				
				System.out.println("ID do Medico: ");
				
				int medicoId = teclado.nextInt();
				teclado.nextLine();

				Medico medicoConsulta = medicoDAO.buscarMedicoPorId(medicoId);
				if (medicoConsulta != null) {
					
					consulta1.setMedico(medicoConsulta);
					System.out.println("ID do Paciente: ");
					int pacienteId = teclado.nextInt();
					teclado.nextLine();

					Paciente pacienteConsulta = pacienteDAO.buscarPacientePorId(pacienteId);

					if (pacienteConsulta != null) {

						consulta1.setPaciente(pacienteConsulta);
						System.out.print("Data da Consulta (dd/mm/yyyy): ");
						String dataString = teclado.next();

						try {
							
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							Date dataConsulta = sdf.parse(dataString);
							consulta1.setDataConsulta(dataConsulta);
							consultaDAO.criarConsulta(consulta1);
							System.out.println("Consulta cadastrada com sucesso!");

						} catch (ParseException e) {
							System.out.println("Formato de data inválido. Use dd/mm/yyyy.");
						}

					} else {
						System.out.println("Paciente não encontrado.");
					}

				} else {
					System.out.println("Medico não encontrado.");
				}				
			} break;
			
			case 10:
            	// Listar Consultas
                List<Consulta> consultas = consultaDAO.listarConsultas();
                System.out.println("Lista de Consultas:");
                for (Consulta c : consultas) {
                    System.out.println("ID: " + c.getId() +
                            ", Medico: " + c.getMedico().getNome() +
                            ", Paciente: " + c.getPaciente().getNome() +
                            ", Data: " + c.getDataConsulta());
                }
                break;
                
			case 11:
            	// Atualizar Consulta
                System.out.print("ID da Consulta para atualização: ");
                int consultaId = teclado.nextInt();
                Consulta consultaAtualizar = consultaDAO.buscarConsulta(consultaId);
                if (consultaAtualizar != null) {
                    System.out.print("Nova Data da Consulta (dd/mm/yyyy): ");
                    String novaDataString = teclado.next();
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        Date novaDataConsulta = sdf.parse(novaDataString);
                        consultaAtualizar.setDataConsulta(novaDataConsulta);
                        consultaDAO.atualizarConsulta(consultaAtualizar);
                        System.out.println("Consulta atualizada com sucesso!");
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Use dd/mm/yyyy.");
                    }
                } else {
                    System.out.println("Consulta não encontrada.");
                }
                break;
                
                
			case 12:
            	// Excluir Consulta
                System.out.print("ID da Consulta para exclusão: ");
                int consultaIdExcluir = teclado.nextInt();
                Consulta consultaExcluir = consultaDAO.buscarConsulta(consultaIdExcluir);
                if (consultaExcluir != null) {
                    consultaDAO.excluirConsulta(consultaIdExcluir);
                    System.out.println("Consulta excluída com sucesso!");
                } else {
                    System.out.println("Consulta não encontrada.");
                }
                break;
                
			case 13:
                // Sair
                System.out.println("Saindo do sistema...");
                consultaDAO.fecharConexao();
                pacienteDAO.fecharConexao();
                medicoDAO.fecharConexao();
                teclado.close();
                System.exit(0);
            default:
                System.out.println("Opção inválida. Tente novamente.");
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
