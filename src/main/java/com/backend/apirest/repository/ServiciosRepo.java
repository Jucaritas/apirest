package com.backend.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.apirest.model.MdlServicios;

@Repository
public interface ServiciosRepo extends JpaRepository<MdlServicios, Integer> {

	@Query(value = "select a from MdlServicios a ORDER BY a.id asc")
	List<MdlServicios> orderServiciosById();
	
}
