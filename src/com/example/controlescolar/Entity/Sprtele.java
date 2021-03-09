package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sprtele database table.
 * 
 */
@Entity
@NamedQuery(name="Sprtele.findAll", query="SELECT s FROM Sprtele s")
public class Sprtele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRTELE_NUMSEQ")
	private int sprteleNumseq;

	@Column(name="SPRTELE_FLAG")
	private int sprteleFlag;

	@Column(name="SPRTELE_NUMBER")
	private int sprteleNumber;

	@Column(name="STVTELE_CODE")
	private String stvteleCode;

	//bi-directional many-to-one association to Spriden
	@ManyToOne
	@JoinColumn(name="SPRTELE_MATRICULA")
	private Spriden spriden;

	//bi-directional one-to-one association to Stvtel
	@OneToOne(mappedBy="sprtele")
	private Stvtel stvtel;

	public Sprtele() {
	}

	public int getSprteleNumseq() {
		return this.sprteleNumseq;
	}

	public void setSprteleNumseq(int sprteleNumseq) {
		this.sprteleNumseq = sprteleNumseq;
	}

	public int getSprteleFlag() {
		return this.sprteleFlag;
	}

	public void setSprteleFlag(int sprteleFlag) {
		this.sprteleFlag = sprteleFlag;
	}

	public int getSprteleNumber() {
		return this.sprteleNumber;
	}

	public void setSprteleNumber(int sprteleNumber) {
		this.sprteleNumber = sprteleNumber;
	}

	public String getStvteleCode() {
		return this.stvteleCode;
	}

	public void setStvteleCode(String stvteleCode) {
		this.stvteleCode = stvteleCode;
	}

	public Spriden getSpriden() {
		return this.spriden;
	}

	public void setSpriden(Spriden spriden) {
		this.spriden = spriden;
	}

	public Stvtel getStvtel() {
		return this.stvtel;
	}

	public void setStvtel(Stvtel stvtel) {
		this.stvtel = stvtel;
	}

}