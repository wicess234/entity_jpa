package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the stvprep database table.
 * 
 */
@Entity
@NamedQuery(name="Stvprep.findAll", query="SELECT s FROM Stvprep s")
public class Stvprep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVPREP_ID")
	private String stvprepId;

	@Column(name="PREPA_DESC")
	private String prepaDesc;

	public Stvprep() {
	}

	public String getStvprepId() {
		return this.stvprepId;
	}

	public void setStvprepId(String stvprepId) {
		this.stvprepId = stvprepId;
	}

	public String getPrepaDesc() {
		return this.prepaDesc;
	}

	public void setPrepaDesc(String prepaDesc) {
		this.prepaDesc = prepaDesc;
	}



}