package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spbpers database table.
 * 
 */
@Entity
@Table(name="spbpers")
@NamedQuery(name="Spbper.findAll", query="SELECT s FROM Spbper s")
public class Spbper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPBPERS_NUMSEQ")
	private int spbpersNumseq;

	@Column(name="SPBPERS_FALLECIDO")
	private String spbpersFallecido;

	@Temporal(TemporalType.DATE)
	@Column(name="SPBPERS_FECH_NAC")
	private Date spbpersFechNac;

	@Column(name="SPBPERS_SEX")
	private String spbpersSex;

	@Column(name="SPBPERS_USER")
	private String spbpersUser;

	@Column(name="SPBPESR_CIVIL")
	private String spbpesrCivil;

	@Temporal(TemporalType.DATE)
	@Column(name="SPRIDEN_ACTIVITY_DATE")
	private Date spridenActivityDate;

	//bi-directional many-to-one association to Spriden
	@ManyToOne
	@JoinColumn(name="SPBPERS_MATRICULA")
	private Spriden spriden;

	public Spbper() {
	}

	public int getSpbpersNumseq() {
		return this.spbpersNumseq;
	}

	public void setSpbpersNumseq(int spbpersNumseq) {
		this.spbpersNumseq = spbpersNumseq;
	}

	public String getSpbpersFallecido() {
		return this.spbpersFallecido;
	}

	public void setSpbpersFallecido(String spbpersFallecido) {
		this.spbpersFallecido = spbpersFallecido;
	}

	public Date getSpbpersFechNac() {
		return this.spbpersFechNac;
	}

	public void setSpbpersFechNac(Date spbpersFechNac) {
		this.spbpersFechNac = spbpersFechNac;
	}

	public String getSpbpersSex() {
		return this.spbpersSex;
	}

	public void setSpbpersSex(String spbpersSex) {
		this.spbpersSex = spbpersSex;
	}

	public String getSpbpersUser() {
		return this.spbpersUser;
	}

	public void setSpbpersUser(String spbpersUser) {
		this.spbpersUser = spbpersUser;
	}

	public String getSpbpesrCivil() {
		return this.spbpesrCivil;
	}

	public void setSpbpesrCivil(String spbpesrCivil) {
		this.spbpesrCivil = spbpesrCivil;
	}

	public Date getSpridenActivityDate() {
		return this.spridenActivityDate;
	}

	public void setSpridenActivityDate(Date spridenActivityDate) {
		this.spridenActivityDate = spridenActivityDate;
	}

	public Spriden getSpriden() {
		return this.spriden;
	}

	public void setSpriden(Spriden spriden) {
		this.spriden = spriden;
	}

}