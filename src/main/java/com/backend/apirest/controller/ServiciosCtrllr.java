package com.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirest.model.MdlServicios;
import com.backend.apirest.service.ServiciosService;

@RestController
@RequestMapping("/servicios")
public class ServiciosCtrllr {

	@Autowired
	private ServiciosService serviciosService; 
	
	@GetMapping("/")
	public ResponseEntity<Object> get() 
	{
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("NO puede procesar tu petición!");
    }
	
	@GetMapping("/lista")
	public List<MdlServicios> getListaServicios() 
	{
		return serviciosService.listServicios();
	}
	
	@GetMapping("/lista/{cveTipoServ}")
	public List<MdlServicios> filterTipoServ(@PathVariable Integer cveTipoServ)
	{
		return serviciosService.findByTipoServ(cveTipoServ);
	}
	
}
