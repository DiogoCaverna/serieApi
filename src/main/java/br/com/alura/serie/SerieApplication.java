package br.com.alura.serie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.serie.model.DadosSerie;
import br.com.alura.serie.service.ConsumoAPI;
import br.com.alura.serie.service.ConverteDados;

@SpringBootApplication
public class SerieApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SerieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'run'");
		//System.out.println("Primeiro Projeto Spring");

		ConsumoAPI consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=6585022c");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class); 
		System.out.println(dados);

		//json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
        //System.out.println(json);
	}

}
