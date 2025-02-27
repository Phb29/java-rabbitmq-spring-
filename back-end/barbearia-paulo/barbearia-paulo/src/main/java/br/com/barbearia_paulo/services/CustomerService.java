package br.com.barbearia_paulo.services;

import br.com.barbearia_paulo.dtos.CustomerDTO;
import br.com.barbearia_paulo.entities.CustomEntity;

public interface CustomerService {
    CustomerDTO create(CustomerDTO customEntity);
}
