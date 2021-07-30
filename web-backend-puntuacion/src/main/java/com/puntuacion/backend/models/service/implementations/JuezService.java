package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntuacion.backend.models.entities.Juez;
import com.puntuacion.backend.models.repositories.IJuez;
import com.puntuacion.backend.models.service.interfaces.IJuezService;

@Service
public class JuezService implements IJuezService {

	@Autowired	
	IJuez repository; //<= DAO Data Access Objet
		
	@Override
	public void save(Juez juez) {
		repository.save(juez);
	}

	@Override
	public Optional<Juez> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);				
	}

	@Override
	public List<Juez> findAll() {		
		return (List<Juez>) repository.findAll();
	}
}
