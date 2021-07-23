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
@Table(name="jueces")
public class Juez implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_Juez")
	private Integer idJuez;
	
	@Column(name="licencia")
	private String licencia;
	
	@Column(name="desde")
	private Calendar desde;

	public Juez() {
		super();
	}
	
	public Juez(Integer idJuez) {
		super();
		this.idJuez = idJuez;
	}

	public Integer getIdJuez() {
		return idJuez;
	}

	public void setIdJuez(Integer idJuez) {
		this.idJuez = idJuez;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Calendar getDesde() {
		return desde;
	}

	public void setDesde(Calendar desde) {
		this.desde = desde;
	}
	
}
