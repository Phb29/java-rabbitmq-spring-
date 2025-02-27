package br.com.barbearia_paulo.repositories;

import br.com.barbearia_paulo.entities.CustomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomEntity,Long> {

}
