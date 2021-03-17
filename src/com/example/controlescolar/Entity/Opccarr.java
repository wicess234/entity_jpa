package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opccarr database table.
 * 
 */
@Entity
@NamedQuery(name="Opccarr.findAll", query="SELECT o FROM Opccarr o")
public class Opccarr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OpccarrPK id;

	//bi-directional many-to-one association to Spriden
	@ManyToOne
	@JoinColumn(name="SPRIDEN_MATRICULA",insertable = false,updatable = false)
	private Spriden spriden;

	//bi-directional many-to-one association to Stvcarr
	@ManyToOne
	@JoinColumn(name="STVCARR_ID",insertable = false,updatable = false)
	private Stvcarr stvcarr;

	//bi-directional many-to-one association to Stvprep
	@ManyToOne
	@JoinColumn(name="STVPREP_ID",insertable = true ,updatable = true)
	private Stvprep stvprep;

	//bi-directional many-to-one association to Stvterm
	@ManyToOne
	@JoinColumn(name="STVTERM_ID",insertable = true ,updatable = true)
	private Stvterm stvterm;

	//bi-directional many-to-one association to Stvturn
	@ManyToOne
	@JoinColumn(name="STVTURN_ID",insertable = true ,updatable = true)
	private Stvturn stvturn;

	public Opccarr() {
	}

	public OpccarrPK getId() {
		return this.id;
	}

	public void setId(OpccarrPK id) {
		this.id = id;
	}

	public Spriden getSpriden() {
		return this.spriden;
	}

	public void setSpriden(Spriden spriden) {
		this.spriden = spriden;
	}

	public Stvcarr getStvcarr() {
		return this.stvcarr;
	}

	public void setStvcarr(Stvcarr stvcarr) {
		this.stvcarr = stvcarr;
	}

	public Stvprep getStvprep() {
		return this.stvprep;
	}

	public void setStvprep(Stvprep stvprep) {
		this.stvprep = stvprep;
	}

	public Stvterm getStvterm() {
		return this.stvterm;
	}

	public void setStvterm(Stvterm stvterm) {
		this.stvterm = stvterm;
	}

	public Stvturn getStvturn() {
		return this.stvturn;
	}

	public void setStvturn(Stvturn stvturn) {
		this.stvturn = stvturn;
	}

}