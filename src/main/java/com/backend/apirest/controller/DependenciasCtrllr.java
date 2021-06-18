package com.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirest.model.DependenciasTipo;
import com.backend.apirest.service.DependenciasTipoServcie;

@RestController
@RequestMapping("/tDepnds")
public class DependenciasCtrllr {

	@Autowired
	private DependenciasTipoServcie dtServcie;
	
	@GetMapping("/lista")
	public List<DependenciasTipo> tipoServList()
	{
		return dtServcie.listAllDespendencias();
	}
	
}
