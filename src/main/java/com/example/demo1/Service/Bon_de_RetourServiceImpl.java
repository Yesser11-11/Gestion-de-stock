package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.Bon_de_RetourRepository;
import com.example.demo1.model.Article;
import com.example.demo1.model.BonDeRetour;


@Service
@Transactional
public class Bon_de_RetourServiceImpl implements Bon_de_RetourService {
	@Autowired
	 Bon_de_RetourRepository bonderetourRepository;

	@Override
	 public List<BonDeRetour> getAllBonDeRetours() {
	  return (List<BonDeRetour>) bonderetourRepository.findAll();
	 }

	 @Override
	 public BonDeRetour getBonDeRetourById(long idbondeRetour) {
	  return bonderetourRepository.findById((int) idbondeRetour).get();
	 }

	 @Override
	 public void saveOrUpdate(BonDeRetour BondeRetour) {
		 bonderetourRepository.save(BondeRetour);
	 }

	 @Override
	 public void deleteBonDeRetour(long idbondeRetour) {
		 ((Bon_de_RetourServiceImpl) bonderetourRepository).deleteBonDeRetour(idbondeRetour);
	 }


	}


