package br.com.sielanis.livros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sielanis.livros.repositorio.LogRepositorio;

@RestController
public class LogController {

	LogRepositorio logRepositorio;
	
	@RequestMapping("/inserirlog")
	public String InserirLog(@RequestParam(value="create_time", defaultValue = "2000-01-01") String create_time) {
		logRepositorio = new LogRepositorio();
		logRepositorio.InserirLog(create_time);
		
		return "olha o log";
	}
}
