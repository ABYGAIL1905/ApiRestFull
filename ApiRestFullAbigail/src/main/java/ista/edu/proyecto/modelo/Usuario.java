package ista.edu.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "usuario")
public class Usuario {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	 @Column(name="id_usuario")
	private Long id_usuario;
	 
	 @Column(name="nombre")
	private String nombre;
	 
	 @Column(name="clave")
	private String clave;
	 
	 @Column(name="email")
	private String email;
	 
	 @Column(name="estado")
	private String estado;
	
	
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	

}
