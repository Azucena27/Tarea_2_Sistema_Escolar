package com.ulsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulsa.entity.Grupos;

public interface GruposRepository  extends JpaRepository<Grupos, Long> {

	//List<Grupos> findByName(String name);
}
