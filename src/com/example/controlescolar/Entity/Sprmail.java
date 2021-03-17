package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sprmail database table.
 * 
 */
@Entity
@NamedQuery(name="Sprmail.findAll", query="SELECT s FROM Sprmail s")
public class Sprmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPRMAIL_NUMSEQ")
	private int sprmailNumseq;

	@Temporal(TemporalType.DATE)
	@Column(name="SPRMAIL_ACTIVITY_DATE")
	private Date sprmailActivityDate;

	@Column(name="SPRMAIL_MAIL")
	private int sprmailMail;

	@Column(name="STVMAIL_TIPO")
	private String stvmailTipo;

	//bi-directional many-to-one association to Spriden
	@ManyToOne
	@JoinColumn(name="SPRMAIL_MATRICULA")
	private Spriden spriden;

	//bi-directional one-to-one association to Stvmail
	@OneToOne(mappedBy="sprmail")
	private Stvmail stvmail;

	public Sprmail() {
	}

	public int getSprmailNumseq() {
		return this.sprmailNumseq;
	}

	public void setSprmailNumseq(int sprmailNumseq) {
		this.sprmailNumseq = sprmailNumseq;
	}

	public Date getSprmailActivityDate() {
		return this.sprmailActivityDate;
	}

	public void setSprmailActivityDate(Date sprmailActivityDate) {
		this.sprmailActivityDate = sprmailActivityDate;
	}

	public int getSprmailMail() {
		return this.sprmailMail;
	}

	public void setSprmailMail(int sprmailMail) {
		this.sprmailMail = sprmailMail;
	}

	public String getStvmailTipo() {
		return this.stvmailTipo;
	}

	public void setStvmailTipo(String stvmailTipo) {
		this.stvmailTipo = stvmailTipo;
	}

	public Spriden getSpriden() {
		return this.spriden;
	}

	public void setSpriden(Spriden spriden) {
		this.spriden = spriden;
	}

	public Stvmail getStvmail() {
		return this.stvmail;
	}

	public void setStvmail(Stvmail stvmail) {
		this.stvmail = stvmail;
	}

}