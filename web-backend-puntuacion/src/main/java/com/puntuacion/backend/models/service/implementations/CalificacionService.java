package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puntuacion.backend.models.entities.Calificacion;
import com.puntuacion.backend.models.repositories.ICalificacion;
import com.puntuacion.backend.models.service.interfaces.ICalificacionService;

@Service
public class CalificacionService implements ICalificacionService {

	@Autowired
    ICalificacion repository;

    @Override
    @Transactional
    public void save(Calificacion Calificacion){
        repository.save(Calificacion);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Optional<Calificacion> findById(Integer id){
        return repository.findById(id);
    }
    @Transactional
    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
   
    @Override
    @Transactional(readOnly=true)
    public List<Calificacion> findAll(){
        return (List<Calificacion>)repository.findAll();
    }
}
