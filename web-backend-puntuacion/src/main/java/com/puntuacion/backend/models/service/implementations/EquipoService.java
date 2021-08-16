package com.puntuacion.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puntuacion.backend.models.entities.Equipo;
import com.puntuacion.backend.models.repositories.IEquipo;
import com.puntuacion.backend.models.service.interfaces.IEquipoService;

@Service
public class EquipoService implements IEquipoService {

	@Autowired
    IEquipo repository;

    @Override
    @Transactional
    public void save(Equipo Equipo){
        repository.save(Equipo);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Optional<Equipo> findById(Integer id){
        return repository.findById(id);
    }
    @Transactional
    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
   
    @Override
    @Transactional(readOnly=true)
    public List<Equipo> findAll(){
        return (List<Equipo>)repository.findAll();
    }
}
