package com.ulsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulsa.entity.Clases;

public interface ClasesRepository extends JpaRepository<Clases, Long> {

	//List<Clases> findByName(String name);
}
