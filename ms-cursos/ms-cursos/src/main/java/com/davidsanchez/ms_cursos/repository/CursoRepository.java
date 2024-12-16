package com.davidsanchez.ms_cursos.repository;

import com.davidsanchez.ms_cursos.entity.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, Integer> {


}
