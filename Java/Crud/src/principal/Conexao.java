package principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	//Nome do usuario do MySQL
	private static final String USERNAME = "root";
	
	//Senha do MySQL
	private static final String PASSWORD = "root";
	
	//Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/crud";
	/*Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
	@param username
	@param senha
	@return uma conexão com o banco de dados
	@throws Exception*/
	
	public static Connection createConnectionToMySQL() throws Exception {
		//Cria a cconexão com o banco de dados
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
}
