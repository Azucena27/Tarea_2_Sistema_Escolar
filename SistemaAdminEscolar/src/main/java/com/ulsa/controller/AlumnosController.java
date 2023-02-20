package com.ulsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ulsa.entity.Alumnos;
import com.ulsa.repository.AlumnosRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

@Controller
public class AlumnosController {
	
	private final AlumnosRepository alumnosRepository;
	
	@Autowired
	public AlumnosController(AlumnosRepository alumnosRepository) {
		this.alumnosRepository = alumnosRepository; 
	}
	
	@GetMapping("/alumnos")
	public String indexAlumnos(Model model) {
		System.out.println("&&&&& indexAlumnos &&&&&&");
		model.addAttribute("alumnos", alumnosRepository.findAll());
		return "alumnos/index-alumnos";
		
	}
	
	@PostMapping("/agregar-alumno")
	public String addUser(@Validated Alumnos alumno, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "alumnos/agregar-alumno";
		}
		alumnosRepository.save(alumno);
		model.addAttribute("alumnos", alumnosRepository.findAll());
		return "alumnos/index-alumnos";
	}
	
	@GetMapping("/nuevo")
	public String showSignUpForm(Alumnos alumno) {
		System.out.println("&&&&& showSignUpForm &&&&&&");
		return "alumnos/agregar-alumno";
	}
	
	@GetMapping("/editar/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		Alumnos alumno =
				alumnosRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Alumno inválido Id:" + id));
		model.addAttribute("alumno", alumno);
		return "alumnos/actualizar-alumno";
	}
	
	@GetMapping("/eliminar/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Alumnos alumno =
			alumnosRepository
				.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Alumno inválido Id:" + id));
		alumnosRepository.delete(alumno);
		model.addAttribute("alumnos", alumnosRepository.findAll());
		return "alumnos/index-alumnos";
	}
	
	@PostMapping("/actualizar/{id}")
	public String updateUser(@PathVariable("id") long id, @Validated Alumnos alumno,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			alumno.setId(id);
			return "alumnos/actualizar-alumno";
		}
		alumnosRepository.save(alumno);
		model.addAttribute("customers", alumnosRepository.findAll());
		return "alumnos/index-alumnos";
	}
	

}

