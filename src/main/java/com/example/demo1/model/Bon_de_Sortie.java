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
@Table(name="bon_de_sortie")
public class Bon_de_Sortie {
	
	@Id
	@Column(name = "idBon_de_Sortie")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long idBon_de_Sortie;
	
	
	@Column(name="date")
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date date;
	
	@Column(name="MotifReforme")
	private String MotifReforme;
		
	
	@Column(name="Designation")
	private String Designation;
	
	
	
	@Column(name="observation")
	private String observation;


	
	
	public Bon_de_Sortie (){}

	public Bon_de_Sortie(long idBon_de_Sortie, Date date, String motifReforme, String designation, String observation) {
		super();
		this.idBon_de_Sortie = idBon_de_Sortie;
		this.date = date;
		MotifReforme = motifReforme;
		Designation = designation;
		this.observation = observation;
	}

	@Override
	public String toString() {
		return "Bon_de_Sortie [idBon_de_Sortie=" + idBon_de_Sortie + ", date=" + date + ", MotifReforme=" + MotifReforme
				+ ", Designation=" + Designation + ", observation=" + observation + "]";
	}

	public long getIdBon_de_Sortie() {
		return idBon_de_Sortie;
	}



	public void setIdBon_de_Sortie(long idBon_de_Sortie) {
		this.idBon_de_Sortie = idBon_de_Sortie;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getMotifReforme() {
		return MotifReforme;
	}



	public void setMotifReforme(String motifReforme) {
		MotifReforme = motifReforme;
	}



	public String getDesignation() {
		return Designation;
	}



	public void setDesignation(String designation) {
		Designation = designation;
	}



	public String getObservation() {
		return observation;
	}



	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	
	
	

}
