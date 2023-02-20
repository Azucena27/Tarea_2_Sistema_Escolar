package com.ulsa.entity;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "maestros")
public class Maestros {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Nonnull
	private String nombre;
	@Nonnull
	private String apellido;
	@Nonnull
	private String edad;
	@Nonnull
	private String telefono;
	@Nonnull
	private String email;
	@Nonnull
	private Grupos gradoAcademico;
	
	@OneToMany(mappedBy = "maestro")
	private List<Materias> materias;

	
	public Maestros() {
		super();
	}


	public Maestros(long id, String nombre, String apellido, String edad, String telefono, String email,
			Grupos gradoAcademico, List<Materias> materias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
		this.gradoAcademico = gradoAcademico;
		this.materias = materias;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Grupos getGradoAcademico() {
		return gradoAcademico;
	}


	public void setGradoAcademico(Grupos gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}


	public List<Materias> getMaterias() {
		return materias;
	}


	public void setMaterias(List<Materias> materias) {
		this.materias = materias;
	}

	
}



