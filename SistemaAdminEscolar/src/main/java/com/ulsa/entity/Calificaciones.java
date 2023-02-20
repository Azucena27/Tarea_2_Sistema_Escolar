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
	
}
