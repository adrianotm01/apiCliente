package br.com.mand.apiCliente.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.mand.apiCliente.model.Client;
import br.com.mand.apiCliente.repository.ClientRepository;

@Configuration
public class AppConfig {

	@Autowired
	private ClientRepository clientRepository;
	
	@Bean
	public CommandLineRunner createClients() {
		return (s) -> {
			this.clientRepository.save(new Client(null,"Adriano","018325465265","Rua la alala"));
		};
	}
	
}
