package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	public static Connection faz_conexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/db_senhas","root","root");
	
	}
	
	
} 
