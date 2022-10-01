package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.MovieCatalog;

public interface JpaRepo extends CrudRepository<MovieCatalog, Integer>{

}
