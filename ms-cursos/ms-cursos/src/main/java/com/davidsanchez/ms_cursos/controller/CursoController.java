package com.davidsanchez.ms_cursos.controller;

import com.davidsanchez.ms_cursos.entity.Curso;
import com.davidsanchez.ms_cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/getMessage")
    public String getMessage() {
        String mensaje ;
        mensaje = "Hola estas consumiendo api dockerizada";
        return mensaje;
    }

    @GetMapping("/getAll")
    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }

    @GetMapping("/find{id}")
    public Curso getCursoById(@PathVariable int id) {
        return cursoRepository.findById(id).get();
    }

    @PostMapping("/insert")
    public  Curso saveCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }
}
