package org.emsi.client;

import org.emsi.client.model.Client;
import org.emsi.client.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initialiserBaseH2 (ClientRepository clientRepository){
        return args -> {clientRepository.save(new Client(Long.parseLong("1"),"Imane", "chaourad", Float.parseFloat(("23"))));
        clientRepository.save(new Client(Long.parseLong("2"),"Imane2", "chaourad2", Float.parseFloat(("23"))));
            clientRepository.save(new Client(Long.parseLong("3"),"Imane3", "chaourad3", Float.parseFloat(("23"))));

        };
    }
}
