package com.puntuacion.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.puntuacion.backend.models.entities.Equipo;

public interface IEquipo extends CrudRepository<Equipo, Integer> {

}
