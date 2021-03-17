package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the spriden database table.
 * 
 */
@Entity
@NamedQuery(name="Spriden.findAll", query="SELECT s FROM Spriden s")
public class Spriden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRIDEN_MATRICULA")
	private int spridenMatricula;

	@Temporal(TemporalType.DATE)
	@Column(name="SPRIDEN_ACTIVITY_DATE")
	private Date spridenActivityDate;

	@Column(name="SPRIDEN_AP")
	private String spridenAp;

	@Column(name="SPRIDEN_APM")
	private String spridenApm;

	@Column(name="SPRIDEN_CURP")
	private String spridenCurp;

	@Column(name="SPRIDEN_FLAG")
	private String spridenFlag;

	@Column(name="SPRIDEN_NOMBRE")
	private String spridenNombre;

	@Column(name="SRIDEN_USER")
	private int sridenUser;

	@Column(name="USUARIO_ID")
	private int usuarioId;

	//bi-directional many-to-one association to Opccarr
	@OneToMany(mappedBy="spriden",cascade = CascadeType.ALL)
	private List<Opccarr> opccarrs;

	//bi-directional many-to-one association to Sesion
	@OneToMany(mappedBy="spriden",cascade = CascadeType.ALL)
	private List<Sesion> sesions;

	//bi-directional many-to-one association to Spbper
	@OneToMany(mappedBy="spriden",cascade = CascadeType.ALL)
	private List<Spbper> spbpers;

	//bi-directional many-to-one association to Spraddr
	@OneToMany(mappedBy="spriden",cascade = CascadeType.ALL)
	private List<Spraddr> spraddrs;

	//bi-directional many-to-one association to Sprmail
	@OneToMany(mappedBy="spriden")
	private List<Sprmail> sprmails;

	//bi-directional many-to-one association to Sprtele
	@OneToMany(mappedBy="spriden")
	private List<Sprtele> sprteles;

	public Spriden() {
	}

	public int getSpridenMatricula() {
		return this.spridenMatricula;
	}

	public void setSpridenMatricula(int spridenMatricula) {
		this.spridenMatricula = spridenMatricula;
	}

	public Date getSpridenActivityDate() {
		return this.spridenActivityDate;
	}

	public void setSpridenActivityDate(Date spridenActivityDate) {
		this.spridenActivityDate = spridenActivityDate;
	}

	public String getSpridenAp() {
		return this.spridenAp;
	}

	public void setSpridenAp(String spridenAp) {
		this.spridenAp = spridenAp;
	}

	public String getSpridenApm() {
		return this.spridenApm;
	}

	public void setSpridenApm(String spridenApm) {
		this.spridenApm = spridenApm;
	}

	public String getSpridenCurp() {
		return this.spridenCurp;
	}

	public void setSpridenCurp(String spridenCurp) {
		this.spridenCurp = spridenCurp;
	}

	public String getSpridenFlag() {
		return this.spridenFlag;
	}

	public void setSpridenFlag(String spridenFlag) {
		this.spridenFlag = spridenFlag;
	}

	public String getSpridenNombre() {
		return this.spridenNombre;
	}

	public void setSpridenNombre(String spridenNombre) {
		this.spridenNombre = spridenNombre;
	}

	public int getSridenUser() {
		return this.sridenUser;
	}

	public void setSridenUser(int sridenUser) {
		this.sridenUser = sridenUser;
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public List<Opccarr> getOpccarrs() {
		return this.opccarrs;
	}

	public void setOpccarrs(List<Opccarr> opccarrs) {
		this.opccarrs = opccarrs;
	}

	public Opccarr addOpccarr(Opccarr opccarr) {
		getOpccarrs().add(opccarr);
		opccarr.setSpriden(this);

		return opccarr;
	}

	public Opccarr removeOpccarr(Opccarr opccarr) {
		getOpccarrs().remove(opccarr);
		opccarr.setSpriden(null);

		return opccarr;
	}

	public List<Sesion> getSesions() {
		return this.sesions;
	}

	public void setSesions(List<Sesion> sesions) {
		this.sesions = sesions;
	}

	public Sesion addSesion(Sesion sesion) {
		getSesions().add(sesion);
		sesion.setSpriden(this);

		return sesion;
	}

	public Sesion removeSesion(Sesion sesion) {
		getSesions().remove(sesion);
		sesion.setSpriden(null);

		return sesion;
	}

	public List<Spbper> getSpbpers() {
		return this.spbpers;
	}

	public void setSpbpers(List<Spbper> spbpers) {
		this.spbpers = spbpers;
	}

	public Spbper addSpbper(Spbper spbper) {
		getSpbpers().add(spbper);
		spbper.setSpriden(this);

		return spbper;
	}

	public Spbper removeSpbper(Spbper spbper) {
		getSpbpers().remove(spbper);
		spbper.setSpriden(null);

		return spbper;
	}

	public List<Spraddr> getSpraddrs() {
		return this.spraddrs;
	}

	public void setSpraddrs(List<Spraddr> spraddrs) {
		this.spraddrs = spraddrs;
	}

	public Spraddr addSpraddr(Spraddr spraddr) {
		getSpraddrs().add(spraddr);
		spraddr.setSpriden(this);

		return spraddr;
	}

	public Spraddr removeSpraddr(Spraddr spraddr) {
		getSpraddrs().remove(spraddr);
		spraddr.setSpriden(null);

		return spraddr;
	}

	public List<Sprmail> getSprmails() {
		return this.sprmails;
	}

	public void setSprmails(List<Sprmail> sprmails) {
		this.sprmails = sprmails;
	}

	public Sprmail addSprmail(Sprmail sprmail) {
		getSprmails().add(sprmail);
		sprmail.setSpriden(this);

		return sprmail;
	}

	public Sprmail removeSprmail(Sprmail sprmail) {
		getSprmails().remove(sprmail);
		sprmail.setSpriden(null);

		return sprmail;
	}

	public List<Sprtele> getSprteles() {
		return this.sprteles;
	}

	public void setSprteles(List<Sprtele> sprteles) {
		this.sprteles = sprteles;
	}

	public Sprtele addSprtele(Sprtele sprtele) {
		getSprteles().add(sprtele);
		sprtele.setSpriden(this);

		return sprtele;
	}

	public Sprtele removeSprtele(Sprtele sprtele) {
		getSprteles().remove(sprtele);
		sprtele.setSpriden(null);

		return sprtele;
	}

}