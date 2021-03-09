package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;

import com.sun.istack.Nullable;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


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


	//bi-directional many-to-one association to Spbper
	@OneToMany
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA"),
	inverseJoinColumns = @JoinColumn(name = "SPBPERS_NUMSEQ") )
	@Nullable
	private Set<Spbper> spbperss= new HashSet<>();

	//bi-directional many-to-one association to Spraddr
	@OneToMany
	@Nullable
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA"),
	inverseJoinColumns = @JoinColumn(name = "SPRADDR_NUMSEQ"))
	private Set<Spraddr> spraddrs= new HashSet<>();

	//bi-directional many-to-one association to Sprtele
	@OneToMany
	@Nullable
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA"),
	inverseJoinColumns = @JoinColumn(name = "SPRTELE_NUMSEQ"))
	private Set<Sprtele> sprteles= new HashSet<>();

	
	@OneToMany
	@Nullable
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA"),
	inverseJoinColumns = @JoinColumn(name="STVCARR_ID", insertable = false, updatable = false))
	private Set<Stvcarr> stvcarr= new HashSet<>();

	//bi-directional many-to-one association to Stvprep
	@OneToMany
	@Nullable
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA")
	,inverseJoinColumns = @JoinColumn(name="STVPREP_ID"))
	private Set<Stvprep> stvprep= new HashSet<>();

	//bi-directional many-to-one association to Stvterm
	@OneToMany
	@Nullable
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA"),
	inverseJoinColumns = @JoinColumn(name="STVTERM_ID"))
	private Set<Stvterm> stvterm= new HashSet<>();

	//bi-directional many-to-one association to Stvturn
	@OneToMany
	@Nullable
	@JoinTable(name = "alumnos_datos",joinColumns = @JoinColumn(name = "SPRIDEN_MATRICULA"),
	inverseJoinColumns =@JoinColumn(name="STVTURN_ID"))
	private Set<Stvturn> stvturn= new HashSet<>();
	
	public Set<Stvcarr> getStvcarr() {
		return stvcarr;
	}

	public void setStvcarr(Set<Stvcarr> stvcarr) {
		this.stvcarr = stvcarr;
	}

	public Set<Stvprep> getStvprep() {
		return stvprep;
	}

	public void setStvprep(Set<Stvprep> stvprep) {
		this.stvprep = stvprep;
	}

	public Set<Stvterm> getStvterm() {
		return stvterm;
	}

	public void setStvterm(Set<Stvterm> stvterm) {
		this.stvterm = stvterm;
	}

	public Set<Stvturn> getStvturn() {
		return stvturn;
	}

	public void setStvturn(Set<Stvturn> stvturn) {
		this.stvturn = stvturn;
	}

	public Spriden() {
	}

	public int getSpridenMatricula() {
		return spridenMatricula;
	}

	public void setSpridenMatricula(int spridenMatricula) {
		this.spridenMatricula = spridenMatricula;
	}

	public Date getSpridenActivityDate() {
		return spridenActivityDate;
	}

	public void setSpridenActivityDate(Date spridenActivityDate) {
		this.spridenActivityDate = spridenActivityDate;
	}

	public String getSpridenAp() {
		return spridenAp;
	}

	public void setSpridenAp(String spridenAp) {
		this.spridenAp = spridenAp;
	}

	public String getSpridenApm() {
		return spridenApm;
	}

	public void setSpridenApm(String spridenApm) {
		this.spridenApm = spridenApm;
	}

	public String getSpridenCurp() {
		return spridenCurp;
	}

	public void setSpridenCurp(String spridenCurp) {
		this.spridenCurp = spridenCurp;
	}

	public String getSpridenFlag() {
		return spridenFlag;
	}

	public void setSpridenFlag(String spridenFlag) {
		this.spridenFlag = spridenFlag;
	}

	public String getSpridenNombre() {
		return spridenNombre;
	}

	public void setSpridenNombre(String spridenNombre) {
		this.spridenNombre = spridenNombre;
	}

	public int getSridenUser() {
		return sridenUser;
	}

	public void setSridenUser(int sridenUser) {
		this.sridenUser = sridenUser;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	

	public Set<Spraddr> getSpraddrs() {
		return spraddrs;
	}

	public void setSpraddrs(Set<Spraddr> spraddrs) {
		this.spraddrs = spraddrs;
	}

	public Set<Sprtele> getSprteles() {
		return sprteles;
	}

	public void setSprteles(Set<Sprtele> sprteles) {
		this.sprteles = sprteles;
	}

	public Set<Spbper> getSpbperss() {
		return spbperss;
	}

	public void setSpbperss(Set<Spbper> spbperss) {
		this.spbperss = spbperss;
	}

	

}