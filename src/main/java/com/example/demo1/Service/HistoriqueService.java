package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.Historique;

public interface HistoriqueService {
	
	
	public List<Historique> getAllHistoriques();
	 
	 public Historique getHistoriqueById(long id);
	 
	 public void saveOrUpdate(Historique historique);
	 
}
