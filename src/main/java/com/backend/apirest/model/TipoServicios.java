package com.backend.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_servicios", schema = "public")
public class TipoServicios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "cve_tipo_serv")
	private String cve_tipo_serv;
	
	@Column(name = "desc_tipo_serv")
	private String desc_tipo_serv;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCve_tipo_serv() {
		return cve_tipo_serv;
	}

	public void setCve_tipo_serv(String cve_tipo_serv) {
		this.cve_tipo_serv = cve_tipo_serv;
	}

	public String getDesc_tipo_serv() {
		return desc_tipo_serv;
	}

	public void setDesc_tipo_serv(String desc_tipo_serv) {
		this.desc_tipo_serv = desc_tipo_serv;
	}
	
}
