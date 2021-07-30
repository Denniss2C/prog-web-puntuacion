package com.puntuacion.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.puntuacion.backend.models.entities.Calificacion;

public interface ICalificacionService {

	public void save(Calificacion calificacion);
	public Optional<Calificacion> findById(Integer id); 
	public void delete(Integer id);
	public List<Calificacion> findAll();
	
}
