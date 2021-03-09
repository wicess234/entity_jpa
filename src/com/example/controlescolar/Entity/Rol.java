package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rol database table.
 * 
 */
@Entity
@NamedQuery(name="Rol.findAll", query="SELECT r FROM Rol r")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROL_ID")
	private int rolId;

	@Column(name="ROL_DES")
	private String rolDes;

	//bi-directional one-to-one association to Sesion
	@OneToOne
	@JoinColumn(name="ROL_ID")
	private Sesion sesion;

	public Rol() {
	}

	public int getRolId() {
		return this.rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getRolDes() {
		return this.rolDes;
	}

	public void setRolDes(String rolDes) {
		this.rolDes = rolDes;
	}

	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

}