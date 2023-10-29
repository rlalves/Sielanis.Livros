package br.com.sielanis.livros.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestParam;

public class LivroRepositorio {
	
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Sielanis?autoReconnect=true&useSSL=false";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
	
    public String Teste()
    {
    	return "teste";
    }
    
	public void InserirLivro(@RequestParam(value="titulo", defaultValue = "") String titulo, @RequestParam(value="autor", defaultValue = "") String autor, @RequestParam(value="paginas", defaultValue = "0") String paginas)
	{
        try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "INSERT INTO Livros (titulo, autor, paginas) VALUES (?,?,?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, titulo);
                preparedStatement.setString(2, autor);
                preparedStatement.setLong(3, Long.valueOf(paginas));
                
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
