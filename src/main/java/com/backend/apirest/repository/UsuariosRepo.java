package com.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.apirest.model.UsuariosModel;


public interface UsuariosRepo extends JpaRepository<UsuariosModel, Integer>{
	
}
