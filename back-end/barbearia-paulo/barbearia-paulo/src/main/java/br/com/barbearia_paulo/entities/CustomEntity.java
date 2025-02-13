package br.com.barbearia_paulo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter // Gera automaticamente os métodos `get` para os atributos da classe
@Setter // Gera automaticamente os métodos `set` para os atributos da classe
@NoArgsConstructor // Cria um construtor sem argumentos (necessário para o JPA)
@AllArgsConstructor // Cria um construtor com todos os atributos da classe
@Builder // Permite criar objetos da classe de forma mais flexível e fluida

@Entity // Indica que esta classe é uma entidade JPA (será mapeada para uma tabela no banco de dados)
@Table(name = "customer") // Especifica o nome da tabela correspondente no banco de dados
public class CustomEntity extends BaseEntity {

    @Column(nullable = false, length = 100) // Define que esta coluna não pode ser nula e tem limite de 100 caracteres
    private String name;

    @Column(nullable = false, length = 100) // Define que esta coluna não pode ser nula e tem limite de 100 caracteres
    private String email;
}
