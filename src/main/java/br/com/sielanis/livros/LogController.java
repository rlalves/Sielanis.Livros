package br.com.sielanis.livros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
        SimpleDateFormat formata = new SimpleDateFormat("yyyy-MM-dd");
        Date data;
        
		try {
			data = formata.parse(create_time);
			logRepositorio.InserirLog(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "olha o log";
	}
}
