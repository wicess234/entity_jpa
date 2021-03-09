package com.example.controlescolar.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stvmail database table.
 * 
 */
@Entity
@NamedQuery(name="Stvmail.findAll", query="SELECT s FROM Stvmail s")
public class Stvmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STVMAIL_TIPO")
	private String stvmailTipo;

	@Column(name="STVMAIL_DESC")
	private String stvmailDesc;

	public Stvmail() {
	}

	public String getStvmailTipo() {
		return this.stvmailTipo;
	}

	public void setStvmailTipo(String stvmailTipo) {
		this.stvmailTipo = stvmailTipo;
	}

	public String getStvmailDesc() {
		return this.stvmailDesc;
	}

	public void setStvmailDesc(String stvmailDesc) {
		this.stvmailDesc = stvmailDesc;
	}

}