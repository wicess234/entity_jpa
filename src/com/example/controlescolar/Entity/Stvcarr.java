package com.example.controlescolar.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the stvcarr database table.
 * 
 */
@Entity
@NamedQuery(name="Stvcarr.findAll", query="SELECT s FROM Stvcarr s")
public class Stvcarr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVCARR_ID")
	private String stvcarrId;

	@Column(name="STVCARR_DES")
	private String stvcarrDes;

	//bi-directional many-to-one association to Opccarr

	public Stvcarr() {
	}

	public String getStvcarrId() {
		return this.stvcarrId;
	}

	public void setStvcarrId(String stvcarrId) {
		this.stvcarrId = stvcarrId;
	}

	public String getStvcarrDes() {
		return this.stvcarrDes;
	}

	public void setStvcarrDes(String stvcarrDes) {
		this.stvcarrDes = stvcarrDes;
	}


}