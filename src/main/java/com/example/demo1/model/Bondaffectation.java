package com.example.demo1.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="bondaffectation")
public class Bondaffectation {

	@Id
	@Column(name ="idbondaffectation")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idbondaffectation;
	
	@Column(name="departement")
	private String departement;

	
	
	
	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}


	@Column(name="service")	
	private String service;
	
	
	 
	@Column(name="numbondaffectation")
	private int numbondaffectation;
	
	 
	@Column(name="date")
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date date;
	
	 
	@Column(name="locale")	
	private String locale;
	
	 
	@Column(name="codepersonnel")	
	private String codepersonnel;
	
	 
	@Column(name="codearticle")	
	private String codearticle;
	
	 
	@Column(name="observation")
	private String observation;
	
	 
	@Column(name="numinventaire")	
	private int numinventaire;

   public Bondaffectation() {} 
	
	
	public long getIdbondaffectation() {
		return idbondaffectation;
	}


	public void setIdbondaffectation(long idbondaffectation) {
		this.idbondaffectation = idbondaffectation;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	public int getNumbondaffectation() {
		return numbondaffectation;
	}


	public void setNumbondaffectation(int numbondaffectation) {
		this.numbondaffectation = numbondaffectation;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getLocale() {
		return locale;
	}


	public void setLocale(String locale) {
		this.locale = locale;
	}


	public String getCodepersonnel() {
		return codepersonnel;
	}


	public void setCodepersonnel(String codepersonnel) {
		this.codepersonnel = codepersonnel;
	}


	public String getCodearticle() {
		return codearticle;
	}


	public void setCodearticle(String codearticle) {
		this.codearticle = codearticle;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	public int getNuminventaire() {
		return numinventaire;
	}


	public void setNuminventaire(int numinventaire) {
		this.numinventaire = numinventaire;
	}


	public Bondaffectation(long idbondaffectation, String service, int numbondaffectation, Date date, String locale,
			String codepersonnel, String codearticle, String observation, int numinventaire) {
		super();
		this.idbondaffectation = idbondaffectation;
		this.service = service;
		this.numbondaffectation = numbondaffectation;
		this.date = date;
		this.locale = locale;
		this.codepersonnel = codepersonnel;
		this.codearticle = codearticle;
		this.observation = observation;
		this.numinventaire = numinventaire;
	}


	@Override
	public String toString() {
		return "Bondaffectation [idbondaffectation=" + idbondaffectation + ", service=" + service
				+ ", numbondaffectation=" + numbondaffectation + ", date=" + date + ", locale=" + locale
				+ ", codepersonnel=" + codepersonnel + ", codearticle=" + codearticle + ", observation=" + observation
				+ ", numinventaire=" + numinventaire + "]";
	}

	
	
	
}
