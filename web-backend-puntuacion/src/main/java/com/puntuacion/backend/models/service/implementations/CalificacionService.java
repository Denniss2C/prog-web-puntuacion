package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntuacion.backend.models.entities.Calificacion;
import com.puntuacion.backend.models.repositories.ICalificacion;
import com.puntuacion.backend.models.service.interfaces.ICalificacionService;

@Service
public class CalificacionService implements ICalificacionService {

	@Autowired	
	ICalificacion repository; //<= DAO Data Access Objet
		
	@Override
	public void save(Calificacion calificacion) {
		repository.save(calificacion);
	}

	@Override
	public Optional<Calificacion> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);				
	}

	@Override
	public List<Calificacion> findAll() {		
		return (List<Calificacion>) repository.findAll();
	}
}
