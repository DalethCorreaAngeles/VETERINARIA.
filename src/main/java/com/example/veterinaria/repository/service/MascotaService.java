package com.example.veterinaria.repository.service;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.MascotaRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MascotaService {
    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository){
        this.mascotaRepository = mascotaRepository;
    }

    //1. Listar todas las mascotas
    public List<Mascota> listarTodas(){
        return mascotaRepository.findAll();
    }

    //2. Obtener mascota(s) por id
    public Optional<Mascota> buscarPorId(Integer id){
        return  mascotaRepository.findById(id);
    }

    //3. Crear Mascota
    public Mascota crearMascota(Mascota mascota){
        return mascotaRepository.save(mascota);
    }

    //4. Actualizar una mascota
    public Mascota actualizarMascota(Integer id, Mascota mascota ){
        mascota.setId(id);
        return mascotaRepository.save(mascota);
    }
    //5. Eliminamos Mascota
    public void eliminarMascota(Integer id){
        mascotaRepository.deleteById(id);
    }
}
