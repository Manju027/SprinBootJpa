package com.example.demo.contoller;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MovieCatalog;
import com.example.demo.repo.JpaRepo;

@RestController
@RequestMapping("/Manju")
public class WelcomeController {
	
	@Autowired
	JpaRepo repo;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Hi welcome to spring boot";
	}

	@RequestMapping("/movies")
	public List<MovieCatalog> movie(){
		
		MovieCatalog m = new MovieCatalog(1,"Kantara");
		repo.save(m);
		List<MovieCatalog> movie = new ArrayList<>();
		
		repo.findAll().forEach(movie::add);
		
		return movie;
	}
}
