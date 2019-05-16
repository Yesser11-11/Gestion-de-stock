package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.HistoriqueRepository;
import com.example.demo1.model.Historique;
@Service
@Transactional
public class HistoriqueServiceImpl implements HistoriqueService {

	@Autowired
	  private HistoriqueRepository historiqueRepository;

	 @Override
	 public List<Historique> getAllHistoriques() {
	  return (List<Historique>) historiqueRepository.findAll();
	 }

	 @Override
	 public Historique getHistoriqueById(long id) {
	  return historiqueRepository.findById((long) id).get();
	 }

	 @Override
	 public void saveOrUpdate(Historique historique) {
	  historiqueRepository.save(historique);
	 }
	 
	 
	 
	 

		
	 
	 
	 
	 
	 
	 
	 
}
