package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.FournisseurRepository;
import com.example.demo1.model.Fournisseur;

@Service
@Transactional
public class FournisseurServiceImpl implements FournissuerService {

	 
	 @Autowired
	 FournisseurRepository FournisseurRepository;

	 @Override
	 public List<Fournisseur> getAllFournisseurs() {
	  return (List<Fournisseur>) FournisseurRepository.findAll();
	 }

	 @Override
	 public Fournisseur getFournisseurById(long id) {
	  return FournisseurRepository.findById(id).get();
	 }

	 @Override
	 public void saveOrUpdate(Fournisseur Fournisseur) {
	  FournisseurRepository.save(Fournisseur);
	 }

	 @Override
	 public void deleteFournisseur(long id) {
	  FournisseurRepository.deleteById(id);
	 }

	
}
