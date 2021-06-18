package com.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.apirest.model.DependenciasTipo;

public interface TipoDependencia extends JpaRepository<DependenciasTipo, Integer> {

}
