package com.davidsanchez.ms_cursos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "curso_collection")
public class Curso {

    private Integer id;
    private String nombre;
    private int creditos;
}
