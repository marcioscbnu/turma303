package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:mysql://localhost:3306/produto"; 
	private static final String USER = "produto";
	private static final String PASSWORD = "produto";
	
	public static Connection conectar() throws ClassNotFoundException {
		Connection con = null;
		try {
			// Carregar o driver JDBC
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Estabelecer a conexao com o banco de dados
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			if (con != null) {
				System.out.println("Conectei no banco com sucesso");
			} else {
				System.out.println("Falha na conexao com o banco");
			}
		} catch (SQLException erro) {
			System.out.println("Erro ao conectar. Veja mensagem: " + erro.getMessage());
			erro.printStackTrace(); // Adiciona a pilha de rastreamento
		}
		
		return con;
	}
	
}
