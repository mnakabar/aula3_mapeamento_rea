package com.developper.sistemascurso.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "curso")
    private List <Modulo> modulos;

    @ManyToMany
    @JoinTable(name = "curso_aluno",
        joinColumns = @JoinColumn(name = "curso_id"),
        inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private List<Aluno> aluno;

    @OneToMany(mappedBy = "curso")
    private List<Matricula> matriculas;
}
