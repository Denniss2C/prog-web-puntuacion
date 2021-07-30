package com.puntuacion.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.puntuacion.backend.models.entities.Calificacion;

public interface ICalificacion extends CrudRepository<Calificacion, Integer> {

}
