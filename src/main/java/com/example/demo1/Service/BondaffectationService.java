package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.Bondaffectation;

public interface BondaffectationService {
	
	
	public List<Bondaffectation> FindAllBondaffectations();
	 
	 public Bondaffectation getBondaffectationById(long idbondaffectation);
	 
	 public void saveOrUpdate(Bondaffectation bondaffectation);
	 
	 public void deleteBondaffectation(long idbondaffectation);

}
