package com.backend.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dependencias", schema="public")
public class DependenciasMdl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="img_dep")
	private String imgDep;
	
	@Column(name="desc_dep")
	private String descDep;
	
	@Column(name="cve_dep")
	private String cveDep;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImgDep() {
		return imgDep;
	}

	public void setImgDep(String imgDep) {
		this.imgDep = imgDep;
	}

	public String getDescDep() {
		return descDep;
	}

	public void setDescDep(String descDep) {
		this.descDep = descDep;
	}

	public String getCveDep() {
		return cveDep;
	}

	public void setCveDep(String cveDep) {
		this.cveDep = cveDep;
	}
	
}
