package com.puntuacion.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="calificaciones")
public class Calificacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_Calificacion")
	private Integer idCalificacion;
	
	@Column(name="puntaje")
	private Float puntaje;
	
	@Column(name="observacion")
	private String observacion;
	
	@JoinColumn(name="id_Actividad", referencedColumnName= "id_Actividad")
	@ManyToOne
	private Actividad actividad;
	
	@JoinColumn(name = "id_Juez", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Juez juez;

	public Calificacion() {
		super();
	}
	
	public Calificacion(Integer idCalificacion) {
		super();
		this.idCalificacion = idCalificacion;
	}

	public Integer getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(Integer idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public Float getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Float puntaje) {
		this.puntaje = puntaje;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
	
}
