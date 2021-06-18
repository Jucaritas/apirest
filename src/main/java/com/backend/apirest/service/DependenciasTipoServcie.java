package com.backend.apirest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.model.DependenciasTipo;
import com.backend.apirest.repository.TipoDependencia;

@Service
@Transactional
public class DependenciasTipoServcie {

	@Autowired
	private TipoDependencia tipoDependencia;
	
	public List<DependenciasTipo> listAllDespendencias() {
        return tipoDependencia.findAll();
    }

    public void saveDependencia(DependenciasTipo tipoDep) {
    	tipoDependencia.save(tipoDep);
    }

    public DependenciasTipo getDepndnsId(Integer id) {
        return tipoDependencia.findById(id).get();
    }

    public void deleteDepndns(Integer id) {
    	tipoDependencia.deleteById(id);
    }
}
