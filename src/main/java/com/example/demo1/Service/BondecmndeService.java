package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.Bondecmnde;

public interface BondecmndeService {

 public List<Bondecmnde> getAllBondecmndes();
 
 public Bondecmnde getBondecmndeById(long idbondecommande);
 
 public void saveOrUpdate(Bondecmnde bondecmnde);
 
 public void deleteBondecmnde(long idbondecommande);
}