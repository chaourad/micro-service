package org.emsi.voiture.service;

import org.emsi.voiture.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService {

    @GetMapping("/clients/{id}")
    public Client clientById(@PathVariable Long id);
}