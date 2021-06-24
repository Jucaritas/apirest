package com.backend.apirest.controller;

import java.util.List;

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

import com.backend.apirest.model.DependenciasMdl;
import com.backend.apirest.model.Response;
import com.backend.apirest.service.DependenciasService;

@RestController
@RequestMapping("/dependencias")
public class DependenciasLstCtrllr {

	@Autowired
	private DependenciasService depService;
	
	@GetMapping("/lista")
	public List<DependenciasMdl> getLstDependencias()
	{
		return depService.listAllDespendencias();
	}
	
	@PostMapping("/nueva")
    public ResponseEntity<Object> add(@RequestBody DependenciasMdl dependencia) {
		depService.saveDependencia(dependencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(new Response("Se ha creado la dependencia con exito!"));
    }
	
	@PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody DependenciasMdl dependencia, @PathVariable Integer id) {
		DependenciasMdl dependenciaData = depService.getDepndnsId(id);
        try {
        	if(dependenciaData != null) 
        	{
        		DependenciasMdl _dependencia = depService.getDepndnsId(id);
        		_dependencia.setImgDep(dependencia.getImgDep());
        		_dependencia.setDescDep(dependencia.getDescDep());
        		_dependencia.setCveDep(dependencia.getCveDep());
        		depService.saveDependencia(_dependencia);
        		return ResponseEntity.status(HttpStatus.OK).body(new Response("Se actualizo el registro con exito"));
        	}
        	else
        	{
        		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Verifica tus datos!"));
        	}
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Se ha generar un error!"));
        }
    }
	
	@DeleteMapping("/elimina/{cveDependencia}")
    public ResponseEntity<Response> delete(@PathVariable Integer cveDependencia) {
		try{
			depService.deleteDepndns(cveDependencia);
	        return ResponseEntity.status(HttpStatus.OK).body(new Response("La dependencia fue eliminada"));
		}
		catch(Exception e) 
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Se generado un error al procesar tu petición!"));
		}
    }
	
}


