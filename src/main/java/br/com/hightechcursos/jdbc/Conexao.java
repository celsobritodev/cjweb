package br.com.hightechcursos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/bancocjweb";
	public static final String USER_LOGIN = "root";
	public static final String USER_PASSWD = "admin";

	

	public static Connection getConnection() {

		Connection con=null;
		try {
			con = DriverManager.getConnection(URL, USER_LOGIN, USER_PASSWD);
			System.out.println("Conectado com sucesso!");
		} catch (SQLException e) {

			System.out.println("Não pode conectar:"+e.getMessage());
		}
		return con;
	}

}
