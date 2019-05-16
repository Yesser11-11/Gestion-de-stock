package com.example.demo1.model;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="historique")
public class Historique {
		
@Id
@Column(name="id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name="user")
private String User;



@Column(name="quantite")
private int quantite;



@Column(name="article")
@NotEmpty
private String article;


public Historique() {}

public Historique(int id, int quantite, String article) {
	super();
	this.id = id;
	this.quantite = quantite;
	this.article = article;
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getArticle() {
	return article;
}
public void setArticle(String article) {
	this.article = article;
}

@Override
public String toString() {
	return "Historique [id=" + id + ", user=" + User + ", quantite=" + quantite + ", article=" + article + "]";
}

public String getUser() {
	return User;
}

public void setUser(String user) {
	this.User = user;
}




}
