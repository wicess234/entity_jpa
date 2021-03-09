package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the spraddr database table.
 * 
 */
@Entity
@NamedQuery(name="Spraddr.findAll", query="SELECT s FROM Spraddr s")
public class Spraddr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRADDR_NUMSEQ")
	private int spraddrNumseq;

	@Column(name="PRADDR_CALLE")
	private String praddrCalle;

	@Column(name="PRADDR_CP")
	private String praddrCp;

	@Column(name="PRADDR_MUN_O_DEL")
	private String praddrMunODel;

	@Column(name="PRADDR_NUM")
	private String praddrNum;

	@Column(name="PRADDR_PAIS")
	private String praddrPais;

	@Column(name="SPRADDR_CIUDAD")
	private String spraddrCiudad;

	@Column(name="SPRADDR_COLONIA")
	private String spraddrColonia;

	@Column(name="SPRADDR_ESTADO")
	private String spraddrEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="SPRIDEN_ACTIVITY_DATE")
	private Date spridenActivityDate;

	@Column(name="SRIDEN_USER")
	private String sridenUser;

	@Column(name="STVATYP_TIPO")
	private String stvatypTipo;

	//bi-directional many-to-one association to Spriden
	@ManyToOne
	@JoinColumn(name="SPRADDR_MATRICULA")
	private Spriden spriden;

	//bi-directional one-to-one association to Stvatyp
	@OneToOne(mappedBy="spraddr")
	private Stvatyp stvatyp;

	public Spraddr() {
	}

	public int getSpraddrNumseq() {
		return this.spraddrNumseq;
	}

	public void setSpraddrNumseq(int spraddrNumseq) {
		this.spraddrNumseq = spraddrNumseq;
	}

	public String getPraddrCalle() {
		return this.praddrCalle;
	}

	public void setPraddrCalle(String praddrCalle) {
		this.praddrCalle = praddrCalle;
	}

	public String getPraddrCp() {
		return this.praddrCp;
	}

	public void setPraddrCp(String praddrCp) {
		this.praddrCp = praddrCp;
	}

	public String getPraddrMunODel() {
		return this.praddrMunODel;
	}

	public void setPraddrMunODel(String praddrMunODel) {
		this.praddrMunODel = praddrMunODel;
	}

	public String getPraddrNum() {
		return this.praddrNum;
	}

	public void setPraddrNum(String praddrNum) {
		this.praddrNum = praddrNum;
	}

	public String getPraddrPais() {
		return this.praddrPais;
	}

	public void setPraddrPais(String praddrPais) {
		this.praddrPais = praddrPais;
	}

	public String getSpraddrCiudad() {
		return this.spraddrCiudad;
	}

	public void setSpraddrCiudad(String spraddrCiudad) {
		this.spraddrCiudad = spraddrCiudad;
	}

	public String getSpraddrColonia() {
		return this.spraddrColonia;
	}

	public void setSpraddrColonia(String spraddrColonia) {
		this.spraddrColonia = spraddrColonia;
	}

	public String getSpraddrEstado() {
		return this.spraddrEstado;
	}

	public void setSpraddrEstado(String spraddrEstado) {
		this.spraddrEstado = spraddrEstado;
	}

	public Date getSpridenActivityDate() {
		return this.spridenActivityDate;
	}

	public void setSpridenActivityDate(Date spridenActivityDate) {
		this.spridenActivityDate = spridenActivityDate;
	}

	public String getSridenUser() {
		return this.sridenUser;
	}

	public void setSridenUser(String sridenUser) {
		this.sridenUser = sridenUser;
	}

	public String getStvatypTipo() {
		return this.stvatypTipo;
	}

	public void setStvatypTipo(String stvatypTipo) {
		this.stvatypTipo = stvatypTipo;
	}

	public Spriden getSpriden() {
		return this.spriden;
	}

	public void setSpriden(Spriden spriden) {
		this.spriden = spriden;
	}

	public Stvatyp getStvatyp() {
		return this.stvatyp;
	}

	public void setStvatyp(Stvatyp stvatyp) {
		this.stvatyp = stvatyp;
	}

}