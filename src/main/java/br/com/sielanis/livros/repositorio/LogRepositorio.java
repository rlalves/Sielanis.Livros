package br.com.sielanis.livros.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogRepositorio extends BaseRepositorio {
	
	public void InserirLog(Date data) {
	
        java.sql.Date sqlDate = new java.sql.Date(data.getTime());
			
		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "INSERT INTO Log (create_time) VALUES (?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setDate(1, (java.sql.Date) sqlDate);
	                
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }	
	}
}
