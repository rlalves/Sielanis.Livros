package br.com.sielanis.livros.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sielanis.livros.entidades.Livro;

public class LivroRepositorio extends BaseRepositorio{
	
	public void InserirLivro(String titulo, String autor, String paginas)
	{
        String sql = "INSERT INTO Livros (titulo, autor, paginas) VALUES (?,?,?)";
		
		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
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
	
	public List<Livro> ObterLivros()
	{
		List<Livro> Livros = new ArrayList<>();
		String sql = "SELECT id, titulo, autor, paginas FROM Livros";
		
		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
            		ResultSet resultSet = preparedStatement.executeQuery()) {

            	while (resultSet.next()) {
            		int id = resultSet.getInt("id");
            		String titulo = resultSet.getString("titulo");
            		String autor = resultSet.getString("autor");
            		int paginas = resultSet.getInt("paginas");
            		
            		Livro livro = new Livro(id, titulo, autor, paginas);
            		Livros.add(livro);
            	}
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
		return Livros;
	}
}
