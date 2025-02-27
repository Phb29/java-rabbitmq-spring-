package br.com.barbearia_paulo.entities;

import jakarta.persistence.*;  // Importa as anotações JPA para mapeamento de entidades e relacionamentos
import lombok.*;  // Importa as anotações do Lombok para gerar código automaticamente

import java.time.LocalDateTime;  // Importa a classe LocalDateTime para manipulação de datas e horas

@Getter  // Gera automaticamente os métodos getters para todos os campos da classe
@Setter  // Gera automaticamente os métodos setters para todos os campos da classe
@NoArgsConstructor  // Gera um construtor sem argumentos
@AllArgsConstructor  // Gera um construtor com todos os argumentos (todos os campos)
@Entity  // Indica que essa classe é uma entidade JPA (vai ser mapeada para uma tabela no banco)
@Builder  // Permite usar o padrão de design "Builder" para criar instâncias dessa classe de forma fluída
@Table(name = "appointments")  // Define o nome da tabela no banco de dados, que será "appointments"
public class AppointEntity extends BaseEntity {  // Extende a classe BaseEntity (que provavelmente contém ID e timestamps)

    @Column(nullable = false, updatable = true)  // Define a coluna como não-nula e atualizável
    private LocalDateTime dateTime;  // A data e hora do agendamento

    @Column(nullable = false)  // Define a coluna como não-nula
    private Boolean appointmentsOpen;  // Define se o agendamento está aberto ou não

    @ManyToOne(fetch = FetchType.LAZY)  // Relacionamento muitos-para-um com a entidade CustomEntity
    //Lazy os dados so vao carregar quando necessario
    @JoinColumn(name = "customer_id", nullable = true)  // Define a chave estrangeira "customer_id", que pode ser nula
    @ToString.Exclude  // Exclui o campo de aparecer no método toString()
    @EqualsAndHashCode.Exclude  // Exclui o campo da comparação de igualdade e hashCode
    private CustomEntity customer;  // A entidade associada ao cliente

    @ManyToOne(fetch = FetchType.LAZY)  // Relacionamento muitos-para-um com a entidade BeautyProceduresEntity
    @JoinColumn(name = "beauty_procedure_id", nullable = true)  // Define a chave estrangeira "beauty_procedure_id", que pode ser nula
    @ToString.Exclude  // Exclui o campo de aparecer no método toString()
    @EqualsAndHashCode.Exclude  // Exclui o campo da comparação de igualdade e hashCode
    private BeautyProceduresEntity beautyProcedure;  // A entidade associada ao procedimento de beleza
}
