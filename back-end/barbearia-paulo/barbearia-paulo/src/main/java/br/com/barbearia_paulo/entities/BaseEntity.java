package br.com.barbearia_paulo.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Getter
@Setter
@MappedSuperclass
// super class  q serve de base para outras q vão herdar dela
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Indentity será gerada de forma automática pela base de Dados
    private Long id;

    @CreationTimestamp
    //creation será automaticamnte preenchido com tiemstamp da entidade esse e o update gerado pelo hibernate
    @Column
    private LocalDateTime created;

    @UpdateTimestamp
    @Column
    private LocalDateTime updated;

}
