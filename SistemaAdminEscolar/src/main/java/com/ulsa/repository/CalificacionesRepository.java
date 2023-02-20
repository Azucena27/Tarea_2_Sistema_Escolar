package com.ulsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulsa.entity.Calificaciones;

public interface CalificacionesRepository  extends JpaRepository<Calificaciones, Long> {

	//List<Calificaciones> findByName(String name);
}
