package com.developper.sistemascurso.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "matricula")
@Entity
public class Matricula {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_matricula")
    private LocalDateTime dateMatricula;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @OneToOne(mappedBy = "matricula")
    private Pagamento pagamento;
}
