package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import principal.DAO.DestinoDAO;
import principal.DAO.EstadiaDAO;
import principal.DAO.UsuarioDAO;
import principal.DAO.ViagemDAO;
import principal.DAO.Viagem_ViajanteDAO;
import principal.DAO.ViajanteDAO;

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
		ViagemDAO viagemdao = new ViagemDAO();
		Viagem viagem = new Viagem();
		ViajanteDAO viajantedao = new ViajanteDAO();
		Viajante viajante = new Viajante();
		Viagem_ViajanteDAO viagemViajantedao = new Viagem_ViajanteDAO();
		Viagem_Viajante viagemViajante = new Viagem_Viajante();
		
		
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
				System.out.println("2 - Para Editar Viagem");
				System.out.println("3 - Para Consultar Viagem");
				System.out.println("4 - Para Consultar Viagens");
				System.out.println("5 - Para Ver Viagem");
				System.out.println("6 - Para Sair");
				System.out.println("=========================================");
				System.out.println("Indique uma opção");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
				switch(opcao) { 
				
						case 1: {
							String pretende = new String();
							int numViajantes = 0;
							System.out.println("CADASTRANDO VIAGEM");				
							System.out.println("ID do Cliente: ");
							
							int idcliente = teclado.nextInt();
							teclado.nextLine();

							Usuario clienteViagem = usuariodao.verUsuarioId(idcliente);
							
							//System.out.println(clienteViagem.getCpf());
									
							if (clienteViagem != null) {
								
								System.out.print("Data da Viagem (dd/mm/yyyy): ");
								String dataString = teclado.next();
								teclado.nextLine();
								
								try {
									
									SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
									Date dataViagem = sdf.parse(dataString);
									
									viagem.setData(dataViagem);
									
									//consulta1.setDataConsulta(dataConsulta);
									//consultaDAO.criarConsulta(consulta1);
									//System.out.println("Consulta cadastrada com sucesso!");

								} catch (ParseException e) {
									System.out.println("Formato de data inválido. Use dd/mm/yyyy.");
								}
								
								System.out.println("Tipo:");
								viagem.setTipo(teclado.nextLine());
											
								System.out.println("Duração (dias):");
								int diasViagem = teclado.nextInt();
								teclado.nextLine();
								viagem.setDuracao(diasViagem);
								
								
								viagem.setViajantes(1);
								
								viagem.setUsuario(clienteViagem);
								
								System.out.println("ID do Destino: ");
								int destinoId = teclado.nextInt();
								teclado.nextLine();
								
								Destino destinoViagem = destinodao.verDestinoId(destinoId);
																
								if (destinoViagem != null) {

								viagem.setDestino(destinoViagem);

								System.out.println("Pretende Estadia? (s/n)");
								pretende = teclado.nextLine();
								
								if(pretende.equals("s")) {
																		
									System.out.println("ID Estadia: ");
									int estadiaId = teclado.nextInt();
									teclado.nextLine();
									
									Estadia estadiaViagem = estadiadao.verEstadiaId(estadiaId); 
																										
									if (estadiaViagem != null) {

										viagem.setEstadia(estadiaViagem);
										
										viagem.setValor_viagem((estadiaViagem.getValor() * diasViagem) + destinoViagem.getValor());

									}else {
										System.out.println("Estadia não encontrado.");
									}									
									
								}else {
										viagem.setEstadia(null);
										viagem.setValor_viagem(destinoViagem.getValor());
									}
								
								} else {
									System.out.println("Destino não encontrado.");
								}
								
								
								long pegaidviagem = viagemdao.criarViagem(viagem);
								
								if(pegaidviagem != 0) {
									Viagem verviagem = viagemdao.buscarViagemId(Math.toIntExact(pegaidviagem));
											
									viagemViajante.setUsuario(clienteViagem);									
									viagemViajante.setViagem(verviagem);
									viagemViajantedao.criarViagemViajante(viagemViajante);
								}								
								System.out.println("Viagem cadastrada com sucesso!");
								
								System.out.println("Pretende adicionar viajantes? (s/n)");
								pretende = teclado.nextLine();
								
								if(pretende.equals("s")) {
								
									System.out.println("Indique o num de viajantes");
									numViajantes = teclado.nextInt();
									teclado.nextLine();
									
									for (int i = 1; i <= numViajantes; i++){
										
								        String tipo = "viajante";
								        Usuario novoUsuario = new Usuario();

										System.out.println("CADASTRANDO VIAJANTE");

								        // Recebe informações relevantes para o cadastro de viajante
								        System.out.println("CPF:");
								        novoUsuario.setCpf(teclado.nextLine());

								        System.out.println("Nome:");
								        novoUsuario.setNome(teclado.nextLine());

								        System.out.println("Idade:");
								        novoUsuario.setIdade(teclado.nextInt());
								        teclado.nextLine();

								        System.out.println("Email:");
								        novoUsuario.setEmail(teclado.nextLine());

								        System.out.println("Telefone:");
								        novoUsuario.setTelefone(teclado.nextLine());

								        novoUsuario.setTipo(tipo);

								        // Chama o método DAO para inserir as informações no banco de dados
								        usuariodao.cadastrarUsuario(novoUsuario);
								        
								        Viagem verviagem = viagemdao.buscarViagemId(Math.toIntExact(pegaidviagem));
								        viagemViajante.setViagem(verviagem);
								        
								        long pegaidusuario = usuariodao.cadastrarUsuario(novoUsuario); 								        		
										
										if(pegaidusuario != 0) {
											Usuario verusuario = usuariodao.verUsuarioId(Math.toIntExact(pegaidusuario));
																							
											viagemViajante.setUsuario(verusuario);
											viagemViajantedao.criarViagemViajante(viagemViajante);
											System.out.println("Viajante cadastrado com sucesso!");
										}								
										System.out.println("Viagem cadastrada com sucesso!");
									}
									
									numViajantes = numViajantes + 1;
									Viagem editarValorViagem = viagemdao.buscarViagemId(Math.toIntExact(pegaidviagem));
									Double valorAtual = editarValorViagem.getValor_viagem() * numViajantes;
									
									editarValorViagem.setValor_viagem(valorAtual);
									editarValorViagem.setViajantes(numViajantes);
									
									viagemdao.editarValorViagem(editarValorViagem);
									
								}

							} else {
								System.out.println("Cliente não encontrado.");
							}
				
						}break;
						
						case 2: {
													
							int edit = 0;							
							
							System.out.println("EDITANDO VIAGEM");
							System.out.println("ID VIAGEM:");
							edit = teclado.nextInt();
							teclado.nextLine();
							
							Viagem vgEditar = viagemdao.buscarViagemId(edit);
														
							if(vgEditar !=null) {
								
									System.out.println("Editando Viagem " + vgEditar.getId_viagem());
									System.out.println("Editando Viagem " + vgEditar.getUsuario().getNome());
									System.out.println("Editando Viagem " + vgEditar.getUsuario().getCpf());
									
									System.out.println("DEIXAR EM BRANCO CASO NÃO QUEIRA ALTERAR");
									
									System.out.print("Alterar Data da Viagem (dd/mm/yyyy): ");
									String dataString = teclado.next();
									teclado.nextLine();
									
									try {
										
										SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
										Date dataViagem = sdf.parse(dataString);
										
										vgEditar.setData(dataViagem);

									} catch (ParseException e) {
										System.out.println("Formato de data inválido. Use dd/mm/yyyy.");
									}										
										viagemdao.editarViagem(vgEditar);					
							}
							
						}break;
						
						case 3: {
							
							System.out.println("VER VIAGEM");
							System.out.println("ID da Viagem pretendida");
							Viagem viagemitem = viagemdao.buscarViagemId(teclado.nextInt());							 
							teclado.nextLine();
							
							System.out.println("================================== VIAGEM DO BD ================================= \n" + "ID Viagem:" + viagemitem.getId_viagem()  + "\n" + "País: " + viagemitem.getDestino().getPais() + "\n" + "Destino: " + viagemitem.getDestino().getCidade() + "\n" + "Estadia: " + /*(viagemitem.getEstadia().getNome_estadia() == null ? "Não Há" : viagemitem.getEstadia().getNome_estadia())   Resolver situação em que não há estadia*/ viagemitem.getEstadia().getNome_estadia().chars() + "\n" + "Data: " + viagemitem.getData() + "\n" + "Duração (dias) " + viagemitem.getDuracao() + "\n" + "Viajantes: " + viagemitem.getViajantes() + "\n" + "Valor: R$ " + viagemitem.getValor_viagem());
							
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
