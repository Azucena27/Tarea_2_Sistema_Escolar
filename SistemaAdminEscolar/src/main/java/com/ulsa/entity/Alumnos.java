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
@Table(name = "alumnos")
public class Alumnos {

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
	
	@ManyToOne
	private Grupos grupo;
	
	@OneToMany(mappedBy = "alumno")
	private List<Calificaciones> calificaciones;
	
	public Alumnos() {
		super();
	}


	public Alumnos(long id, String nombre, String apellido, String edad, String telefono, String email, Grupos grupo,
			List<Calificaciones> calificaciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
		this.grupo = grupo;
		this.calificaciones = calificaciones;
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

	public Grupos getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupos grupo) {
		this.grupo = grupo;
	}


	public List<Calificaciones> getCalificaciones() {
		return calificaciones;
	}


	public void setCalificaciones(List<Calificaciones> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	
}


	