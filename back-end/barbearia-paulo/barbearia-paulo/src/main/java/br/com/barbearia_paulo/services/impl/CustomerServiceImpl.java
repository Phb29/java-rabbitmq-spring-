package br.com.barbearia_paulo.services.impl;

import br.com.barbearia_paulo.dtos.CustomerDTO;
import br.com.barbearia_paulo.entities.CustomEntity;
import br.com.barbearia_paulo.repositories.CustomerRepository;
import br.com.barbearia_paulo.services.CustomerService;
import br.com.barbearia_paulo.utils.ConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl  implements CustomerService {

   @Autowired
    private CustomerRepository customerRepository;

    private final ConverterUtil<CustomEntity,CustomerDTO> convertUtil  =
            new ConverterUtil<>(CustomEntity.class,CustomerDTO.class);

    @Override
    public CustomerDTO create(CustomerDTO customDto) {

CustomEntity customEntity = convertUtil.convertToSource(customDto);
CustomEntity savedCustomer = customerRepository.save(customEntity);
return  convertUtil.convertToTarget(savedCustomer);

  /* CustomEntity  custom =  CustomEntity.builder()
           .name(customDto.getName())
           .email(customDto.getEmail())
           .phone(customDto.getPhone()).build();

  CustomEntity customTwo = customerRepository.save(custom);

  return  CustomerDTO.builder()
          .id(customTwo.getId())
          .name(customTwo.getName())
          .email(customTwo.getEmail())
          .phone(customTwo.getPhone())
          .build();
*/


    }
}
