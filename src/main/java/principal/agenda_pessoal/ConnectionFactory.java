package principal.agenda_pessoal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperaConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/Agenda?useTimezone=true&serverTimezone=UTC","root","123456");
	}
	
}	
	
//	public static void main(String[] args) throws SQLException {
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Agenda?useTimezone=true&serverTimezone=UTC","root","123456");
//		System.out.println("Fechando conexao!");
//		connection.close();
//	}
//
//
//}
