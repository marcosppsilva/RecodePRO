package principal;

import java.util.List;
import java.util.Scanner;

import principal.DAO.DestinoDAO;
import principal.DAO.EstadiaDAO;
import principal.DAO.UsuarioDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//Variáveis de controle:
		String continuar = "s";
		int opcao = 0;
		
		//Objetos de todas as classes
		UsuarioDAO usuariodao = new UsuarioDAO();
		Usuario usuario = new Usuario();
		DestinoDAO destinodao = new DestinoDAO();
		Destino destino = new Destino();
		EstadiaDAO estadiadao = new EstadiaDAO();
		Estadia estadia = new Estadia();
		
		do {			
			System.out.println("=========================================");
			System.out.println("AVANTI TURISMO");
			System.out.println("1 - Para Clientes");
			System.out.println("2 - Para Destinos");
			System.out.println("3 - Para Estadias");
			System.out.println("4 - Para Viagens");
			System.out.println("5 - Para Sair");
			System.out.println("=========================================");
			System.out.println("Indique uma opção");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) { 
			case 1: {
					
				System.out.println("=========================================");
				System.out.println("1 - Para Cadastrar Clientes");
				System.out.println("2 - Para Excluir Clientes");
				System.out.println("3 - Para Editar Clientes");
				System.out.println("4 - Para Consultar Clientes");
				System.out.println("5 - Para Ver Cliente");
				System.out.println("6 - Para Sair");
				System.out.println("=========================================");
				System.out.println("Indique uma opção");
				
				opcao = teclado.nextInt();
				teclado.nextLine();
				
					switch(opcao) { 
						case 1: {
							
							String senha = "A";
							String confirma = "B";
							String tipo = "cliente";
							
							System.out.println("CADASTRANDO USUÁRIO");
							
							//Recebe informações para serem inseridas no Sistema
							System.out.println("CPF:");				
							usuario.setCpf(teclado.nextLine());
							
							System.out.println("Nome:");				
							usuario.setNome(teclado.nextLine());
							
							System.out.println("Idade:");				
							usuario.setIdade(teclado.nextInt());
							teclado.nextLine();
							
							System.out.println("Email:");				
							usuario.setEmail(teclado.nextLine());
							
							System.out.println("Telefone:");				
							usuario.setTelefone(teclado.nextLine());
							
							System.out.println("Endereço:");				
							usuario.setEndereco(teclado.nextLine());
							
							
							
							while(!senha.equals(confirma)) {
								
								System.out.println("Senha:");
								senha = teclado.nextLine();
							
								System.out.println("Confirmar Senha:");
								confirma = teclado.nextLine();
								
								if(!senha.equals(confirma)) {
									System.out.println("Atenção! A confirmação da senha deve ser identica a senha. Tentar novamente");
								}
								
								usuario.setSenha(senha);
							}
							
							usuario.setTipo(tipo);
							
							//Chama o metodo DAO para inserir as informações no banco de dados
							usuariodao.cadastrarUsuario(usuario);
												
						}break;
						
						case 2: {
							System.out.println("EXCLUINDO USUÁRIO");
							System.out.println("ID CLIENTE:");										
							usuariodao.excluirUsuario(teclado.nextInt());						
												
						}break;
						
						case 3: {
							
							int edit = 0;
							int novaIdade = 0;
							String cpfInicial = "";
							String novoEmail = "";
							String novoNome = "";
							String novoTel = "";
							String novoEnd = "";
							String novaSenha = "";
							String novoTipo = "";
							
							
							
							System.out.println("EDITANDO USUÁRIOS");
							System.out.println("ID USUARIO:");
							edit = teclado.nextInt();
							teclado.nextLine();
							
							Usuario userEditar = usuariodao.verUsuarioId(edit);
							
							if(userEditar !=null) {
								
										cpfInicial = userEditar.getCpf();
										userEditar.setCpf(cpfInicial);
										
								System.out.println("Editar Idade (Digite 0 caso não queira alterar)");
										novaIdade = teclado.nextInt();
										teclado.nextLine();
									if (novaIdade == 0) {
										novaIdade = userEditar.getIdade();
										}
										userEditar.setIdade(novaIdade);
								
									
								System.out.println("Editar EMAIL (Deixar em branco caso não queira alterar)");
										novoEmail = teclado.nextLine();
									if (novoEmail.equals("")) {
										novoEmail = userEditar.getEmail();
										}
										userEditar.setEmail(novoEmail);
								
								System.out.println("Editar Nome (Deixar em branco caso não queira alterar");
										novoNome = teclado.nextLine();
									if (novoNome.equals("")) {
										novoNome = userEditar.getNome();
										}
										userEditar.setNome(novoNome);
										
								System.out.println("Editar Telefone (Deixar em branco caso não queira alterar)");
										novoTel = teclado.nextLine();
									if (novoTel.equals("")) {
										novoTel = userEditar.getTelefone();
										}
										userEditar.setTelefone(novoTel);					
										
								System.out.println("Editar Endereço (Deixar em branco caso não queira alterar");
										novoEnd = teclado.nextLine();
									if (novoEnd.equals("")) {
										novoEnd = userEditar.getEndereco();
										}
										userEditar.setEndereco(novoEnd);
															
										novaSenha = userEditar.getSenha();
										userEditar.setSenha(novaSenha);
										
										novoTipo = userEditar.getTipo();
										userEditar.setTipo(novoTipo);
							
										usuariodao.editarUsuario(userEditar);
							}
												
						}break;
						
						case 4: {							
							System.out.println("LISTA DE CLIENTES:");
							List<Usuario> usuarios = null;
							try {

								usuarios = usuariodao.listarUsuario();
							} catch (Exception e) {
								e.printStackTrace();
							}
							int index = 1;
							for (Usuario usuariolist : usuarios) {
								System.out.println("===================== Cliente "+index+" ====================== \n"+"ID Cliente:" + usuariolist.getId_usuario() + "\n" + "Nome: " + usuariolist.getNome() + "\n" + "CPF: " + usuariolist.getCpf() + "\n" + "Tel: " + usuariolist.getTelefone() + "\n" + "Email: " + usuariolist.getEmail() + "\n" + "Endereço: " + usuariolist.getEndereco() + "\n" + "Idade: " + usuariolist.getIdade());
								index++;
							}
												
						}break;
						
						case 5: {
							
							System.out.println("VER CLIENTE");
							System.out.println("ID do Cliente pretendido");
							Usuario usuario2 = usuariodao.verUsuarioId(teclado.nextInt());
							teclado.nextLine();
							
							System.out.println("================================== \n CLIENTE INDIVIDUAL DO BD \n"+"ID Cliente:" + usuario2.getId_usuario() + "\n" + "Nome: " + usuario2.getNome() + "\n" + "CPF: " + usuario2.getCpf() + "\n" + "Tel: " + usuario2.getTelefone() + "\n" + "Email: " + usuario2.getEmail() + "\n" + "Endereço: " + usuario2.getEndereco() + "\n" + "Idade: " + usuario2.getIdade());
							
						}break;
						
						default:
			                System.out.println("Opção inválida. Tente novamente.");
			                break;
												
					}
				
			}break;
			
			case 2: {
				
				System.out.println("=========================================");
				System.out.println("1 - Para Cadastrar Destinos");
				System.out.println("2 - Para Excluir Destinos");
				System.out.println("3 - Para Editar Destinos");
				System.out.println("4 - Para Consultar Destinos");
				System.out.println("5 - Para Ver Destino");
				System.out.println("6 - Para Sair");
				System.out.println("=========================================");
				System.out.println("Indique uma opção");
				
				opcao = teclado.nextInt();
				teclado.nextLine();
				
					switch(opcao) { 
						case 1: {
							
							System.out.println("CADASTRANDO DESTINO");
							
							//Recebe informações para serem inseridas no Sistema
							System.out.println("País:");				
							destino.setPais(teclado.nextLine());
							
							System.out.println("Província/Estado:");				
							destino.setProvincia_estado(teclado.nextLine());
							
							System.out.println("Cidade:");				
							destino.setCidade(teclado.nextLine());
							
							Double preco = 0.0;							
							System.out.println("Valor: R$");
							
							String input = teclado.next();
							
							preco = Double.parseDouble(input);
							destino.setValor(preco);
							
							
							//Chama o metodo DAO para inserir as informações no banco de dados
							destinodao.cadastrarDestino(destino);							
						} break;
						
						case 2: {
							
							System.out.println("EXCLUINDO DESTINO");
							System.out.println("ID DESTINO:");										
							destinodao.excluirDestino(teclado.nextInt());
							
						}break;
						
						case 3: {
							
							int edit = 0;							
							String novoPais = "";
							String novaProvincia = "";
							String novaCidade = "";
							Double novoValor = 0.0;
							
							System.out.println("EDITANDO DESTINOS");
							System.out.println("ID Destino:");
							edit = teclado.nextInt();
							teclado.nextLine();
							
							Destino destEditar = destinodao.verDestinoId(edit);
														
							if(destEditar !=null) {
									
									System.out.println("Editar Pais (Deixar em branco caso não queira alterar)");
										novoPais = teclado.nextLine();
									if (novoPais.equals("")) {
										novoPais = destEditar.getPais();
										}
										destEditar.setPais(novoPais);
										
										System.out.println("Editar Província/Estado (Deixar em branco caso não queira alterar)");
										novaProvincia = teclado.nextLine();
									if (novaProvincia.equals("")) {
										novaProvincia = destEditar.getProvincia_estado();
										}
										destEditar.setProvincia_estado(novaProvincia);
										
										System.out.println("Editar Cidade (Deixar em branco caso não queira alterar)");
										novaCidade = teclado.nextLine();
									if (novaCidade.equals("")) {
										novaCidade = destEditar.getCidade();
										}
										destEditar.setCidade(novaCidade);
										
										System.out.println("Editar Valor (Digite 0.0 caso não queira alterar)");
										String input = teclado.next();																											
										novoValor = Double.parseDouble(input);
										
									if (novoValor == 0) {
										novoValor = destEditar.getValor();
										}										
										destEditar.setValor(novoValor);
										
										destinodao.editarDestino(destEditar);					
								}
							
						}break;
						
						case 4: {
							
							System.out.println("LISTA DE DESTINOS:");
							List<Destino> destinos = null;
							try {

								destinos = destinodao.listarDestino();
							} catch (Exception e) {
								e.printStackTrace();
							}
							int index = 1;
							for (Destino destinoitem : destinos) {
								System.out.println("===================== DESTINO "+index+" ====================== \n"+"ID Destino:" + destinoitem.getId_destino() + "\n" + "País: " + destinoitem.getPais() + "\n" + "Província/Estado: " + destinoitem.getProvincia_estado() + "\n" + "Cidade: " + destinoitem.getCidade() + "\n" + "Valor: R$ " + destinoitem.getValor());
								index++;
							}
							
						}break;
						
						case 5: {
							
							System.out.println("VER DESTINO");
							System.out.println("ID do Cliente pretendido");
							Destino destino2 = destinodao.verDestinoId(teclado.nextInt());  
							teclado.nextLine();
							
							System.out.println("================================== \n DESTINO INDIVIDUAL DO BD \n"+"ID Destino:" + destino2.getId_destino() + "\n" + "País: " + destino2.getPais() + "\n" + "Província/Estado: " + destino2.getProvincia_estado() + "\n" + "Cidade: " + destino2.getCidade() + "\n" + "Valor: R$ " + destino2.getValor());
							
						}break;
						
					}
				
			}break;
			
			case 3: {
				
				System.out.println("=========================================");
				System.out.println("1 - Para Cadastrar Estadia");
				System.out.println("2 - Para Excluir Estadia");
				System.out.println("3 - Para Editar Estadias");
				System.out.println("4 - Para Consultar Estadias");
				System.out.println("5 - Para Ver Estadia");
				System.out.println("6 - Para Sair");
				System.out.println("=========================================");
				System.out.println("Indique uma opção");
				
				opcao = teclado.nextInt();
				teclado.nextLine();
				
					switch(opcao) { 
						case 1: {
						
							System.out.println("CADASTRANDO ESTADIA");
							
							//Recebe informações para serem inseridas no Sistema
							System.out.println("Nome Estadia:");				
							estadia.setNome_estadia(teclado.nextLine());
							
							System.out.println("Tipo da Estadia:");				
							estadia.setTipo(teclado.nextLine());
							
							System.out.println("Endereço:");				
							estadia.setEndereco(teclado.nextLine());
							
							System.out.println("Telefone:");				
							estadia.setTelefone(teclado.nextLine());
							
							System.out.println("Email:");				
							estadia.setEmail(teclado.nextLine());
							
							
							
							Double preco = 0.0;							
							System.out.println("Valor(Dia): R$");
							
							String input = teclado.next();
							
							preco = Double.parseDouble(input);
							estadia.setValor(preco);
							
							
							//Chama o metodo DAO para inserir as informações no banco de dados
							estadiadao.cadastrarEstadia(estadia);
							
						}break;
						
						case 2: {
						
							System.out.println("EXCLUINDO ESTADIA");
							System.out.println("ID ESTADIA:");
							estadiadao.excluirEstadia(teclado.nextInt());
							
						}break;
						
						case 3: {
						
							int edit = 0;							
							String novoNome = "";
							String novoTipo = "";
							String novoEndereco = "";
							String novoTelefone = "";
							String novoEmail = "";
							Double novoValor = 0.0;
							
							System.out.println("EDITANDO ESTADIA");
							System.out.println("ID Estadia:");
							edit = teclado.nextInt();
							teclado.nextLine();
							
							Estadia estEditar = estadiadao.verEstadiaId(edit);
														
							if(estEditar !=null) {
									
									System.out.println("Editar Nome da Estadia (Deixar em branco caso não queira alterar)");
										novoNome = teclado.nextLine();
									if (novoNome.equals("")) {
										novoNome = estEditar.getNome_estadia();
										}
										estEditar.setNome_estadia(novoNome);
										
										System.out.println("Editar Tipo (Deixar em branco caso não queira alterar)");
										novoTipo = teclado.nextLine();
									if (novoTipo.equals("")) {
										novoTipo = estEditar.getTipo();
										}
										estEditar.setTipo(novoTipo);	
										
										System.out.println("Editar Endereço (Deixar em branco caso não queira alterar)");
										novoEndereco = teclado.nextLine();
									if (novoEndereco.equals("")) {
										novoEndereco = estEditar.getEndereco();
										}
										estEditar.setEndereco(novoEndereco);	
										
										System.out.println("Editar Telefone (Deixar em branco caso não queira alterar)");
										novoTelefone = teclado.nextLine();
									if (novoTelefone.equals("")) {
										novoTelefone = estEditar.getTelefone();
										}
										estEditar.setTelefone(novoTelefone);	
										
										System.out.println("Editar Email (Deixar em branco caso não queira alterar)");
										novoEmail = teclado.nextLine();
									if (novoEmail.equals("")) {
										novoEmail = estEditar.getEmail();
										}
										estEditar.setEmail(novoEmail);	
										
										System.out.println("Editar Valor (Digite 0.0 caso não queira alterar)");
										String input = teclado.next();																											
										novoValor = Double.parseDouble(input);
										
									if (novoValor == 0) {
										novoValor = estEditar.getValor();
										}										
										estEditar.setValor(novoValor);
										
										estadiadao.editarEstadia(estEditar);					
								}
							
						}break;
						
						case 4: {
	
							System.out.println("LISTA DE ESTADIAS:");
							List<Estadia> estadias = null;
							try {

								estadias = estadiadao.listarEstadia();
							} catch (Exception e) {
								e.printStackTrace();
							}
							int index = 1;
							for (Estadia estadiaitem : estadias) {
								System.out.println("===================== ESTADIA "+index+" ====================== \n"+"ID Estadia:" + estadiaitem.getId_estadia() + "\n" + "Nome Estadia: " + estadiaitem.getNome_estadia() + "\n" + "Tipo: " + estadiaitem.getTipo() + "\n" + "Endereço: " + estadiaitem.getEndereco() + "\n" + "Telefone: " + estadiaitem.getTelefone() + "\n" + "Email: " + estadiaitem.getEmail() + "\n" + "Valor: R$ " + estadiaitem.getValor());
								index++;
							}
	
						}break;
						
						case 5: {
							
							System.out.println("VER ESTADIA");
							System.out.println("ID da Estadia pretendida");
							Estadia estadiaitem = estadiadao.verEstadiaId(teclado.nextInt());  
							teclado.nextLine();
							
							System.out.println("================================== ESTADIA INDIVIDUAL DO BD ================================= \n" + "ID Estadia:" + estadiaitem.getId_estadia() + "\n" + "Nome Estadia: " + estadiaitem.getNome_estadia() + "\n" + "Tipo: " + estadiaitem.getTipo() + "\n" + "Endereço: " + estadiaitem.getEndereco() + "\n" + "Telefone: " + estadiaitem.getTelefone() + "\n" + "Email: " + estadiaitem.getEmail() + "\n" + "Valor: R$ " + estadiaitem.getValor());
							
						}break;
					}
				
			}break;
			
			case 4: {	
				System.out.println("=========================================");
				System.out.println("1 - Para Cadastrar Viagem");
				System.out.println("2 - Para Excluir Viagem");
				System.out.println("3 - Para Editar Viagem");
				System.out.println("4 - Para Consultar Viagens");
				System.out.println("5 - Para Ver Viagem");
				System.out.println("6 - Para Sair");
				System.out.println("=========================================");
				System.out.println("Indique uma opção");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
				switch(opcao) { 
				
						case 1: {
				
				
				
						}break;
						
						case 2: {
							
							
							
						}break;
						
						case 3: {
							
							
							
						}break;
						
						case 4: {
							
							
							
						}break;
						
						case 5: {
							
							
							
						}break;
				}
				
			}break;
					
			default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
			}
			
			
			
			System.out.println("Deseja Fazer outra Operação? (s/n)");
			continuar = teclado.next();
			
			 // Limpar Tela
		    System.out.print("\033[H\033[2J");
		    System.out.flush();
			
		} while (continuar.equals("s"));
	}
	
}
