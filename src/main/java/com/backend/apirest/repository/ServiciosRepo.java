package com.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.apirest.model.MdlServicios;

public interface ServiciosRepo extends JpaRepository<MdlServicios, Integer> {

}
