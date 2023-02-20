package com.ulsa.entity;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "materias")
public class Materias {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Nonnull
	private String nombre;
	@ManyToOne
	private Maestros maestro;
	
	@OneToMany(mappedBy = "materia")
	private List<Calificaciones> calificaciones;
	
	@OneToMany(mappedBy = "materia")
	private List<Clases> clases;
	
	public Materias() {
		super();
	}

	public Materias(long id, String nombre, Maestros maestro, List<Calificaciones> calificaciones,
			List<Clases> clases) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.maestro = maestro;
		this.calificaciones = calificaciones;
		this.clases = clases;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Maestros getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestros maestro) {
		this.maestro = maestro;
	}

	public List<Calificaciones> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Calificaciones> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public List<Clases> getClases() {
		return clases;
	}

	public void setClases(List<Clases> clases) {
		this.clases = clases;
	}

	
	
}


	
	