package br.com.sielanis.livros.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseRepositorio {
    //private static final String URL = "jdbc:mysql://127.0.0.1:3306/Sielanis?autoReconnect=true&useSSL=false";
	protected static final String URL = "jdbc:mysql://mysqldb_livros:3306/Sielanis";
	protected static final String USUARIO = "root";
	protected static final String SENHA = "root";
	
    public String Teste()
    {
    	return "teste";
    }
}
