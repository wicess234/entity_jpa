package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the opccarr database table.
 * 
 */
@Embeddable
public class OpccarrPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SPRIDEN_MATRICULA")
	private int spridenMatricula;

	@Column(name="STVCARR_ID")
	private String stvcarrId;

	public OpccarrPK() {
	}
	public int getSpridenMatricula() {
		return this.spridenMatricula;
	}
	public void setSpridenMatricula(int spridenMatricula) {
		this.spridenMatricula = spridenMatricula;
	}
	public String getStvcarrId() {
		return this.stvcarrId;
	}
	public void setStvcarrId(String stvcarrId) {
		this.stvcarrId = stvcarrId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OpccarrPK)) {
			return false;
		}
		OpccarrPK castOther = (OpccarrPK)other;
		return 
			(this.spridenMatricula == castOther.spridenMatricula)
			&& this.stvcarrId.equals(castOther.stvcarrId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.spridenMatricula;
		hash = hash * prime + this.stvcarrId.hashCode();
		
		return hash;
	}
}