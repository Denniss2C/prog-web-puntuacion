package com.puntuacion.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntuacion.backend.models.entities.Equipo;
import com.puntuacion.backend.models.service.interfaces.IEquipoService;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

	@Autowired
    IEquipoService service;


    //Retriebe
    @GetMapping("/{id}")
    public ResponseEntity<?> retrieve(@PathVariable Integer id){
        try {
            Optional<Equipo> admin = service.findById(id);
            if(admin.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipo no encontrado");
            }
            return ResponseEntity.ok(admin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    //Create

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Equipo admin){
        try {
            service.save(admin);
            return ResponseEntity.status(HttpStatus.CREATED).body(admin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    //Update
    @PostMapping("/update{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Equipo admin){
        try {
            admin.setIdEquipo(id);
            service.save(admin);
            return ResponseEntity.status(HttpStatus.CREATED).body(admin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/list")
    public ResponseEntity<?> list(){
        try {
            List<Equipo> admins = service.findAll();
            if(admins.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se han registrados Equipos");
            }
            return ResponseEntity.ok(admins);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        try {
            Optional<Equipo> admin = service.findById(id);
            if(admin.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Equipo no encontrado");
            }
            service.delete(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(admin);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
