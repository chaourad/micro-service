package org.emsi.voiture;
import org.emsi.voiture.model.Client;
import org.emsi.voiture.model.Voiture;
import org.emsi.voiture.repository.VoitureRepository;
import org.emsi.voiture.service.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableFeignClients

@SpringBootApplication
public class VoitureApplication {

	@Bean
	public CommandLineRunner initializeDatabase(
			VoitureRepository voitureRepository,
			ClientService clientService) {

		return args -> {

			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);

			System.out.println("**************************");
			System.out.println("Id est :" + c2.getId());
			System.out.println("Nom est :" + c2.getNom());
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id est :" + c1.getId());
			System.out.println("Nom est :" + c1.getNom());
			System.out.println("Nom est :" + c1.getAge());
			System.out.println("**************************");

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
}
