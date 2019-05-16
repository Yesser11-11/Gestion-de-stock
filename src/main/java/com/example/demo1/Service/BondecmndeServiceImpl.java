package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.BondecmndeRepository;
import com.example.demo1.model.Bondecmnde;

@Service
@Transactional
public class BondecmndeServiceImpl implements BondecmndeService {
 
 @Autowired
 BondecmndeRepository bondecmndeRepository;

 @Override
 public List<Bondecmnde> getAllBondecmndes() {
  return (List<Bondecmnde>) bondecmndeRepository.findAll();
 }

 @Override
 public Bondecmnde getBondecmndeById(long idbondecommande) {
  return bondecmndeRepository.findById(idbondecommande).get();
 }

 @Override
 public void saveOrUpdate(Bondecmnde bondecmnde) {
	 bondecmndeRepository.save(bondecmnde);
 }

 @Override
 public void deleteBondecmnde(long idbondecommande) {
	 bondecmndeRepository.deleteById(idbondecommande);
 }

}

