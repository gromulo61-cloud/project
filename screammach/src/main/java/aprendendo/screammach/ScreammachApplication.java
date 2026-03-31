package aprendendo.screammach;

import aprendendo.screammach.model.DadosSerie;
import aprendendo.screammach.service.ConverterDados;
import aprendendo.screammach.service.consumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreammachApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreammachApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumo = new consumoAPI();
		var json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=8f1e415b");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
