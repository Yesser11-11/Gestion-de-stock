package com.example.demo1.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="article")
public class Article {

 @Id
 @Column(name = "id")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 
@Column(name="title")
@NotEmpty
 private String title;
 
 @Column(name="category")
 @NotEmpty
 private String category;
 
 @Column(name="quantite")
 private int Quantite;
 
 
 
public Article() {}

 public Article(long id, String title,  String category, int Quantite) {
	super();
	this.id = id;
	this.title = title;
	this.category = category;
	this.Quantite = Quantite;
}

public int getQuantite() {
	return Quantite;
}

public void setQuantite(int quantite) {
	Quantite = quantite;
}

public long getId() {
  return id;
 }

 public void setId(long id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getCategory() {
  return category;
 }


public void setCategory(String category) {
  this.category = category;
 }

@Override
public String toString() {
	return "Article [id=" + id + ", title=" + title + ", category=" + category + ", Quantite=" + Quantite + "]";
}



}