package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.Bon_de_SortieRepository;
import com.example.demo1.model.Bon_de_Sortie;
@Service
@Transactional
public class Bon_de_SortieServiceImpl implements Bon_de_SortieService  {
	
	@Autowired
	Bon_de_SortieRepository bon_de_SortieRepository;


	@Override
	public List<Bon_de_Sortie> FindAllBon_de_Sorties() {
		
		return (List<Bon_de_Sortie>) bon_de_SortieRepository.findAll();
	}

	@Override
	public Bon_de_Sortie getBon_de_SortieById(long idbon_de_Sortie) {
		
		return bon_de_SortieRepository.findById((long) idbon_de_Sortie).get();
	}

	@Override
	public void saveOrUpdate(Bon_de_Sortie bon_de_Sortie) {
		bon_de_SortieRepository.save(bon_de_Sortie);
		
	}

	@Override
	public void deleteBon_de_Sortie(long idBon_de_Sortie) {
		bon_de_SortieRepository.deleteById((long) idBon_de_Sortie);
		
	}

}
