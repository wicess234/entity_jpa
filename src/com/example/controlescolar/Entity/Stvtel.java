package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stvtel database table.
 * 
 */
@Entity
@NamedQuery(name="Stvtel.findAll", query="SELECT s FROM Stvtel s")
public class Stvtel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVTELE_CODE")
	private String stvteleCode;

	@Column(name="TELE_DESC")
	private String teleDesc;

	//bi-directional one-to-one association to Sprtele
	@OneToOne
	@JoinColumn(name="STVTELE_CODE")
	private Sprtele sprtele;

	public Stvtel() {
	}

	public String getStvteleCode() {
		return this.stvteleCode;
	}

	public void setStvteleCode(String stvteleCode) {
		this.stvteleCode = stvteleCode;
	}

	public String getTeleDesc() {
		return this.teleDesc;
	}

	public void setTeleDesc(String teleDesc) {
		this.teleDesc = teleDesc;
	}

	public Sprtele getSprtele() {
		return this.sprtele;
	}

	public void setSprtele(Sprtele sprtele) {
		this.sprtele = sprtele;
	}

}