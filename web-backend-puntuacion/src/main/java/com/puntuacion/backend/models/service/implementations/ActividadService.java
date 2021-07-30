package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntuacion.backend.models.entities.Actividad;
import com.puntuacion.backend.models.repositories.IActividad;
import com.puntuacion.backend.models.service.interfaces.IActividadService;

@Service
public class ActividadService implements IActividadService {

	@Autowired	
	IActividad repository; //<= DAO Data Access Objet
		
	@Override
	public void save(Actividad actividad) {
		repository.save(actividad);
	}

	@Override
	public Optional<Actividad> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);				
	}

	@Override
	public List<Actividad> findAll() {		
		return (List<Actividad>) repository.findAll();
	}
	
}
