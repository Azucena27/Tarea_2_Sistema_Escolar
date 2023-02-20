package com.ulsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulsa.entity.Materias;

public interface MateriasRepository extends JpaRepository<Materias, Long> {

	//List<Materias> findByName(String name);

}
