package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the stvterm database table.
 * 
 */
@Entity
@NamedQuery(name="Stvterm.findAll", query="SELECT s FROM Stvterm s")
public class Stvterm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVTERM_ID")
	private String stvtermId;

	@Column(name="STVTERM_DESC")
	private String stvtermDesc;


	public Stvterm() {
	}

	public String getStvtermId() {
		return this.stvtermId;
	}

	public void setStvtermId(String stvtermId) {
		this.stvtermId = stvtermId;
	}

	public String getStvtermDesc() {
		return this.stvtermDesc;
	}

	public void setStvtermDesc(String stvtermDesc) {
		this.stvtermDesc = stvtermDesc;
	}



}