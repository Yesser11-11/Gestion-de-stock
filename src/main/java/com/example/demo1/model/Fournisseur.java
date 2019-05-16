package com.example.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="fournisseur")
public class Fournisseur {

 @Id
 @Column(name = "id")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 
@Column(name="nom")
@NotEmpty
 private String Nom;
 
 @Column(name="adresse")
 @NotEmpty
 private String adresse;
 
 @Column(name="ville")
 @NotEmpty
 private String ville;
 
 
@Column(name="tel")
private int Tel;
 
 public Fournisseur() {}
 

public Fournisseur(long id, @NotEmpty String nom, @NotEmpty String adresse, @NotEmpty String ville, int tel) {
	super();
	this.id = id;
	Nom = nom;
	this.adresse = adresse;
	this.ville = ville;
	Tel = tel;
}


@Override
public String toString() {
	return "Fournisseur [id=" + id + ", Nom=" + Nom + ", adresse=" + adresse + ", ville=" + ville + ", Tel=" + Tel
			+ "]";
}



public int getTel() {
	return Tel;
}


public void setTel(int tel) {
	Tel = tel;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

 

}
