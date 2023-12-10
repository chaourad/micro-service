package org.emsi.client.controller;

import org.emsi.client.model.Client;
import org.emsi.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;
    @GetMapping("/clients")
    public List<Client> findAll(){
        return clientService.findAll();
    }

    @GetMapping("/clients/id/{id}")
    public Client findClientById(@PathVariable Long id){
        return clientService.FindClientById(id);
    }
}
