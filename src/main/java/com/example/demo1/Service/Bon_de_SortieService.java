package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.Bon_de_Sortie;

public interface Bon_de_SortieService {
	
	public List<Bon_de_Sortie> FindAllBon_de_Sorties();
	 
	 public Bon_de_Sortie getBon_de_SortieById(long idBon_de_Sortie);
	 
	 public void saveOrUpdate(Bon_de_Sortie bon_de_Sortie);
	 
	 public void deleteBon_de_Sortie(long idBon_de_Sortie);

}
