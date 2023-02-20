package com.ulsa.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificaciones")
public class Calificaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Nonnull
	private String calificacion;
	@ManyToOne
	private Materias materia;
	@ManyToOne
	private Alumnos alumno;
	
	public Calificaciones() {
		super();
	}

	public Calificaciones(long id, String calificacion, Materias materia, Alumnos alumno) {
		super();
		this.id = id;
		this.calificacion = calificacion;
		this.materia = materia;
		this.alumno = alumno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public Materias getMateria() {
		return materia;
	}

	public void setMateria(Materias materia) {
		this.materia = materia;
	}

	public Alumnos getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumnos alumno) {
		this.alumno = alumno;
	}
}
