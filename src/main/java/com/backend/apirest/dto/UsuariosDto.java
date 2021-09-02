package com.backend.apirest.dto;

import java.io.Serializable;

public class UsuariosDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 833398176046819991L;
	
	private String  nombres;
	private String  apellidos;
	private Long    telefono;
	private String  direccion;
	private String  email;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
