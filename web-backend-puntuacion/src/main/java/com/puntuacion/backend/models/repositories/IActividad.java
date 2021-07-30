package com.puntuacion.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.puntuacion.backend.models.entities.Actividad;

public interface IActividad extends CrudRepository<Actividad, Integer> {

}
