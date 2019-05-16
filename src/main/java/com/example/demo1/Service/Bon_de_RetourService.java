package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.BonDeRetour;
//import com.example.demo1.model.Bon_de_Sortie;

public interface Bon_de_RetourService {
	
	public List<BonDeRetour> getAllBonDeRetours();
	 
	 public BonDeRetour getBonDeRetourById(long idBondeRetour);
	 
	 public void saveOrUpdate(BonDeRetour BonDeRetour);
	 
	 public void deleteBonDeRetour(long idBondeRetour);


}
