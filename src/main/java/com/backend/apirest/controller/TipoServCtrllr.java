package com.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirest.model.TipoServicios;
import com.backend.apirest.service.TipoServService;
@RestController
@RequestMapping("/tServ")
public class TipoServCtrllr {

	@Autowired
	private TipoServService tServService;
	
	@GetMapping("/lista")
	public List<TipoServicios> tipoServList()
	{
		return tServService.listTipoServ();
	}
}
