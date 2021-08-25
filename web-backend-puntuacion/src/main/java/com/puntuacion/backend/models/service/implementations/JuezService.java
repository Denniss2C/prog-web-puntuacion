package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puntuacion.backend.models.entities.Juez;
import com.puntuacion.backend.models.repositories.IJuez;
import com.puntuacion.backend.models.service.interfaces.IJuezService;

@Service
public class JuezService implements IJuezService {

	@Autowired
    IJuez repository;

    @Override
    @Transactional
    public void save(Juez Juez){
        repository.save(Juez);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Optional<Juez> findById(Integer id){
        return repository.findById(id);
    }
    @Transactional
    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
   
    @Override
    @Transactional(readOnly=true)
    public List<Juez> findAll(){
        return (List<Juez>)repository.findAll();
    }
}
