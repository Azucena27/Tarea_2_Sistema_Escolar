package com.ulsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulsa.entity.Maestros;

public interface MaestrosRepository extends JpaRepository<Maestros, Long> {

	//List<Maestros> findByName(String name);
}
