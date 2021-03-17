package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to Opccarr
	@OneToMany(mappedBy="stvturn")
	private List<Opccarr> opccarrs;

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

	public List<Opccarr> getOpccarrs() {
		return this.opccarrs;
	}

	public void setOpccarrs(List<Opccarr> opccarrs) {
		this.opccarrs = opccarrs;
	}

	public Opccarr addOpccarr(Opccarr opccarr) {
		getOpccarrs().add(opccarr);
		opccarr.setStvturn(this);

		return opccarr;
	}

	public Opccarr removeOpccarr(Opccarr opccarr) {
		getOpccarrs().remove(opccarr);
		opccarr.setStvturn(null);

		return opccarr;
	}

}