package com.puntuacion.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.puntuacion.backend.models.entities.Equipo;

public interface IEquipoService {

	public void save(Equipo equipo);
	public Optional<Equipo> findById(Integer id); 
	public void delete(Integer id);
	public List<Equipo> findAll();
}
