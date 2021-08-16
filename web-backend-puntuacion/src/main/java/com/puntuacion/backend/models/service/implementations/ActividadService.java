package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puntuacion.backend.models.entities.Actividad;
import com.puntuacion.backend.models.repositories.IActividad;
import com.puntuacion.backend.models.service.interfaces.IActividadService;

@Service
public class ActividadService implements IActividadService {

	@Autowired
    IActividad repository;

    @Override
    @Transactional
    public void save(Actividad Actividad){
        repository.save(Actividad);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Optional<Actividad> findById(Integer id){
        return repository.findById(id);
    }
    @Transactional
    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
   
    @Override
    @Transactional(readOnly=true)
    public List<Actividad> findAll(){
        return (List<Actividad>)repository.findAll();
    }
	
}
