package com.backend.apirest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirest.service.UsuariosService;
import com.backend.apirest.model.UsuariosModel;

@RestController
@RequestMapping("/api")
public class UsuariosController {

	@Autowired
	private UsuariosService uService;
	
	@GetMapping("/")
	public List<UsuariosModel> list()
	{
		return uService.listAllUser();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<UsuariosModel> get(@PathVariable Integer id) {
        try {
        	UsuariosModel user = uService.getUser(id);
            return new ResponseEntity<UsuariosModel>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UsuariosModel>(HttpStatus.NOT_FOUND);
        }
    }
	
	@PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody UsuariosModel user) {
        uService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Se ha creado el usuario con exito!");
    }
	
	@PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody UsuariosModel user, @PathVariable Integer id) {
        try {
        	user.setId(id);            
            uService.saveUser(user);
            //return new ResponseEntity<>(HttpStatus.OK);
            return ResponseEntity.status(HttpStatus.OK).body("Se actualizo al usuario con exito");
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        uService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("El usuario fue eliminado");
    }
}
