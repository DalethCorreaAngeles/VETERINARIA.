package com.example.veterinaria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")

public class Mascota {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String nombre ;

    @Column(nullable = false)
    private String especie; //Perro, Gato, Loros, Iguana, Etc


    private String raza;

    @Column(nullable = false)
    private Integer edad;

    public Mascota(String raza, String nombre, String especie, Integer edad) {
        this.id = id;
        this.raza = raza;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
