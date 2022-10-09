package com.skiply.feecollection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skiply.feecollection.dao.FeeCollectionRepository;
import com.skiply.feecollection.entities.Fees;
import com.skiply.feecollection.entities.Student;

@Service
public class FeeCollectionServiceImpl implements FeeCollectionService {

	
	@Autowired
	private FeeCollectionRepository feeCollectionRepository;
	
	private Student student;
	
	private Fees fees;
	
	@Override
	public Fees collectFees(Fees fees) {
		
		return feeCollectionRepository.save(fees);
	}

	@Override
	public Fees viewReceipt(int refID) {
		// TODO Auto-generated method stub
		if (feeCollectionRepository.existsById(Long.valueOf(refID))) {
			fees = feeCollectionRepository.findById(fees.getRefID()).orElse(null);
		}
		return fees;
		
	}

}
