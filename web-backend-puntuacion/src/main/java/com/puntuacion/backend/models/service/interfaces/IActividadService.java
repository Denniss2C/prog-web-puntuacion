package com.puntuacion.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.puntuacion.backend.models.entities.Actividad;

public interface IActividadService {

	public void save(Actividad actividad);
	public Optional<Actividad> findById(Integer id); 
	public void delete(Integer id);
	public List<Actividad> findAll();
	
}
