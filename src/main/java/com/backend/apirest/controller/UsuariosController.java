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

import com.backend.apirest.dto.UsuariosDto;
import com.backend.apirest.service.UsuariosService;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	private UsuariosService uService;
	
	@GetMapping("/lista")
	public List<UsuariosDto> list() throws Exception
	{
		return uService.listAllUser();
	}

	
	@PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody UsuariosDto user) throws Exception {
        uService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Se ha creado el usuario con exito!");
    }
	
	@PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody UsuariosDto user, @PathVariable Integer id) throws Exception {
        try {          
            uService.updateUsuario(user);
            //return new ResponseEntity<>(HttpStatus.OK);
            return ResponseEntity.status(HttpStatus.OK).body("Se actualizo al usuario con exito");
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) throws Exception {
        uService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("El usuario fue eliminado");
    }
}
