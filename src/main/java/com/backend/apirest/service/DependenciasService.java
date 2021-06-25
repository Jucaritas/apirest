package com.backend.apirest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.model.DependenciasMdl;
import com.backend.apirest.repository.DependenciasRepo;

@Service
@Transactional
public class DependenciasService {
	@Autowired
	private DependenciasRepo depRepo; 
	
	public List<DependenciasMdl> listAllDespendencias() {
        return depRepo.getListOrdById();
    }

    public void saveDependencia(DependenciasMdl dependencia) {
    	
    	depRepo.save(dependencia);
    }

    public DependenciasMdl getDepndnsId(Integer id) {
        return depRepo.findById(id).get();
    }

    public void deleteDepndns(Integer cveDependencia) {
    	depRepo.deleteById(cveDependencia);
    }
}
