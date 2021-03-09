package com.example.controlescolar.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the stvturn database table.
 * 
 */
@Entity
@NamedQuery(name="Stvturn.findAll", query="SELECT s FROM Stvturn s")
public class Stvturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVTURN_ID")
	private String stvturnId;

	@Column(name="STVTURN_DESC")
	private String stvturnDesc;

	public Stvturn() {
	}

	public String getStvturnId() {
		return this.stvturnId;
	}

	public void setStvturnId(String stvturnId) {
		this.stvturnId = stvturnId;
	}

	public String getStvturnDesc() {
		return this.stvturnDesc;
	}

	public void setStvturnDesc(String stvturnDesc) {
		this.stvturnDesc = stvturnDesc;
	}



}