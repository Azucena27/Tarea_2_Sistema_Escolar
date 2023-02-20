package com.ulsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulsa.entity.Alumnos;

public interface AlumnosRepository extends JpaRepository<Alumnos, Long> {

	//List<Alumnos> findByName(String name);
}
