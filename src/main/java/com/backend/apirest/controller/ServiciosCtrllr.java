package com.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
