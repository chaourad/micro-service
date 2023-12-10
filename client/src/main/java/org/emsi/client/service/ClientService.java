package org.emsi.client.service;

import org.emsi.client.model.Client;
import org.emsi.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client FindClientById(Long id){
        return clientRepository.findById(id).orElseThrow(()-> new ExpressionException("client nexit pas "));
    }


}
