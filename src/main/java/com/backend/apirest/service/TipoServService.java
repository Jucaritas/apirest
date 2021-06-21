package com.backend.apirest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.model.TipoServicios;
import com.backend.apirest.repository.TipoServRepo;

@Service
@Transactional
public class TipoServService {

	@Autowired
	private TipoServRepo tServRepo;
	
	public List<TipoServicios> listTipoServ() {
        return tServRepo.orderByCve();
    }
	
    public void saveTipoServ(TipoServicios tipoServ) {
    	tServRepo.save(tipoServ);
    }

    public TipoServicios getTipoServId(Integer id) {
        return tServRepo.findById(id).get();
    }

    public void deleteTipoServ(Integer id) {
    	tServRepo.deleteById(id);
    }
}
