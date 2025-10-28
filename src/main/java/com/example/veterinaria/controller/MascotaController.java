package com.example.veterinaria.controller;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.service.MascotaService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController (MascotaService mascotaService){
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public List<Mascota> obtenerMascotas(){
        return mascotaService.listarTodas()
    }

    @GetMapping ("/{id")
    public ResponseEntity<Mascota>
    obtenerMascotasPorId(@PathVariable Integer id){
        return mascotaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}
