package com.backend.apirest.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.dto.UsuariosDto;
import com.backend.apirest.model.UsuariosModel;
import com.backend.apirest.repository.UsuariosRepo;
import com.backend.apirest.service.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService{

	@Autowired
	private UsuariosRepo usuariosRepo;
	
	@Override
	public List<UsuariosDto> listAllUser() throws Exception {
		List<UsuariosModel> usuarios = usuariosRepo.findAll();
		// TODO Auto-generated method stub
		return convertListEntityToDto(usuarios);
	}
	
	private List<UsuariosDto> convertListEntityToDto(List<UsuariosModel> user) {
		List<UsuariosDto> u = new ArrayList<UsuariosDto>();
		for(UsuariosModel uModel: user) {
			UsuariosDto usuario = new UsuariosDto();
			usuario.setNombres(uModel.getNombres());
			usuario.setApellidos(uModel.getApellidos());
			usuario.setDireccion(uModel.getDireccion());
			usuario.setTelefono(uModel.getTelefono());
			usuario.setEmail(uModel.getEmail());
			
			u.add(usuario);
		}
		return u;
	}

	@Override
	public String saveUser(UsuariosDto user) throws Exception {
		UsuariosModel _user = convertDtoToEntity(user);
		usuariosRepo.save(_user);
		return null;
	}
	
	private UsuariosModel convertDtoToEntity(UsuariosDto usuario) {
		UsuariosModel u = new UsuariosModel();
		
		u.setNombres(usuario.getNombres());
		u.setApellidos(usuario.getApellidos());
		u.setDireccion(usuario.getDireccion());
		u.setTelefono(usuario.getTelefono());
		u.setEmail(usuario.getEmail());
		
		return u;
	}

	@Override
	public UsuariosDto getUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUsuario(UsuariosDto user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
