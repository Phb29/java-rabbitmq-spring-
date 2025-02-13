package br.com.barbearia_paulo.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "beauty_procedures")
public class BeautyProceduresEntity extends BaseEntity {

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;
}
