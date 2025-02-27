package br.com.barbearia_paulo.controllers;

import br.com.barbearia_paulo.dtos.CustomerDTO;
import br.com.barbearia_paulo.entities.CustomEntity;
import br.com.barbearia_paulo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;  // Adicionar isso
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    ResponseEntity<CustomerDTO> create(@RequestBody CustomerDTO customEntity) {  // Modificar o parâmetro
        return ResponseEntity.ok(customerService.create(customEntity));
    }
}
