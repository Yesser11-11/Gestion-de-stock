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
@Table(name="bon_de_retour")
public class BonDeRetour{
	
	
	
	 @Id
	 @Column(name ="idbondeRetour")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long idbondeRetour;
	 
	 
	 
	 @Column(name="department")
	 private String Department;

	 @Column(name="service")
	 private String Service;
	 
	 @Column(name="numbonretour")
	 private int Numbonretour;
	 
	 @Column(name="date")
	 @DateTimeFormat (pattern="yyyy-MM-dd")
	 private Date Date;
	 
	 @Column(name="locale")
	 private String Locale;
	 
	 @Column(name="codepersonnel")
	 private int Codepersonnel;
	 
	 @Column(name="motif")
	 private String Motif;
	 
	 @Column(name="observation")
	 private String Observation;
	 
	 
	public BonDeRetour() {}



	public long getIdbondeRetour() {
		return idbondeRetour;
	}



	public void setIdbondeRetour(long idbondeRetour) {
		this.idbondeRetour = idbondeRetour;
	}



	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public String getService() {
		return Service;
	}


	public void setService(String service) {
		Service = service;
	}


	public int getNumbonretour() {
		return Numbonretour;
	}


	public void setNumbonretour(int numbonretour) {
		Numbonretour = numbonretour;
	}


	public Date getDate() {
		return Date;
	}


	public void setDate(Date date) {
		Date = date;
	}


	public String getLocale() {
		return Locale;
	}


	public void setLocale(String locale) {
		Locale = locale;
	}


	public int getCodepersonnel() {
		return Codepersonnel;
	}


	public void setCodepersonnel(int codepersonnel) {
		Codepersonnel = codepersonnel;
	}


	public String getMotif() {
		return Motif;
	}


	public void setMotif(String motif) {
		Motif = motif;
	}


	public String getObservation() {
		return Observation;
	}


	public void setObservation(String observation) {
		Observation = observation;
	}


	public BonDeRetour(long idBondeRetour, String department, String service, int numbonretour, java.util.Date date,
			String locale, int codepersonnel, String motif, String observation) {
		super();
		this.idbondeRetour = idBondeRetour;
		Department = department;
		Service = service;
		Numbonretour = numbonretour;
		Date = date;
		Locale = locale;
		Codepersonnel = codepersonnel;
		Motif = motif;
		Observation = observation;
	}


	@Override
	public String toString() {
		return "BonDeRetour [idBondeRetour=" + idbondeRetour + ", Department=" + Department + ", Service=" + Service
				+ ", Numbonretour=" + Numbonretour + ", Date=" + Date + ", Locale=" + Locale + ", Codepersonnel="
				+ Codepersonnel + ", Motif=" + Motif + ", Observation=" + Observation + "]";
	}
	
	 
	 
	 
	 

}
