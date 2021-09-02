
package com.backend.apirest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.apirest.dto.UsuariosDto;

@Service
public interface UsuariosService {
	
	List<UsuariosDto> listAllUser() throws Exception;
    String saveUser(UsuariosDto user) throws Exception;
    UsuariosDto getUser(Integer id) throws Exception;
    String updateUsuario(UsuariosDto user) throws Exception;
    String deleteUser(Integer id) throws Exception;
    
}