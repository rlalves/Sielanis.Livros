package br.com.sielanis.livros;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sielanis.livros.entidades.Livro;
import br.com.sielanis.livros.repositorio.LivroRepositorio;

@RestController
public class LivroController {

	LivroRepositorio livroRepositorio;
	
	@RequestMapping("/teste")
	public String teste() 
	{
		livroRepositorio = new LivroRepositorio();
		return livroRepositorio.Teste();
	}
	
	@RequestMapping("/inserirlivro")
	public String InserirLivro(@RequestParam(value="titulo", defaultValue = "") String titulo, @RequestParam(value="autor", defaultValue = "") String autor, @RequestParam(value="paginas", defaultValue = "0") String paginas) {
		livroRepositorio = new LivroRepositorio();
		livroRepositorio.InserirLivro(titulo, autor, paginas);
		
		return "olha o log";
	}
	
	@RequestMapping("/listarlivros")
	public List<Livro> ListarLivros(){
		livroRepositorio = new LivroRepositorio();
		return livroRepositorio.ObterLivros();
	}
}
