
package com.backend.apirest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.model.UsuariosModel;
import com.backend.apirest.repository.UsuariosRepo;

@Service
@Transactional
public class UsuariosService {

	@Autowired
	private UsuariosRepo usuariosRepo;
	
	public List<UsuariosModel> listAllUser() {
        return usuariosRepo.findAll();
    }

    public void saveUser(UsuariosModel user) {
    	usuariosRepo.save(user);
    }

    public UsuariosModel getUser(Integer id) {
        return usuariosRepo.findById(id).get();
    }

    public void deleteUser(Integer id) {
    	usuariosRepo.deleteById(id);
    }
    
}