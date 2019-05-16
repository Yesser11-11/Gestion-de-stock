package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.BondaffectationRepository;
import com.example.demo1.model.Bondaffectation;


	
	
	@Service
	@Transactional
	public class BondaffectationServiceImpl implements BondaffectationService {
		
		@Autowired
		BondaffectationRepository bondaffectationRepository;


		@Override
		public List<Bondaffectation> FindAllBondaffectations() {
			
			return (List<Bondaffectation>) bondaffectationRepository.findAll();
		}

		@Override
		public Bondaffectation getBondaffectationById(long idbondaffectation) {
			
			return bondaffectationRepository.findById((long) idbondaffectation).get();
		}

		@Override
		public void saveOrUpdate(Bondaffectation bondaffectation) {
			bondaffectationRepository.save(bondaffectation);
			
		}

		@Override
		public void deleteBondaffectation(long idbondaffectation) {
			bondaffectationRepository.deleteById((long) idbondaffectation);
			
		}


}
