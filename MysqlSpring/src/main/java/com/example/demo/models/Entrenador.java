package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Entrenador {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nombre;
	@Column
	private String nacionalidad;
	
	@OneToOne
	private Contrato contrato;
	
	public Entrenador() {}

	public Entrenador(Long id, String nombre, String nacionalidad, Contrato contrato) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.contrato = contrato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	
	
	
	
}
