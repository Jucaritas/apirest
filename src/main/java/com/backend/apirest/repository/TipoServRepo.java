package com.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.apirest.model.TipoServicios;

public interface TipoServRepo extends JpaRepository<TipoServicios, Integer> {

}
