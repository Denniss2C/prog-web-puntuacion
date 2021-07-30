package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntuacion.backend.models.entities.Equipo;
import com.puntuacion.backend.models.repositories.IEquipo;
import com.puntuacion.backend.models.service.interfaces.IEquipoService;

@Service
public class EquipoService implements IEquipoService {

	@Autowired	
	IEquipo repository; //<= DAO Data Access Objet
		
	@Override
	public void save(Equipo equipo) {
		repository.save(equipo);
	}

	@Override
	public Optional<Equipo> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);				
	}

	@Override
	public List<Equipo> findAll() {		
		return (List<Equipo>) repository.findAll();
	}
}
