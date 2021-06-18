package com.backend.apirest.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.apirest.model.MdlServicios;
import com.backend.apirest.repository.ServiciosRepo;

@Service
@Transactional
public class ServiciosService {

	@Autowired
	private ServiciosRepo serviciosRepo;
	
	public List<MdlServicios> listServicios() {
        return serviciosRepo.findAll();
    }

    public void saveServicio(MdlServicios servicio) {
    	serviciosRepo.save(servicio);
    }

    public MdlServicios getServId(Integer id) {
        return serviciosRepo.findById(id).get();
    }

    public void deleteServicio(Integer id) {
    	serviciosRepo.deleteById(id);
    }
    
    public List<MdlServicios> findByTipoServ(Integer cveTipoServ)
    {
    	List<MdlServicios> servicios = serviciosRepo.findAll();
    	if(cveTipoServ == 3401 || cveTipoServ == 3402)
    	{    		
	    	List<MdlServicios> filtro = servicios.stream()
    			.filter(c -> c.getCve_tipo_serv().equals(cveTipoServ))
	    		.collect(Collectors.toList());
	    	return filtro;
    	}
    	else
    	{
    		return servicios;
    	}
    }
}
