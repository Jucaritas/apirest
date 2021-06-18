package com.backend.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios", schema = "public")
public class MdlServicios {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "cve_servicio")
	private String cve_servicio;
	
	@Column(name = "cve_dependencia")
	private String cve_dependencia;
	
	@Column(name = "cve_tipo_serv")
	private Integer cve_tipo_serv;
	
	@Column(name = "desc_dep")
	private String desc_dep;
	
	@Column(name = "img")
	private String img;

	@Column(name = "app_root")
	private String app_root;
	
	public String getApp_root() {
		return app_root;
	}

	public void setApp_root(String app_root) {
		this.app_root = app_root;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCve_servicio() {
		return cve_servicio;
	}

	public void setCve_servicio(String cve_servicio) {
		this.cve_servicio = cve_servicio;
	}

	public String getCve_dependencia() {
		return cve_dependencia;
	}

	public void setCve_dependencia(String cve_dependencia) {
		this.cve_dependencia = cve_dependencia;
	}

	public Integer getCve_tipo_serv() {
		return cve_tipo_serv;
	}

	public void setCve_tipo_serv(Integer cve_tipo_serv) {
		this.cve_tipo_serv = cve_tipo_serv;
	}

	public String getDesc_dep() {
		return desc_dep;
	}

	public void setDesc_dep(String desc_dep) {
		this.desc_dep = desc_dep;
	}
	
	
}
