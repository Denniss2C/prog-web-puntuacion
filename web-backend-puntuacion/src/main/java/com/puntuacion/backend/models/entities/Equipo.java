package com.puntuacion.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_Equipo")
	private Integer idEquipo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="integrantes")
	private Integer integrantes;

	public Equipo() {
		super();
	}
	
	public Equipo(Integer idEquipo) {
		super();
		this.idEquipo = idEquipo;
	}

	public Integer getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integer integrantes) {
		this.integrantes = integrantes;
	}
	
	
	
}
