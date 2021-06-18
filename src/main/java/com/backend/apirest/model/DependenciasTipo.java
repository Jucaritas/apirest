package com.backend.apirest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_depend", schema = "public")
public class DependenciasTipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "cve_depnd")
	private String cve_depnd;
	
	@Column(name = "desc_depnd")
	private String desc_depnd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCve_depnd() {
		return cve_depnd;
	}

	public void setCve_depnd(String cve_depnd) {
		this.cve_depnd = cve_depnd;
	}

	public String getDesc_depnd() {
		return desc_depnd;
	}

	public void setDesc_depnd(String desc_depnd) {
		this.desc_depnd = desc_depnd;
	}
	
	
}
