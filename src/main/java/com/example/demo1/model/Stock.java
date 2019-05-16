package com.example.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="stock")
public class Stock {

 @Id
 @Column(name = "idstock")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long idstock;
 
 
@Column(name="ArticleNom")
@NotEmpty
 private String ArticleNom;
 
 @Column(name="disponibilite")
 @NotEmpty
 private String disponibilite;
 
 @Column(name="Quantite")
 private int Quantite;
 
public Stock() {}

public long getIdstock() {
	return idstock;
}

public void setIdstock(long idstock) {
	this.idstock = idstock;
}

public String getArticleNom() {
	return ArticleNom;
}

public void setArticleNom(String articleNom) {
	ArticleNom = articleNom;
}

public String getDisponibilite() {
	return disponibilite;
}

public void setDisponibilite(String disponibilite) {
	this.disponibilite = disponibilite;
}

public int getQuantite() {
	return Quantite;
}

public void setQuantite(int quantite) {
	Quantite = quantite;
}

@Override
public String toString() {
	return "Stock [idstock=" + idstock + ", ArticleNom=" + ArticleNom + ", disponibilite=" + disponibilite
			+ ", Quantite=" + Quantite + "]";
}

public Stock(long idstock, @NotEmpty String articleNom, @NotEmpty String disponibilite, int quantite) {
	super();
	this.idstock = idstock;
	ArticleNom = articleNom;
	this.disponibilite = disponibilite;
	Quantite = quantite;
}



 }