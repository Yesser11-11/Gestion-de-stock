package com.example.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.*;

@Entity
@Table(name="bondecommande")
public class Bondecmnde {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long idbondecommande;	
		
	
	@Column(name="date")
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date date;
	
	
	@Column(name="ndappeledoffre") 
	private  int Ndappeledoffre;
	
	
	@Column(name="articlebudgetaire")
	private String Articlebudgetaire;
	
	
	@Column(name="fournisseur")
	private String Fournisseur;
	
	
	@Column(name="article")	
	private String Article;
	
	@Column(name="quantite")
	private int Quantite;
	
	
	@Column(name="prixUHT")
	private int PrixUHT;
		
	
	@Column(name="remise")	 
	private int Remise;
	
	
	@Column(name="tva")	 
	private int TVA;
	
	
	@Column(name="montantHT")	 
	private int MontantHT;
	
		
	@Column(name="montantttc")
	private  int MontantTTC;
	
	public Bondecmnde(){}

	public long getIdbondecommande() {
		return idbondecommande;
	}

	public void setIdbondecommande(long idbondecommande) {
		this.idbondecommande = idbondecommande;
	}

	public int getNdappeledoffre() {
		return Ndappeledoffre;
	}

	public void setNdappeledoffre(int ndappeledoffre) {
		Ndappeledoffre = ndappeledoffre;
	}

	public String getArticlebudgetaire() {
		return Articlebudgetaire;
	}

	public void setArticlebudgetaire(String articlebudgetaire) {
		Articlebudgetaire = articlebudgetaire;
	}

	public String getFournisseur() {
		return Fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
	}

	public String getArticle() {
		return Article;
	}

	public void setArticle(String article) {
		Article = article;
	}
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQuantite() {
		return Quantite;
	}

	public void setQuantite(int quantite) {
		Quantite = quantite;
	}

	public int getPrixUHT() {
		return PrixUHT;
	}

	public void setPrixUHT(int prixUHT) {
		PrixUHT = prixUHT;
	}

	public int getRemise() {
		return Remise;
	}

	public void setRemise(int remise) {
		Remise = remise;
	}

	public int getTVA() {
		return TVA;
	}

	public void setTVA(int tVA) {
		TVA = tVA;
	}

	public int getMontantHT() {
		return MontantHT;
	}

	public void setMontantHT(int montantHT) {
		MontantHT = montantHT;
	}

	public int getMontantTTC() {
		return MontantTTC;
	}

	public void setMontantTTC(int montantTTC) {
		MontantTTC = montantTTC;
	}

	@Override
	public String toString() {
		return "Bondecmnde [idbondecommande=" + idbondecommande + ", date=" + date + ", Ndappeledoffre="
				+ Ndappeledoffre + ", Articlebudgetaire=" + Articlebudgetaire + ", Fournisseur=" + Fournisseur
				+ ", Article=" + Article + ", Quantite=" + Quantite + ", PrixUHT=" + PrixUHT + ", Remise=" + Remise
				+ ", TVA=" + TVA + ", MontantHT=" + MontantHT + ", MontantTTC=" + MontantTTC + "]";
	}

	public Bondecmnde(long idbondecommande, Date date, int ndappeledoffre, String articlebudgetaire, String fournisseur,
			String article, int quantite, int prixUHT, int remise, int tVA, int montantHT, int montantTTC) {
		super();
		this.idbondecommande = idbondecommande;
		this.date = date;
		Ndappeledoffre = ndappeledoffre;
		Articlebudgetaire = articlebudgetaire;
		Fournisseur = fournisseur;
		Article = article;
		Quantite = quantite;
		PrixUHT = prixUHT;
		Remise = remise;
		TVA = tVA;
		MontantHT = montantHT;
		MontantTTC = montantTTC;
	}

	
}
