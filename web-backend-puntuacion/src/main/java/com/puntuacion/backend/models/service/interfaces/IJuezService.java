package com.puntuacion.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.puntuacion.backend.models.entities.Juez;

public interface IJuezService {

	public void save(Juez juez);
	public Optional<Juez> findById(Integer id); 
	public void delete(Integer id);
	public List<Juez> findAll();
}
