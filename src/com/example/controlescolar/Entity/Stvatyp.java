package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stvatyp database table.
 * 
 */
@Entity
@NamedQuery(name="Stvatyp.findAll", query="SELECT s FROM Stvatyp s")
public class Stvatyp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVATYP_TIPO")
	private String stvatypTipo;

	@Column(name="STVATYP_DESC")
	private String stvatypDesc;

	//bi-directional one-to-one association to Spraddr
	@OneToOne
	@JoinColumn(name="STVATYP_TIPO")
	private Spraddr spraddr;

	public Stvatyp() {
	}

	public String getStvatypTipo() {
		return this.stvatypTipo;
	}

	public void setStvatypTipo(String stvatypTipo) {
		this.stvatypTipo = stvatypTipo;
	}

	public String getStvatypDesc() {
		return this.stvatypDesc;
	}

	public void setStvatypDesc(String stvatypDesc) {
		this.stvatypDesc = stvatypDesc;
	}

	public Spraddr getSpraddr() {
		return this.spraddr;
	}

	public void setSpraddr(Spraddr spraddr) {
		this.spraddr = spraddr;
	}

}