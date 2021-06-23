package com.backend.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.apirest.model.DependenciasMdl;

@Repository
public interface DependenciasRepo extends JpaRepository<DependenciasMdl,Integer> {

	@Query(value="select a from DependenciasMdl a order by a.id asc")
	List<DependenciasMdl> getListOrdById();
	
}
