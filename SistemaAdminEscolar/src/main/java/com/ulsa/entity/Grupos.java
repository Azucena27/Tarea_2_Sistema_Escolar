package com.ulsa.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupos")
public class Grupos implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Nonnull
	private Integer grado;
	@Nonnull
	private String grupoNombre;
	
	@OneToMany(mappedBy = "grupo")
	private List<Alumnos> alumnos;
	
	@OneToMany(mappedBy = "grupo")
	private List<Clases> clases;

	
	public Grupos() {
		super();
	}

	public Grupos(long id, Integer grado, String grupoNombre, List<Alumnos> alumnos, List<Clases> clases) {
		super();
		this.id = id;
		this.grado = grado;
		this.grupoNombre = grupoNombre;
		this.alumnos = alumnos;
		this.clases = clases;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Number getGrado() {
		return grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}

	public String getGrupo() {
		return grupoNombre;
	}

	public void setGrupo(String grupo) {
		this.grupoNombre = grupo;
	}

	public List<Alumnos> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Clases> getClases() {
		return clases;
	}

	public void setClases(List<Clases> clases) {
		this.clases = clases;
	}
	
	
}
