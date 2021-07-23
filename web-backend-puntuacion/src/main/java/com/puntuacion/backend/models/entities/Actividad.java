package com.puntuacion.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actividades")
public class Actividad implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_Actividad")
	private Integer idActividad;
	
	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="promedio")
	private Float promedio;

	public Actividad() {
		super();
	}
	
	public Actividad(Integer idActividad) {
		super();
		this.idActividad = idActividad;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getPromedio() {
		return promedio;
	}

	public void setPromedio(Float promedio) {
		this.promedio = promedio;
	}
	
	
	
	
	
}
