package com.developper.sistemascurso.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "pagamento")
@Entity
public class Pagamento {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private BigDecimal valor;

    @OneToOne
    @JoinColumn(name = "matricula_id")
    private Matricula matricula;
}
