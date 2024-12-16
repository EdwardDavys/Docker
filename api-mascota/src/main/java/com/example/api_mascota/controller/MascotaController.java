package com.example.api_mascota.controller;

import com.example.api_mascota.entity.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.api_mascota.repository.MascotaRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MascotaController {

    @Autowired
    MascotaRepository repository;

    @GetMapping("/getAll")
    public List<Mascota> getAllMascota() {
        return repository.findAll();
    }

    @PostMapping("/save")
    public Mascota save(@RequestBody Mascota mascota) {
        return repository.save(mascota);
    }
}
