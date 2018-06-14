package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Contrato {
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	@Column
	private Integer duracion;
	
	@Column
	private Long salarioAnual;
	
	@OneToOne
	private Entrenador entrenador;

	public Contrato() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Contrato(Long id, Integer duracion, Long salarioAnual, Entrenador entrenador) {
		super();
		this.id = id;
		this.duracion = duracion;
		this.salarioAnual = salarioAnual;
		this.entrenador = entrenador;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Long getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(Long salarioAnual) {
		this.salarioAnual = salarioAnual;
	}



	public Entrenador getEntrenador() {
		return entrenador;
	}



	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	
	

}
