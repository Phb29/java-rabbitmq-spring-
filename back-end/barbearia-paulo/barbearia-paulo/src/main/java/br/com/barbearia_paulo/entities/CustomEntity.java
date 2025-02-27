package br.com.barbearia_paulo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @Column(nullable = true, length = 100) // Define que esta coluna não pode ser nula e tem limite de 100 caracteres
    private String email;

    @Column(nullable = false, length = 100)
    private String phone;

    @JsonIgnore // Usar @JsonIgnore é uma maneira de controlar a exposição de dados e garantir que a
    // resposta de uma API não contenha informações desnecessárias ou que não se deve enviar
    // para o cliente. Em cenários de relacionamentos bidirecionais (como o seu)
    // , o uso de @JsonIgnore ajuda a evitar problemas
    // como loops infinitos.
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    //Cascada tudo q propragar no objeti vau propagar tambem,orphanRemoval = true
    //se for removido de apppinmt tambem sera removido do banco de dados
    @ToString.Exclude // Exclui o campo do método toString()
    @EqualsAndHashCode.Exclude // Exclui o campo dos métodos equals() e hashCode()
    private List<AppointEntity> appointments;
}
