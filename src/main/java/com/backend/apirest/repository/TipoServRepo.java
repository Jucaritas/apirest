package com.backend.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.apirest.model.TipoServicios;

@Repository
public interface TipoServRepo extends JpaRepository<TipoServicios, Integer> {

	@Query(value = "select a from TipoServicios a ORDER BY a.cve_tipo_serv asc")
	List<TipoServicios> orderByCve();
	
	
}
