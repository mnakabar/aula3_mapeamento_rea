package com.developper.sistemascurso.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "aluno")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Aluno {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @ManyToMany(mappedBy = "aluno")
    private List<Curso> cursos;
}
